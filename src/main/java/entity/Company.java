package entity;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Troels
 */
@Entity
public class Company extends InfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String name;
    private String description;
    private String cvr;
    private int NumEmployees;
    private double marketValue;

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCvr() {
        return cvr;
    }

    public void setCvr(String cvr) {
        this.cvr = cvr;
    }

    public int getNumEmployees() {
        return NumEmployees;
    }

    public void setNumEmployees(int NumEmployees) {
        this.NumEmployees = NumEmployees;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }
    
   
   
    
    
   

    

 
}
