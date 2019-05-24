package br.com.alan;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

@ApplicationPath("/resource")
public class RestService extends Application {

	public RestService() {
		BeanConfig conf = new BeanConfig();
		conf.setTitle("Payfast API");
		conf.setDescription("Pagamentos rápidos");
		conf.setVersion("1.0.0");
		conf.setHost("localhost:8080");
		conf.setBasePath("/teste-api-0.0.1-SNAPSHOTt/resource");
		conf.setSchemes(new String[] { "http" });
		conf.setResourcePackage("br.com.alan");
		conf.setScan(true);
	}

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();
		// resources.add(JacksonJavaTimeConfiguration.class);
		resources.add(TesteResource.class);

		// classes do swagger...
		resources.add(ApiListingResource.class);
		resources.add(SwaggerSerializers.class);
		return resources;
	}

}
