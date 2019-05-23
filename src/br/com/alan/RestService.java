package br.com.alan;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/MyRestService")
@ApplicationPath("/resource")
public class RestService extends Application{
	
	//http://localhost:8080/teste-api/resource/MyRestService/sayHello
	@GET
	@Path("/sayHello")
	public String getHelloMsg() {
		return "Funcionou Caralho";
	}
	
	//http://localhost:8080/teste-api/resource/MyRestService/echo?msg=Teste
	@GET
	@Path("/echo")
	public Response getEchoMsg(@QueryParam("msg") String msg) {
		return Response.ok("Retorno com 200 (" + msg +")").build();
	}
	
	//http://localhost:8080/teste-api/resource/MyRestService/object
	@GET
	@Path("/object")
	//@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public SimpleObject getObject() {
		return new SimpleObject(1, "Teste");
		
	}

}
