package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Scanner;

import com.jspiders.hibernate.dto.UserDTO1;

public class UserDAO1 {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	private  static UserDTO1 userDTO1;
	
	public static void main(String[] args) {
		
		System.out.print("java");
		userDTO1 = new UserDTO1();
		userDTO1.setId(7);
		userDTO1.setName("jayu");
		userDTO1.setRating(1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values.. 1 for saving the data 2 for modification and 3 for updataion 4 for deletion");
		int key = sc.nextInt();
		
		switch (key) {
		case 1:
			openConnection();
			entityTransaction.begin();
			entityManager.persist(userDTO1);
			entityTransaction.commit();
			closeCOnnection();
			break;
			
		case 2:
			openConnection();
			UserDTO1 userDTO2  = entityManager.find(UserDTO1.class, 1);
			entityManager.remove(userDTO2);
			closeCOnnection();
			break;
			
		case 3:
			openConnection();
			UserDTO1 usertobeupdated = entityManager.find(UserDTO1.class, 1);
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the name to be updated ");
			String name = scanner.next();
			scanner.next(name);
			if(usertobeupdated != null)
			{
				openConnection();
				entityTransaction.begin();
				usertobeupdated.setName(name);
			    entityManager.persist(usertobeupdated);
			    entityTransaction.commit();
			    closeCOnnection();
				
			}
			
			

		default:System.out.println("choose the correct option");
			break;
		}
		
	}
	
	

	
	private static void openConnection()
	{
		entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	
	}
	
	
	private static void closeCOnnection()
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
