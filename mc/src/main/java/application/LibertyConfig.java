package application;

import javax.servlet.ServletConfig;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Context;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import application.rest.OMServlet;
import application.rest.services.Pgm;
import application.rest.services.Region;
import application.rest.services.Tran;
import filters.HeaderRequestFilter;
import io.swagger.v3.jaxrs2.integration.resources.AcceptHeaderOpenApiResource;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;

@Component
@ApplicationPath("/services/")
public class LibertyConfig extends ResourceConfig{

	public LibertyConfig(@Context ServletConfig servletConfig) {
		register(OpenApiResource.class);
		register(AcceptHeaderOpenApiResource.class);
		register(Region.class);
		register(Pgm.class);
		register(Tran.class);
		register(OMServlet.class);
		register(HeaderRequestFilter.class);
	}

}
