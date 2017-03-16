package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import data.EntityFacade;
import entity.Person;
import java.util.List;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Peter
 */
@Path("person")
public class PersonResource {

    @Context
    private UriInfo context;

    EntityFacade fac = new EntityFacade(Persistence.createEntityManagerFactory("pu", null));
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public PersonResource() {
    }

    @GET
    @Path("complete")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPersons() {
        List<Person> persons = fac.getAllPersons();
        return Response.status(Response.Status.OK).entity(gson.toJson(persons)).build();
    }

    @GET
    @Path("complete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPerson(@PathParam("id") int id) {
        Person p = fac.getPerson(id);
        return Response.status(Response.Status.OK).entity(gson.toJson(p)).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createPerson(String personJSON) {
        Person p = fac.createPerson(gson.fromJson(personJSON, Person.class));
        return Response.status(Response.Status.OK).entity(gson.toJson(p)).build();
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deletePerson(@PathParam("id") int id) {
        Person p = fac.deletePerson(id);
        return Response.status(Response.Status.OK).entity(gson.toJson(p)).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updatePerson(String personJSON) {
        Person p = gson.fromJson(personJSON, Person.class);
        p = fac.editPerson(p);
        return Response.status(Response.Status.OK).entity(gson.toJson(p)).build();
    }

}
