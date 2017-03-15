package test;

import entity.Person;
import entity.Phone;
import java.util.List;
import java.util.Random;

/**
 *
 * @author PeterBoss
 */
public class RelationshipHandler {
    
    public void assignPhonesToPersons(List<Phone> phones, List<Person> persons) {
        
        for (Phone p : phones) {
            p.setEntity(persons.get(new Random().nextInt(persons.size())));
        }
        
    }
    
}
