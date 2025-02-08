package edu.jayu.bank.service.impl;

import edu.jayu.bank.dto.AccountDto;

public interface AccountService {
	
	AccountDto createAccount(AccountDto accountDto);

	AccountDto getAccountById(Long id);
	
	AccountDto deposite(Long id, double amount);
}
