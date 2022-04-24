package com.sbi.project.layer3;

import javax.transaction.Transactional;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sbi.project.layer2.Account;
//import com.sbi.project.layer2.Applicant;

import javax.transaction.Transactional;


@Repository
public class AccountRepositoryImpl extends BaseRepositoryimpl implements AccountRepository
{
	@Transactional
	public void createAccount(Account account) {
		super.persist(account);
		
	}

	public void modifyAccount(Account account) {
		super.merge(account);
		
	}

	public void removeAccount(int acno) {
		Account accObj = super.find(Account.class, acno);
		super.remove(accObj);
		
	}

	public Account findAccount(int acno) {
		// TODO Auto-generated method stub
		return super.find(Account.class,acno);
	}

	public List<Account> findAllAccounts() {
		// TODO Auto-generated method stub
		return super.findAll("Account",Account.class);
	}
	
	
}
