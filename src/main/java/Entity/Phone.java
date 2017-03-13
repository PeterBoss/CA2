package Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Peter
 */
@Entity
public class Phone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id //notice no generation strategy (dont know if this is correct)
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
