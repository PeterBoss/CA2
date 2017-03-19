/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import com.google.gson.Gson;
import entity.Person;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static org.hamcrest.Matchers.*;
import org.junit.Ignore;

/**
 *
 * @author Dennis
 */
public class PersonTest {

    public static Response response;
    public static String jsonAsString;
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    private EntityFacade cf = new EntityFacade(emf);
    private Gson gson = new Gson();
    private Person testPerson;
    private Integer testPersonId;

    public PersonTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8084;
        RestAssured.basePath = "/CA2";
        RestAssured.defaultParser = Parser.JSON;
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        testPerson = new Person();
        testPerson.setFirstName("John");
        testPerson.setLastName("Hansen");
        testPerson = cf.createPerson(testPerson);
        testPersonId = testPerson.getId();

    }

    @After
    public void tearDown() {
        cf.deletePerson(testPersonId);
    }

    @Ignore
    @Test
    public void testGetAllPersons() {
        response = given().when().
                get("api/person/complete").then().
                statusCode(200).
                extract().response();

        //jsonAsString = response.asString();
        //System.out.println(jsonAsString);
    }

    @Ignore
    @Test
    public void postExample() {

        Response r = given()
                .contentType("application/json").
                body("{\"firstName\":\"Jimi\"}").
                when().
                post("api/person/").
                then().assertThat()
                .body("firstName", equalTo("Jimi"))
                .extract().response();

        String body = r.getBody().asString();
        System.out.println(body);

    }

    @Ignore
    @Test
    public void testGetPersonComplete() {
        given().pathParam("id", testPersonId).when().get("api/person/complete/{id}").then().
                statusCode(200).body("firstName", equalTo(testPerson.getFirstName()));

    }

    @Ignore
    @Test
    public void testDeletePerson() {
        given().pathParam("id", testPersonId).when().delete("api/person/{id}").then().
                statusCode(200).body("firstName", equalTo(testPerson.getFirstName()));

    }

    @Ignore
    @Test
    public void serverIsRunning() {

        given().when().get().then().statusCode(200);
    }
}
