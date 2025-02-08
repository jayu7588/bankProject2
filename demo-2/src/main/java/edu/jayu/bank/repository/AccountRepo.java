package edu.jayu.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jayu.bank.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Long> {

}
