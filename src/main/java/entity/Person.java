package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author Peter
 */
@Entity
public class Person extends InfoEntity implements Serializable {

    private String firstName;
    private String lastName;

    @ManyToMany
    private List<Hobby> hobbies;

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

    public void addHobby(Hobby h) {
        hobbies.add(h);
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

}
