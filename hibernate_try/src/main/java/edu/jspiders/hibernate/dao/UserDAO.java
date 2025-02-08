package edu.jspiders.hibernate.dao;


import edu.jspiders.hibernate.dto.UserDTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDAO {

    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;
    private static EntityTransaction entityTransaction;

    private static void openConnection()
    {
        entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
        entityManager = entityManagerFactory.createEntityManager();
        entityTransaction = entityManager.getTransaction();
    }

    private static void closeConnection()
    {
        if(entityManagerFactory != null)
        {
            entityManagerFactory.close();
        }
        if(entityManager != null)
        {
            entityManager.close();
        }
        if(entityTransaction != null && entityTransaction.isActive())
        {
            entityTransaction.rollback();
        }
    }

    protected static void saveData()
    {
        UserDTO admin = new UserDTO();

        openConnection();
        entityTransaction.begin();
        admin.setName("jayu");
        admin.setPassword("12345");
        entityManager.persist(admin);
        entityTransaction.commit();
        closeConnection();
    }


}
