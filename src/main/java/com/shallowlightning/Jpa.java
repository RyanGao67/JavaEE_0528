package com.shallowlightning;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/company")
public class Jpa {
    @Inject
    private CompanyBoundary companyBoundary;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Company sayHello(@PathParam("id") Long id){
        return companyBoundary.findCompany(id);
    }
}
