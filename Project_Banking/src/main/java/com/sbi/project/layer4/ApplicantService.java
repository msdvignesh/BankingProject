package com.sbi.project.layer4;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.sbi.project.layer2.*;

@Service
public interface ApplicantService {

	void createApplicationService(Applicant app);
	List<Applicant> getAllApplicants();
	void modifyApplication(Applicant applicant);
	void removeApplication(int applicantId);
	Applicant findApplicent(int applicantId);
	List<Applicant> getPendingApplication();
	
}
