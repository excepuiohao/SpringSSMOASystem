package com.bean;

/**
 * @author excepuio 工资基类
 */
public class Salary {
	private int SalaryId;

	private int UserID;
	// 员工底薪
	private float UserBaseSalary;
	// 员工考勤
	private float UserAttence;
	// 员工补贴
	private float UserCompensate;
	// 员工商保
	private float UserSubsidy;
	//员工五险一金
	private float FiveRiskOneGold;
	//员工实际所得工资
	private float UserGetSalary;
	

	private String GrantTime;

	private String SalaryMonth;

	public int getSalaryId() {
		return SalaryId;
	}

	public void setSalaryId(int salaryId) {
		SalaryId = salaryId;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public float getUserBaseSalary() {
		return UserBaseSalary;
	}

	public void setUserBaseSalary(float userBaseSalary) {
		UserBaseSalary = userBaseSalary;
	}

	public float getUserAttence() {
		return UserAttence;
	}

	public void setUserAttence(float userAttence) {
		UserAttence = userAttence;
	}

	public float getUserCompensate() {
		return UserCompensate;
	}

	public void setUserCompensate(float userCompensate) {
		UserCompensate = userCompensate;
	}

	public float getUserSubsidy() {
		return UserSubsidy;
	}

	public void setUserSubsidy(float userSubsidy) {
		UserSubsidy = userSubsidy;
	}

	public String getGrantTime() {
		return GrantTime;
	}

	public void setGrantTime(String grantTime) {
		GrantTime = grantTime;
	}

	public String getSalaryMonth() {
		return SalaryMonth;
	}

	public void setSalaryMonth(String salaryMonth) {
		SalaryMonth = salaryMonth;
	}

	

	public float getFiveRiskOneGold() {
		return FiveRiskOneGold;
	}

	public void setFiveRiskOneGold(float fiveRiskOneGold) {
		FiveRiskOneGold = fiveRiskOneGold;
	}

	public float getUserGetSalary() {
		return UserGetSalary;
	}

	public void setUserGetSalary(float userGetSalary) {
		UserGetSalary = userGetSalary;
	}

	
	@Override
	public String toString() {
		return "Salary [SalaryId=" + SalaryId + ", UserID=" + UserID + ", UserBaseSalary=" + UserBaseSalary
				+ ", UserAttence=" + UserAttence + ", UserCompensate=" + UserCompensate + ", UserSubsidy=" + UserSubsidy
				+ ", FiveRiskOneGold=" + FiveRiskOneGold + ", UserGetSalary=" + UserGetSalary + ", GrantTime="
				+ GrantTime + ", SalaryMonth=" + SalaryMonth + "]";
	}

	public Salary(int salaryId, int userID, float userBaseSalary, float userAttence, float userCompensate,
			float userSubsidy, float fiveRiskOneGold, float userGetSalary, String grantTime, String salaryMonth) {
		super();
		SalaryId = salaryId;
		UserID = userID;
		UserBaseSalary = userBaseSalary;
		UserAttence = userAttence;
		UserCompensate = userCompensate;
		UserSubsidy = userSubsidy;
		FiveRiskOneGold = fiveRiskOneGold;
		UserGetSalary = userGetSalary;
		GrantTime = grantTime;
		SalaryMonth = salaryMonth;
	}

	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}

}
