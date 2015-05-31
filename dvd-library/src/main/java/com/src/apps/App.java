package com.src.apps;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Hello world!
 *
 */
@Path("/test")
public class App 
{
    @GET
    @Path("/{param}")
    public Response testREST(@PathParam("param") String param) {
    	String output = "Hello " + param;
    	return Response.status(200).entity(output).build();
    }
}
