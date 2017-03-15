package test;

import entity.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Peter
 */
public class PersonGenerator {
    

    public PersonGenerator() {
    }
    
    private final String[] FIRSTNAMES = {
        "Bill", "Bob", "Ray"
    };
    private final String[] LASTNAMES = {
        "Thompson", "Smith", "Vance"
    };
    
    private final String[] EMAILS = {
        "test@mail.com", "otherTest@mail.com"
    };
    
    private Random rand = new Random();
    
    public List<Person> getGeneratedPersons(int amount) {
        List<Person> persons = new ArrayList();
        for (int i = 0; i < amount; i++) {
            Person p = new Person();
            p.setFirstName(FIRSTNAMES[rand.nextInt(FIRSTNAMES.length)]);
            p.setLastName(LASTNAMES[rand.nextInt(LASTNAMES.length)]);
            p.setEmail(EMAILS[rand.nextInt(EMAILS.length)]);
            persons.add(p);
        }
        return persons;
    }
    
    
}
