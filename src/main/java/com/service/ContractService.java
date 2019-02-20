package com.service;

import java.util.List;

import com.bean.Contract;

public interface ContractService {
	void InsertContract(Contract contract);

	void DeleteContract(String contractId);

	List<Contract> SelectContractByType(String type);

	Contract SelectContractByUserId(String UserId);
}
