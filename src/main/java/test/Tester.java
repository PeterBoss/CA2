package test;

import javax.persistence.Persistence;

/**
 *
 * @author Peter
 */
public class Tester {

    public static void main(String[] args) {
        Persistence.generateSchema("pu", null);
    }
    
}
