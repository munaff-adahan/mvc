package com.jiat.mvc.controllers;

import com.jiat.mvc.annotations.IsUser;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
@IsUser
@Path("/ac")
public class HomeController {

    @GET
    public String index(){
        System.out.println("OK");
        return "<h1>Home</h1>";
    }

}
