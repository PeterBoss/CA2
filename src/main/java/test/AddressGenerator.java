package test;

import entity.Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author PeterBoss
 */
public class AddressGenerator {

    private final String[] STREETS = {
        "1060 West Addison Street",
        "10 Downing Street",
        "1600 Pennsylvania Avenue"
    };
    
    private final String[] INFO = {
        "some info",
        "some other info",
        "another info"
    };
    
    private final Random rand = new Random();
    
    public List<Address> getGeneratedAddresses(int amount) {
        List<Address> addresses = new ArrayList();
        for (int i = 0; i < amount; i++) {
            Address a = new Address();
            a.setStreet(STREETS[rand.nextInt(STREETS.length)]);
            a.setStreet(INFO[rand.nextInt(INFO.length)]);
        }
        return addresses;
    }
    
}
