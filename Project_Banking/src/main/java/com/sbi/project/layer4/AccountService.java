package com.sbi.project.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sbi.project.layer2.Account;

@Service
public interface AccountService {
		
		void openBankAccountService(Account account);

		List<Account> getAllAccounts();
		String addAccountbyapplicant(Account newAccount,int applicantid);
		void rejectApplicant(int applicantid);
		boolean checkAccountNumberAndPasswordService(int accountNumber, String password);
		Account findAccountService(int accountNumber);
		
}

