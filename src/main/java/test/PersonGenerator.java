package test;

import data.EntityFacade;
import entity.Person;
import java.util.Random;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Peter
 */
public class PersonGenerator {
    
    EntityFacade fac;

    public PersonGenerator(EntityManagerFactory emf) {
        fac = new EntityFacade(emf);
    }
    
    String[] firstNames = {
        "Bill", "Bob", "Ray"
    };
    String[] lastNames = {
        "Thompson", "Smith", "Vance"
    };
    
    String[] emails = {
        "test@mail.com", "otherTest@mail.com"
    };
    
    Random rand = new Random();
    
    public void generate(int amount) {
        for (int i = 0; i < amount; i++) {
            Person p = new Person();
            p.setFirstName(firstNames[rand.nextInt(firstNames.length)]);
            p.setLastName(lastNames[rand.nextInt(lastNames.length)]);
            fac.createPerson(p);
        }
    }
    
    
}
