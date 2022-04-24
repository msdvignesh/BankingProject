package com.sbi.project.layer4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.sbi.project.layer2.Account;
import com.sbi.project.layer2.Applicant;
import com.sbi.project.layer3.*;
import com.sbi.project.layer4.*;

@Service
public class ApplicantServiceImpl implements ApplicantService {
	
	
	@Autowired
	ApplicantRepository appRepo;
	
	
	@Autowired
	AccountRepository accRepo;
	
	@Override
	public void createApplicationService(Applicant app) {
		
	
		appRepo.createApplication(app);
		System.out.println("ApplicantServiceImpl.... created the Applicant");
	}


	@Override
	public List<Applicant> getAllApplicants() {
		// TODO Auto-generated method stub
		return appRepo.findAllApplicants();
	}
	
	


	@Override
	public void modifyApplication(Applicant applicant) {
		
			//Applicant applicant = appRepo.findApplication(app.getApplicantId());
			System.out.println("modifyApplicantService is called....");
			
			
			appRepo.modifyApplication(applicant);
		}
		
	


	@Override
	public void removeApplication(int applicantId) {
		// TODO Auto-generated method stub
		appRepo.removeApplication(applicantId);
	}


	@Override
	public Applicant findApplicent(int applicantId) {
		// TODO Auto-generated method stub
		return appRepo.findApplication(applicantId);
	}


	@Override
	public List<Applicant> getPendingApplication() {
		// TODO Auto-generated method stub
		List<Applicant> applicant = appRepo.findAllApplicants();
		List<Applicant> pendingapplication=new ArrayList();
	
		for (Applicant applicant1 : applicant) {
			
			String Status = applicant1.getApplicationStatus();
			if(Status.matches("APPLIED"))
			{
		
			pendingapplication.add(applicant1);
			 
			}
		}
		return pendingapplication;
	}
	
	

	
	
	
	
}
