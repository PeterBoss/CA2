package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import data.EntityFacade;
import entity.Company;
import java.util.List;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author PeterBoss
 */
@Path("company")
public class CompanyResource {

    @Context
    private UriInfo context;
    EntityFacade fac = new EntityFacade(Persistence.createEntityManagerFactory("pu", null));
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public CompanyResource() {
    }

    @GET
    @Path("complete")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllcompanys() {
        List<Company> companies = fac.getAllcompanies();
        return Response.status(Response.Status.OK).entity(gson.toJson(companies)).build();
    }

    @GET
    @Path("complete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCompany(@PathParam("id") int id) {
        Company company = fac.getCompany(id);
        return Response.status(Response.Status.OK).entity(gson.toJson(company)).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createCompany(String companyJSON) {
        Company company = fac.createCompany(gson.fromJson(companyJSON, Company.class));
        return Response.status(Response.Status.OK).entity(company).build();
        
    }
    
    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteCompany(@PathParam("id") int id) {
        Company company = fac.deleteCompany(id);
        return Response.status(Response.Status.OK).entity(company).build();
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response editCompany(String companyJSON) {
        Company company = fac.editCompany(gson.fromJson(companyJSON, Company.class));
        return Response.status(Response.Status.OK).entity(company).build();
    }

}
