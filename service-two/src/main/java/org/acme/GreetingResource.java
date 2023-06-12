package org.acme;

import java.util.Map;

import io.vertx.core.json.Json;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/two")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        var jsonData = Map.of("message", "Quarkus Service Two🍵");

        return Response.ok(Json.encodePrettily(jsonData)).build();
    }
}
