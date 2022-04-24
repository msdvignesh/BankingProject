package com.sbi.project.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sbi.project.layer2.Account;
import com.sbi.project.layer2.Applicant;


@Repository
public interface ApplicantRepository {
	
	void createApplication(Applicant applicant);
	void modifyApplication(Applicant applicant);
	void removeApplication(int applicantId);
	Applicant findApplication(int applicantId);
	List<Applicant> findAllApplicants();
//	List<Applicant> findPendingApplication();
	List<Applicant> findRejectedApplicantRepo();
	List<Applicant> findApprovedApplicantRepo();
}
