package test;

import entity.InfoEntity;
import entity.Person;
import entity.Phone;
import java.util.List;

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

//    EntityFacade fac = new EntityFacade(Persistence.createEntityManagerFactory("pu"));
//    Person p = new Person();
//    p.setFirstName("Test");
//    fac.createPerson(p);
        
        PhoneGenerator phoneGen = new PhoneGenerator();
        PersonGenerator personGen = new PersonGenerator();
        
        
        List<Phone> phones = phoneGen.getGeneratedPhones(15);
        List<Person> persons = personGen.getGeneratedPersons(20);
        
        RelationshipHandler handler = new RelationshipHandler();
        
        handler.assignPhonesToPersons(phones, persons);
        
        for (Phone p : phones) {
            System.out.println(p.getEntity().getId());
        }

    }
    
}
