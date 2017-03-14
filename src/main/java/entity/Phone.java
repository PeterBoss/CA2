package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Peter
 */
@Entity
public class Phone implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String number;
    private String description;

    @ManyToOne
    private InfoEntity entity;

    public Phone() {
    }

    public String getNumber() {
        return number;
    }

    public void setId(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InfoEntity getEntity() {
        return entity;
    }

    public void setEntity(InfoEntity entity) {
        this.entity = entity;
    }

}
