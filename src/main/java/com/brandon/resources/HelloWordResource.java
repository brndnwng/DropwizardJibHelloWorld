package com.brandon.resources;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@Singleton
@Produces(MediaType.APPLICATION_JSON)
public class HelloWordResource {

    @Inject
    public HelloWordResource(){

    }

    @GET
    public Response hello(){

        return Response.accepted().entity("hello").build();
    }

    @GET
    @Path("hello-world")
    public Response helloWorld(){
        return Response.accepted().entity("hello world").build();

    }

}
