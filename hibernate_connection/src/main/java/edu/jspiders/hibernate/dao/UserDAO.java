package edu.jspiders.hibernate.dao;

import edu.jspiders.hibernate.dto.UserDTO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

// create the database and add the values to the databases;

public class UserDAO {
	
	// we have to define the methods for the actions
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public static void main(String[] args) {
		
		UserDTO userDTO = new UserDTO();
		userDTO.setMockRacting(1);
		userDTO.setName("sjfnweuo");
		userDTO.setPhone(78348743874l);
		userDTO.setPlaced(true);
		userDTO.setSkills("java javaScript c++ ui/ux express.js ejs J2EE ");
		
		System.out.println(userDTO);
		
		
		openConnection();
		entityTransaction.begin();
		entityManager.persist(userDTO);
		entityTransaction.commit();
		closeConnection();
		
	}
	
	private static void openConnection()
	{
		entityManagerFactory = Persistence.createEntityManagerFactory("test1"); // used to initialize this entityManagerFactory interface 
		// also with help of this we can create entityManagerFactory with using entityManagerFactory present in Persistence class
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

}
