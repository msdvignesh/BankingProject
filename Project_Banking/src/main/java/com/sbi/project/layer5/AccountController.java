package com.sbi.project.layer5;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbi.project.layer2.Account;
import com.sbi.project.layer2.Applicant;
import com.sbi.project.layer4.AccountService;
import com.sbi.project.layer4.ApplicantService;

@CrossOrigin
@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@Autowired
	AccountService accserv;
	
	@Autowired
	ApplicantService appserv;
	
	@PostMapping("/add")
	public String addAccount(@RequestBody Account newAccount)
		{	
			newAccount.setCurrentBalance(0);
			newAccount.setPassword("Password@123");
			accserv.openBankAccountService(newAccount);
			return "Account Successfully Created";
		}

	@PostMapping("/add/{appid}")
	public String addAccountbyapplicant(@RequestBody Account newAccount,@PathVariable("appid") int applicantid)
		{	
			
			return accserv.addAccountbyapplicant(newAccount, applicantid);
		}
	
	@PutMapping("/update/{appid}")
	public void rejectApplicant(@PathVariable("appid") int applicantid)
		{	
			System.out.println("update()............");
			accserv.rejectApplicant(applicantid);
		}
	
	@RequestMapping("/getallaccount")   
	public List<Account> getAllAccounts()
	{	
		return accserv.getAllAccounts();
	}
	
	
	@RequestMapping("/getallapplicant")   
	public List<Applicant> getAllApplicant()
	{	
		return appserv.getAllApplicants();
	}
	
	@RequestMapping("/getpendingapplication")   
	public List<Applicant> getPendingApplication()
	{	
		return appserv.getPendingApplication();
	}
	
	
	
	
	@RequestMapping("/getapplicant/{apid}")   
	public Applicant getApplicant(@PathVariable("apid") int applicantidtosearch)
	{	
		
		return appserv.findApplicent(applicantidtosearch);
	}
	@RequestMapping("/checkUser/{accountno}/{password}")
	public boolean checkUser(@PathVariable("accountno") int accountNumber,@PathVariable("password") String password) {
		System.out.println("Username : "+accountNumber);
		System.out.println("Password : "+password);
		return accserv.checkAccountNumberAndPasswordService(accountNumber,password);
	}
	@RequestMapping("/viewAccount/{accountNumber}")
	public Account getAccountController(@PathVariable("accountNumber") int accountNumber) {
		
		return accserv.findAccountService(accountNumber);
	}
	
}
