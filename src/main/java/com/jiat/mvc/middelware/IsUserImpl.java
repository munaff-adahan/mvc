package com.jiat.mvc.middelware;

import com.jiat.mvc.annotations.IsUser;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.container.PreMatching;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;
import org.glassfish.jersey.server.mvc.Viewable;

import java.io.IOException;
@Provider
@IsUser
//@PreMatching
public class IsUserImpl implements ContainerRequestFilter {
    @Context
    HttpServletRequest request;
    @Context
    HttpServletResponse response;

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        HttpSession session = request.getSession();
       if(session.getAttribute("user") == null){
           System.out.println("Not Login..");
           requestContext.
                   abortWith(Response.status(Response.Status.UNAUTHORIZED)
                           .entity(new Viewable("/401"))
                           .build());
       }
    }
}
