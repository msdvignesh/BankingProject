package com.sbi.project.layer2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component @Entity @Table(name="project_applicant")
public class Applicant {
	
	
	
	@Id
	@GeneratedValue
	@Column(name="applicant_id")
	private int applicantId;
	
	@Column(name="salutation")
	private String salutation;
	

	@Column(name="applicant_name")
	private String applicantName;
	
	@Column(name="applicant_fathername") 	
	private String applicantFatherName;
	
	@Column(name="dob")
	private LocalDate applicantBirthDate;
	
	@Column(name="gender")
	private String applicantGender;
	
	@Column(name="email")
	private String emailId;
	
	@Column(name="phone")
	private Long mobileNumber;
	
	@Column(name="aadhar")
	private Long applicantAadhar;
	
	@Column(name="pan")
	private String applicantPan;
	
	@Column(name="occupation")
	private String applicantOccupation;
	
	@Column(name="annualincome")
	private Long applicantAnnualIncome;
	
		
	@Column(name="application_status")
	private String applicationStatus;
	
	@Column(name="marital_status")
	private String married;
	
	@Column(name="address")
	private String address;
	
	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantFatherName() {
		return applicantFatherName;
	}

	public void setApplicantFatherName(String applicantFatherName) {
		this.applicantFatherName = applicantFatherName;
	}

	public LocalDate getApplicantBirthDate() {
		return applicantBirthDate;
	}

	public void setApplicantBirthDate(LocalDate applicantBirthDate) {
		this.applicantBirthDate = applicantBirthDate;
	}

	public String getApplicantGender() {
		return applicantGender;
	}

	public void setApplicantGender(String applicantGender) {
		this.applicantGender = applicantGender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Long getApplicantAadhar() {
		return applicantAadhar;
	}

	public void setApplicantAadhar(Long applicantAadhar) {
		this.applicantAadhar = applicantAadhar;
	}

	public String getApplicantPan() {
		return applicantPan;
	}

	public void setApplicantPan(String applicantPan) {
		this.applicantPan = applicantPan;
	}

	public String getApplicantOccupation() {
		return applicantOccupation;
	}

	public void setApplicantOccupation(String applicantOccupation) {
		this.applicantOccupation = applicantOccupation;
	}

	public Long getApplicantAnnualIncome() {
		return applicantAnnualIncome;
	}

	public void setApplicantAnnualIncome(Long applicantAnnualIncome) {
		this.applicantAnnualIncome = applicantAnnualIncome;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getMarried() {
		return married;
	}

	public void setMarried(String married) {
		this.married = married;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	@Override
	public String toString() {
		return "Applicant [applicantId=" + applicantId + ", salutation=" + salutation + ", applicantName="
				+ applicantName + ", applicantFatherName=" + applicantFatherName + ", applicantBirthDate="
				+ applicantBirthDate + ", applicantGender=" + applicantGender + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + ", applicantAadhar=" + applicantAadhar + ", applicantPan="
				+ applicantPan + ", applicantOccupation=" + applicantOccupation + ", applicantAnnualIncome="
				+ applicantAnnualIncome + ", applicationStatus=" + applicationStatus + ", married=" + married
				+ ", address=" + address + "]";
	}
	
	
	
}





//package com.sbi.project.layer2;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import org.springframework.stereotype.Component;
//
//@Component
//@Entity
//@Table(name="project_applicant")
//public class Applicant {
//	
//	
//	@Id
//	@GeneratedValue
//	@Column(name="applicant_id")
//	private int applicantid;
//	
//	@Column(name="applicant_name")
//	private String applicantname;
//	
//	@Column(name="application_status")
//	private String applicantstatus;
//
//	public int getApplicantid() {
//		return applicantid;
//	}
//
//	public void setApplicantid(int applicantid) {
//		this.applicantid = applicantid;
//	}
//
//	public String getApplicantname() {
//		return applicantname;
//	}
//
//	public void setApplicantname(String applicantname) {
//		this.applicantname = applicantname;
//	}
//
//	public String getApplicantstatus() {
//		return applicantstatus;
//	}
//
//	public void setApplicantstatus(String applicantstatus) {
//		this.applicantstatus = applicantstatus;
//	}
//	
//	
//}




