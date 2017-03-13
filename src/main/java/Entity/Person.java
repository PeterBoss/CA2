package Entity;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Peter
 */
@Entity
public class Person extends InfoEntity implements Serializable {

    private String firstName;
    private String lastName;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    
}
