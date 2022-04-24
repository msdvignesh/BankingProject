package com.sbi.project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sbi.project.layer2.Account;

import com.sbi.project.layer2.Applicant;
import com.sbi.project.layer3.AccountRepository;
import com.sbi.project.layer3.ApplicantRepository;
import com.sbi.project.layer4.AccountService;


@SpringBootTest
class ProjectBankingRepositoryTests {

	@Autowired
	AccountRepository accRepo;
	
	@Autowired
	ApplicantRepository appRepo;
	
	@Test
	void addAccountTest() {
	System.out.println("AddAccountRepository Testing()..");	
	Account account = new Account();
	account.setCurrentBalance(0);
	account.setPassword("Password@123");
	Applicant applicant1 = new Applicant();
	applicant1 = appRepo.findApplication(104);
	account.setApplicant(applicant1);
	accRepo.createAccount(account);
	applicant1.setApplicationStatus("Approved");
	appRepo.modifyApplication(applicant1);	
	}
	


@Test
void loadAllApplicantTest() {
	
	List<Applicant> allApplicants = appRepo.findAllApplicants();
	System.out.println("all applicant size "+allApplicants.size());
	
	for (Applicant applicant : allApplicants) {
		System.out.println("Applicant Id        		 : "+applicant.getApplicantId());
		System.out.println("Account salutation        	 :  "+applicant.getSalutation());
		System.out.println("Applicant applicantName      : "+applicant.getApplicantName());
		System.out.println("Applicant applicantFatherName: "+applicant.getApplicantFatherName());
		System.out.println("Applicant applicantBirthDate : "+applicant.getApplicantBirthDate());
		System.out.println("Applicant applicantGender    : "+applicant.getApplicantGender());
		System.out.println("Applicant emailId     		 : "+applicant.getEmailId());
		System.out.println("Applicant mobileNumber       : "+applicant.getMobileNumber());
		System.out.println("Applicant applicantAadhar    : "+applicant.getApplicantAadhar());
		System.out.println("Applicant applicantPan       : "+applicant.getApplicantPan());
		System.out.println("Applicant applicantOccupation : "+applicant.getApplicantOccupation());
		System.out.println("Applicant applicantAnnualIncome: "+applicant.getApplicantAnnualIncome());
		System.out.println("Applicant married     		: "+applicant.getApplicationStatus());
		System.out.println("Applicant address     		: "+applicant.getAddress());
				
		System.out.println("=====================================");
	}
}

		@Test
		void loadApplicantByIdTest() {
	
				Applicant applicant = appRepo.findApplication(3);
				Assertions.assertTrue(applicant!=null);
	
				System.out.println("Applicant Id        		 : "+applicant.getApplicantId());
				System.out.println("Account salutation        	 :  "+applicant.getSalutation());
				System.out.println("Applicant applicantName      : "+applicant.getApplicantName());
				System.out.println("Applicant applicantFatherName: "+applicant.getApplicantFatherName());
				System.out.println("Applicant applicantBirthDate : "+applicant.getApplicantBirthDate());
				System.out.println("Applicant applicantGender    : "+applicant.getApplicantGender());
				System.out.println("Applicant emailId     		 : "+applicant.getEmailId());
				System.out.println("Applicant mobileNumber       : "+applicant.getMobileNumber());
				System.out.println("Applicant applicantAadhar    : "+applicant.getApplicantAadhar());
				System.out.println("Applicant applicantPan       : "+applicant.getApplicantPan());
				System.out.println("Applicant applicantOccupation : "+applicant.getApplicantOccupation());
				System.out.println("Applicant applicantAnnualIncome: "+applicant.getApplicantAnnualIncome());
				System.out.println("Applicant married     		: "+applicant.getApplicationStatus());
				System.out.println("Applicant address     		: "+applicant.getAddress());
						
				System.out.println("=====================================");
				}
		
		@Test
		void findAccountRepoTest() {
			Account account = accRepo.findAccount(1001);
			Assertions.assertTrue(account!=null);
			System.out.println("Account number : "+account.getAccountnumber());
			System.out.println("Balance : "+account.getCurrentBalance());
			System.out.println("Password  :"+account.getPassword());
			account = accRepo.findAccount(1000);
			Assertions.assertFalse(account!=null);
			
		}
		
	}





