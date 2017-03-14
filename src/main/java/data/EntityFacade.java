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

    public Company getCompany(int cvr) {
        EntityManager em = getEntityManager();
        Company company;
        try {
            company = em.find(Company.class, cvr);
        } finally {
            em.close();
        }
        return company;
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

    public Hobby getHobby(String name) {
        EntityManager em = getEntityManager();
        Hobby hobby;
        try {
            hobby = em.find(Hobby.class, name);
        } finally {
            em.close();
        }
        return hobby;
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

    public void deleteCompany(int cvr) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(getCompany(cvr));
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

    public void deleteHobby(String name) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(getHobby(name));
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

}
