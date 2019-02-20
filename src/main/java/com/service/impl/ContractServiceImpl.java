package com.service.impl;

import java.util.List;

import com.bean.Contract;
import com.dao.ContractDAO;
import com.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceImpl implements ContractService {

	@Autowired
	ContractDAO contractDAO;

	@Override
	public void InsertContract(Contract contract) {
		// TODO Auto-generated method stub
		contractDAO.InsertContract(contract);
	}

	@Override
	public void DeleteContract(String contractId) {
		// TODO Auto-generated method stub
		contractDAO.DeleteContract(contractId);
	}

	@Override
	public List<Contract> SelectContractByType(String type) {
		// TODO Auto-generated method stub
		return contractDAO.SelectContractByType(type);
	}

	@Override
	public Contract SelectContractByUserId(String UserId) {
		// TODO Auto-generated method stub
		return contractDAO.SelectContractByUserId(UserId);
	}

}
