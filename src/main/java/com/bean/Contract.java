package com.bean;

/**
 * @author excepuio 合同基类
 */
public class Contract {

	private int ContractID;

	private String ContractContent;

	private String ContractType;

	private int UserId;

	private String ContractBeginTime;

	private String ContractEndTime;

	public int getContractID() {
		return ContractID;
	}

	public void setContractID(int contractID) {
		ContractID = contractID;
	}

	public String getContractContent() {
		return ContractContent;
	}

	public void setContractContent(String contractContent) {
		ContractContent = contractContent;
	}

	public String getContractType() {
		return ContractType;
	}

	public void setContractType(String contractType) {
		ContractType = contractType;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getContractBeginTime() {
		return ContractBeginTime;
	}

	public void setContractBeginTime(String contractBeginTime) {
		ContractBeginTime = contractBeginTime;
	}

	public String getContractEndTime() {
		return ContractEndTime;
	}

	public void setContractEndTime(String contractEndTime) {
		ContractEndTime = contractEndTime;
	}

	@Override
	public String toString() {
		return "Contract [ContractID=" + ContractID + ", ContractContent=" + ContractContent + ", ContractType="
				+ ContractType + ", UserId=" + UserId + ", ContractBeginTime=" + ContractBeginTime
				+ ", ContractEndTime=" + ContractEndTime + "]";
	}

	public Contract() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contract(int contractID, String contractContent, String contractType, int userId, String contractBeginTime,
			String contractEndTime) {
		super();
		ContractID = contractID;
		ContractContent = contractContent;
		ContractType = contractType;
		UserId = userId;
		ContractBeginTime = contractBeginTime;
		ContractEndTime = contractEndTime;
	}

}
