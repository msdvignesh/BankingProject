package com.sbi.project.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.sbi.project.layer2.Account;

import com.sbi.project.layer2.Applicant;
import com.sbi.project.layer3.AccountRepository;
import com.sbi.project.layer3.ApplicantRepository;

@Service
public class AccountServiceImpl implements AccountService
{
		@Autowired
		AccountRepository accRepo;
		
	
			
			
			@Autowired
			ApplicantRepository appRepo;
			
			
			@Override
			public void openBankAccountService(Account account) {
				// TODO Auto-generated method stub
				accRepo.createAccount(account);
				
			}
			
			@Override
			public List<Account> getAllAccounts() {
				// TODO Auto-generated method stub
				return accRepo.findAllAccounts();
			}
			
			
			@Override
			public String addAccountbyapplicant(@RequestBody Account newAccount,@PathVariable("appid") int applicantid)
			{	
				newAccount.setCurrentBalance(0);
				newAccount.setPassword("Password@123");
				Applicant app1 = appRepo.findApplication(applicantid);
				app1.setApplicationStatus("Approved");
				appRepo.modifyApplication(app1);
				newAccount.setApplicant(app1);
				accRepo.createAccount(newAccount);
				return "Account Successfully Created";
			}
			
			@Override
			public void rejectApplicant(@PathVariable("appid") int applicantid)
			{	
				Applicant app1 = appRepo.findApplication(applicantid);
				app1.setApplicationStatus("Rejected");
				appRepo.modifyApplication(app1);
				
				
			}
			@Override
			public boolean checkAccountNumberAndPasswordService(int accountNumber, String password) {
				// TODO Auto-generated method stub
				Account account = accRepo.findAccount(accountNumber);
			
				if (account != null && account.getAccountnumber()==accountNumber) {
					if (account.getPassword().equals(password)) {
						System.out.println("Userid and password matches");
						return true;
					}
					return false;
				}
				else {
					System.out.println("Account does not exist");
					return false;
				}
			}
			public Account findAccountService(int accountNumber) {
				Account account = accRepo.findAccount(accountNumber);
				return account;
			}
				
}

