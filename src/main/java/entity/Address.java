package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Troels
 */
@Entity
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String street;
    private String AdditionalInfo;

    @ManyToOne
    private InfoEntity entity;

    public InfoEntity getEntity() {
        return entity;
    }

    public void setEntity(InfoEntity entity) {
        this.entity = entity;
    }

    @ManyToOne
    private CityInfo cityinfo;

    public Address(CityInfo cityinfo) {
        this.cityinfo = cityinfo;
    }

    public CityInfo getCityinfo() {
        return cityinfo;
    }

    public void setCityinfo(CityInfo cityinfo) {
        this.cityinfo = cityinfo;
    }

    public Address() {
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setAdditionalInfo(String AdditionalInfo) {
        this.AdditionalInfo = AdditionalInfo;
    }

    public String getStreet() {
        return street;
    }

    public String getAdditionalInfo() {
        return AdditionalInfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
