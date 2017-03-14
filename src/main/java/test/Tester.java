package test;

import data.EntityFacade;
import entity.Person;
import javax.persistence.Persistence;

/**
 *
 * @author Peter
 */
public class Tester {

    public static void main(String[] args) {
//        Persistence.generateSchema("pu", null);

    EntityFacade fac = new EntityFacade(Persistence.createEntityManagerFactory("pu"));
    
    Person p1 = new Person();
    p1.setFirstName("Peter");
    p1.setLastName("Thomsen");
    
    fac.createPerson(p1);
    
    }
    
}
