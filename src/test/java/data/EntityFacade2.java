/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entity.Person;
import entity.Phone;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruger
 */
public class EntityFacade2 {
    EntityFacade fac;
    public EntityFacade2() {
        Persistence.generateSchema("pu-test", null);
        
        
    }
    
    @Test
    public void testGetPerson() {
        
        Person p = fac.getPerson(1);
        
        assertEquals(p.getFirstName(), "Peter");
        
    }
    
    @Test
    public void test() {
        
        Phone p = fac.getPhone(1);
        fac.createPhone(p);
        
        assertEquals(p.getNumber(), "12345678");
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        fac = new EntityFacade(Persistence.createEntityManagerFactory("pu-test"));
        Person p = new Person();
        Phone phone = new Phone();
        phone.setNumber("12345678");
        p.setFirstName("Peter");
        
        fac.createPerson(p);
        fac.createPhone(phone);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
