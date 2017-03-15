package test;

import entity.Phone;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Peter
 */
public class PhoneGenerator {

    public List<Phone> getGeneratedPhones(int amount) {

        List<Phone> phones = new ArrayList();

        for (int i = 0; i < amount; i++) {
            Phone p = new Phone();
            p.setDescription("test phone description");
            p.setNumber("11111111");
            p.setEntity(null);
            phones.add(p);
        }
        return phones;
    }
}
