package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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

    @OneToMany(mappedBy = "address")
    private List<InfoEntity> entities;

    @ManyToOne
    private CityInfo cityinfo;

    public List<InfoEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<InfoEntity> entities) {
        this.entities = entities;
    }

    public void addEntity(InfoEntity entity) {
        entities.add(entity);
    }
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
