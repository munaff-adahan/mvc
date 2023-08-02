package com.jiat.mvc.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

@Path("/user")
public class UserController {
    @GET
    @Path("/{id}")
     public String get(@PathParam("id") Long id){
     return id.toString();

}

}
