package edu.jayu.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.jayu.bank.dto.AccountDto;
import edu.jayu.bank.service.impl.AccountService;


@RestController
@RequestMapping("/api/accounts")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	// add the rest api
	
	/*
	 * In Spring Boot (and Spring Framework in general), ResponseEntity<T> 
	 * is a class that represents the entire HTTP response, including the status code,
	 *  headers, and body. It is used to return a complete response from a controller method,
	 *   giving you full control over the response.
	 */
	
	@PostMapping
	public ResponseEntity<AccountDto> addAccount( @RequestBody AccountDto accountDto)
	{
		return new ResponseEntity<>(accountService.createAccount(accountDto),HttpStatus.CREATED);
	}
	
	// get account rest api
	@GetMapping("/{id}")
	public ResponseEntity<AccountDto> getAccountById( @PathVariable Long id)
	{
	   AccountDto accountDto = accountService.getAccountById(id);
	   
	   return ResponseEntity.ok(accountDto);
	}
	
	// deposite rest api 
	
	public ResponseEntity<AccountDto> deposite(Long id, )

}
