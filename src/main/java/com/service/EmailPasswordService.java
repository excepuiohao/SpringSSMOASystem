package com.service;

import java.util.List;

import com.bean.EmailPasswordConfirm;

public interface EmailPasswordService {
	void InsertEmailPasswordConfirm(EmailPasswordConfirm adjustSalary);

	void UpdateEmailPasswordConfirm(EmailPasswordConfirm adjustSalary);

	List<EmailPasswordConfirm> SelectEmailPasswordConfirmByStatus(String status);

	EmailPasswordConfirm SelectEmailPasswordConfirmByUserId(String UserId);
}
