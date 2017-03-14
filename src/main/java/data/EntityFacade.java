package data;

import entity.Address;
import entity.CityInfo;
import entity.Company;
import entity.Hobby;
import entity.Person;
import entity.Phone;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Peter
 */
public class EntityFacade {

    EntityManagerFactory emf;

    public EntityFacade(EntityManagerFactory emf) {
        this.emf = emf;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    /*
    Person CRUD
     */
    public void createPerson(Person p) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Person getPerson(int id) {
        EntityManager em = getEntityManager();
        Person person;
        try {
            person = em.find(Person.class, id);
        } finally {
            em.close();
        }
        return person;
    }

    public void editPerson(Person person) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(person);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void deletePerson(int id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(getPerson(id));
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    /*
    Company CRUD
     */
    public void createCompany(Company c) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Company getCompany(int id) {
        EntityManager em = getEntityManager();
        Company company;
        try {
            company = em.find(Company.class, id);
        } finally {
            em.close();
        }
        return company;
    }

    public void editCompany(Company company) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(company);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void deleteCompany(int id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(getCompany(id));
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    /*
    Address CRUD
     */
    public void createAddress(Address a) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Address getAddress(int id) {
        EntityManager em = getEntityManager();
        Address address;
        try {
            address = em.find(Address.class, id);
        } finally {
            em.close();
        }
        return address;
    }

    public void editAddress(Address address) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(address);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void deleteAddress(int id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(getAddress(id));
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    /*
    CityInfo CRUD
     */
    public void createCityInfo(CityInfo ci) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(ci);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public CityInfo getCityInfo(int zipCode) {
        EntityManager em = getEntityManager();
        CityInfo cityInfo;
        try {
            cityInfo = em.find(CityInfo.class, zipCode);
        } finally {
            em.close();
        }
        return cityInfo;
    }

    public void editCityInfo(CityInfo cityInfo) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(cityInfo);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void deleteCityInfo(int zipCode) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(getCityInfo(zipCode));
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    /*
    Phone CRUD
     */
    public void createPhone(Phone p) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Phone getPhone(int id) {
        EntityManager em = getEntityManager();
        Phone phone;
        try {
            phone = em.find(Phone.class, id);
        } finally {
            em.close();
        }
        return phone;
    }

    public void editPhone(Phone phone) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(phone);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void deletePhone(int id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(getPhone(id));
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    /*
    Hobby CRUD
     */
    public void createHobby(Hobby h) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(h);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Hobby getHobby(int id) {
        EntityManager em = getEntityManager();
        Hobby hobby;
        try {
            hobby = em.find(Hobby.class, id);
        } finally {
            em.close();
        }
        return hobby;
    }

    public void editHobby(Hobby hobby) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(hobby);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void deleteHobby(int id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(getHobby(id));
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

}
