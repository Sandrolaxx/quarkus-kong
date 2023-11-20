package org.acme;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/one")
public class GreetingResource {

    @ConfigProperty(name = "service-name", defaultValue = "One")
    String serviceName;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response hello() {
        return Response.ok("Quarkus Service ".concat(serviceName).concat("🧁")).build();
    }

}
