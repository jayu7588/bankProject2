package edu.jspiders.springmvc.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import edu.jspiders.springmvc.DTO.Admin;

@Component
public class AdminDAO {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	public void addAdmin(Admin admin) {
		
		openConnection();
		entityTransaction.begin();
		entityManager.persist(admin);
		entityTransaction.commit();
		closeConnection();
		
	}
	
	private void openConnection()
	{
		entityManagerFactory = Persistence.createEntityManagerFactory("springmvc");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}
	
	private void closeConnection()
	{
		if(entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if(entityManager != null)
		{
			entityManager.close();
		}
		if(entityTransaction != null && entityTransaction.isActive()) {
			entityTransaction.rollback();
		}
	}
	
	

}
