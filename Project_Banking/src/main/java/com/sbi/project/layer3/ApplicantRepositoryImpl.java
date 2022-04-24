package com.sbi.project.layer3;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sbi.project.layer2.Account;
import com.sbi.project.layer2.Applicant;

import javax.transaction.Transactional;


@Repository
public class ApplicantRepositoryImpl extends BaseRepositoryimpl implements ApplicantRepository
{
	@Transactional
	public void createApplication(Applicant applicant) {
		// TODO Auto-generated method stub
		super.persist(applicant);
	}

	@Transactional
	public void modifyApplication(Applicant applicant) {
		// TODO Auto-generated method stub
		super.merge(applicant);
	}
	
	@Transactional
	public void removeApplication(int applicantId) {
		// TODO Auto-generated method stub
		Applicant appObj = super.find(Applicant.class, applicantId);
		super.remove(appObj);
	}

	@Transactional
	public Applicant findApplication(int applicantId) {
		// TODO Auto-generated method stub
		
		return super.find(Applicant.class,applicantId);
	}

	public List<Applicant> findAllApplicants() {
		// TODO Auto-generated method stub
		return super.findAll("Applicant",Applicant.class);
	}

	@Override
	public List<Applicant> findRejectedApplicantRepo() {
		// TODO Auto-generated method stub
		TypedQuery<Applicant> rejectedApplicantQuery = getEntityManager().createQuery("Select ",Applicant.class);
		return null;
	}

	@Override
	public List<Applicant> findApprovedApplicantRepo() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<Applicant> findPendingApplication() {
//		// TODO Auto-generated method stub
//		
//		return null;
//	}

	
	
}
