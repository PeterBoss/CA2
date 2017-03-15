package test;

import com.google.gson.Gson;
import data.EntityFacade;
import entity.Person;
import javax.persistence.Persistence;

/**
 *
 * @author Peter
 */
public class Tester {

    public static void main(String[] args) {
//
//        String str = "{\"firstName\" : \"Peter\" , \"lastName\" : \"Thomsen\" }";
//        Gson gson = new Gson();
//        Person p = gson.fromJson(str, Person.class);
//        System.out.println(p.getFirstName());
//        

    PersonGenerator pgen = new PersonGenerator(Persistence.createEntityManagerFactory("pu"));
    pgen.generate(10);

//    EntityFacade fac = new EntityFacade(Persistence.createEntityManagerFactory("pu"));
//    Person p = new Person();
//    p.setFirstName("Test");
//    fac.createPerson(p);

    }
    
}
