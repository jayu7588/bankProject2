package edu.jayu.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jayu.bank.entity.Admin;
import edu.jayu.bank.repository.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepo adminRepo;

	public boolean addAdmin(Admin admin) {
		
		try
		{
			adminRepo.save(admin);
		}
		catch (Exception e) {
		
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		return true;
		
	}

}
