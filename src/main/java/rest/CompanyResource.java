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
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

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
    @Path("complete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCompany(@PathParam("id") int id) {
        return gson.toJson(fac.getCompany(id));
    }

       @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createCompany(String companyJSON) {
        Company c = gson.fromJson(companyJSON,Company.class);
        fac.createCompany(c);
    }

}
