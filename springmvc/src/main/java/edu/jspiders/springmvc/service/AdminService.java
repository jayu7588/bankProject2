package edu.jspiders.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.jspiders.springmvc.DAO.AdminDAO;
import edu.jspiders.springmvc.DTO.Admin;

@Component
public class AdminService {
	

	@Autowired
	private AdminDAO adminDao;
	
	public boolean addAdmin(String email, String password) {
		
		Admin admin = new Admin();
		admin.setEmail(email);
		admin.setPassword(password);
		try {
		adminDao.addAdmin(admin);
		return true;
		}
		catch (Exception e)
		{
			e.getMessage();
			e.printStackTrace();
			return false;
			
		}
	}

}
