package edu.jayu.bank.service.impl;


import org.springframework.stereotype.Service;

import edu.jayu.bank.dto.AccountDto;
import edu.jayu.bank.entity.Account;
import edu.jayu.bank.mapper.AccountMapper;
import edu.jayu.bank.repository.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService {

	
	private AccountRepo accountRepo;
	
	
	
	public AccountServiceImpl(AccountRepo accountRepo) {
		super();
		this.accountRepo = accountRepo;
	}



	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account = AccountMapper.mapTOAccount(accountDto);
		Account savedAccount = accountRepo.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}



	@Override
	public AccountDto getAccountById(Long id) {
		
		Account account = accountRepo.findById(id)
							.orElseThrow(()-> new RuntimeException("no account found "));
		return AccountMapper.mapToAccountDto(account);
	}



	@Override
	public AccountDto deposite(Long id, double amount) {
		
		Account account = accountRepo.findById(id)
				.orElseThrow(()-> new RuntimeException("no account found "));
		double total = account.getBalance() + amount;
		account.setBalance(total);
		
		
		Account savedAccount =  accountRepo.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}
	
	
	
	

}
