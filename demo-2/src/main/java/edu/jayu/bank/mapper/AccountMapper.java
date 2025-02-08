package edu.jayu.bank.mapper;

import edu.jayu.bank.dto.AccountDto;
import edu.jayu.bank.entity.Account;

public class AccountMapper {
	
	// to convert accountDto into account jpa entity
	public static Account mapTOAccount(AccountDto accountDto)
	
	{
		Account account = new Account(
			accountDto.getId(),
			accountDto.getAccountHolderName(),
			accountDto.getBalance()
				);
	
		return account;
	}
	
	// convert account jpa to account entity
	
	public static AccountDto mapToAccountDto(Account account)
	{
		AccountDto accountDto = new AccountDto(
		
				account.getId(),
				account.getAccountHolderName(),
				account.getBalance()
		);
		return accountDto;
				
	}

}
