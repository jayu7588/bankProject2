package edu.jayu.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.jayu.bank.entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{

}
