package com.sbi.project.layer2
;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



@Component
@Entity
@Table(name="project_account")
public class Account {
	
	
	@Id
	@GeneratedValue
	@Column(name="account_number")
	private int accountnumber;
	
	@Column(name="password")
	private String password;
	
	@Column(name="current_balance")
	private float currentBalance;
	
	@OneToOne()
	@JoinColumn(name= "applicant_id")
	Applicant applicant;

	

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public float getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(float cuurentBalance) {
		this.currentBalance = cuurentBalance;
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

}
