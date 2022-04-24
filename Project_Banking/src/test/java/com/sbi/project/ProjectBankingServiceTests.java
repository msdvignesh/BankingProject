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
import com.sbi.project.layer4.AccountService;
import com.sbi.project.layer4.ApplicantService;


@SpringBootTest
class ProjectBankingServiceTests {

	@Autowired
	AccountService accServ;
	
	@Autowired
	ApplicantService appServ;
	@Test
	void addAccountServiceTest() {
		
		System.out.println("AddAccountService Testing()..");	
		Account account = new Account();
	//	account.setAccountnumber(89654123);
		account.setCurrentBalance(0);
		account.setPassword("Password@123");
		
		Applicant applicant1 = new Applicant();
		applicant1 = appServ.findApplicent(4);
		account.setApplicant(applicant1);
		accServ.openBankAccountService(account);
	
		applicant1.setApplicationStatus("Approved");
		appServ.modifyApplication(applicant1);	
		
		
	}
	
	
	@Test
	void loadAllApplicantServiceTest() {
		
		List<Applicant> allApplicants = appServ.getAllApplicants();
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
			System.out.println("Applicant ApplicationStatus   : "+applicant.getApplicationStatus());
			System.out.println("Applicant Maritial Status   : "+applicant.getMarried());
			System.out.println("Applicant address     		: "+applicant.getAddress());
					
			System.out.println("=====================================");
		}
	
	
}
	
	@Test
	public void changeApplicantStatusTest() {
		
		List<Applicant> applicant = appServ.getAllApplicants();
		
		for (Applicant applicant2 : applicant) {
			if(applicant2.getApplicantId()==144) {
				applicant2.setApplicationStatus("Approved");
				appServ.modifyApplication(applicant2);
				break;
			}
		}
	
}
	
	@Test
	public void findPendingApplicationTest() {
		
		List<Applicant> applicant = appServ.getAllApplicants();
		System.out.println("Size of Array" +applicant.size());
	//	List<Applicant> pendingList = null;
		for (Applicant applicant2 : applicant) {
		
			String Status = applicant2.getApplicationStatus();
			if(Status.matches("APPLIED")) {
				System.out.println("Applicant Id        		 : "+applicant2.getApplicantId());
				System.out.println("Account salutation        	 :  "+applicant2.getSalutation());
				System.out.println("Applicant applicantName      : "+applicant2.getApplicantName());
				System.out.println("Applicant applicantFatherName: "+applicant2.getApplicantFatherName());
				System.out.println("Applicant applicantBirthDate : "+applicant2.getApplicantBirthDate());
				System.out.println("Applicant applicantGender    : "+applicant2.getApplicantGender());
				System.out.println("Applicant emailId     		 : "+applicant2.getEmailId());
				System.out.println("Applicant mobileNumber       : "+applicant2.getMobileNumber());
				System.out.println("Applicant applicantAadhar    : "+applicant2.getApplicantAadhar());
				System.out.println("Applicant applicantPan       : "+applicant2.getApplicantPan());
				System.out.println("Applicant applicantOccupation : "+applicant2.getApplicantOccupation());
				System.out.println("Applicant applicantAnnualIncome: "+applicant2.getApplicantAnnualIncome());
				System.out.println("Applicant ApplicationStatus   : "+applicant2.getApplicationStatus());
				System.out.println("Applicant Maritial Status   : "+applicant2.getMarried());
				System.out.println("Applicant address     		: "+applicant2.getAddress());
						
				System.out.println("=====================================");
			}
		}
		
	
	}
	
	
	@Test
	void loadApplicantByIdTest() {

			Applicant applicant = appServ.findApplicent(5);
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
	void findAccountServiceTest() {
		Account account =accServ.findAccountService(1001);
		Assertions.assertTrue(account!=null);  
		
		System.out.println("Account number :"+account.getAccountnumber());
		System.out.println("Balance : "+account.getCurrentBalance());
		account = accServ.findAccountService(1000);
		Assertions.assertFalse(account!=null);
	}
	
}
