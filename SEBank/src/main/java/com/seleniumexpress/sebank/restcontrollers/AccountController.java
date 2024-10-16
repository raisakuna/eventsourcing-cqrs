package com.seleniumexpress.sebank.restcontrollers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seleniumexpress.sebank.restcontrollers.models.CreateAccountRequestModel;
import com.seleniumexpress.sebank.restcontrollers.models.CreateAccountRequestModel;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	
	@PostMapping
	public String crateAccount(@RequestBody CreateAccountRequestModel requestModel) {
		
		return "POST - account created " + requestModel.getAccountHolderName();
	
	}
	
	@GetMapping
	public String getAccountDetails() {
		
		return "GET - account info fetched ";
	
	}
	
	@PutMapping
	public String updateAccountInfo() {
		
		return "PUT - account updated ";
	
	}
	
	
	@DeleteMapping
	public String deleteAccount() {
		
		return "DELETE - account deleted";
	}

}
