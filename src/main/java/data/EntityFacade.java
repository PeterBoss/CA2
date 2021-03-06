package data;

import entity.Address;
import entity.CityInfo;
import entity.Company;
import entity.Hobby;
import entity.Person;
import entity.Phone;
import java.util.List;
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
    public Person createPerson(Person p) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return p;
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

    public List<Person> getAllPersons() {
        EntityManager em = getEntityManager();
        List<Person> persons;
        try {
            persons = em.createQuery("SELECT p FROM Person p").getResultList();
        } finally {
            em.close();
        }
        return persons;
    }

    public Person editPerson(Person person) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(person);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return person;
    }

    public Person deletePerson(int id) {
        EntityManager em = getEntityManager();
        Person p;
        try {
            em.getTransaction().begin();
            p = em.find(Person.class, id);
            em.remove(p);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return p;
    }

    /*
    Company CRUD
     */
    public Company createCompany(Company c) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return c;
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

    public Company editCompany(Company company) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(company);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return company;
    }

    public List<Company> getAllcompanies() {
        EntityManager em = getEntityManager();
        List<Company> companies;
        try {
            companies = em.createQuery("SELECT c FROM Company c").getResultList();
        } finally {
            em.close();
        }
        return companies;

    }

    public Company deleteCompany(int id) {
        EntityManager em = getEntityManager();
        Company company;
        try {
            em.getTransaction().begin();
            company = em.find(Company.class, id);
            em.remove(company);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return company;
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
