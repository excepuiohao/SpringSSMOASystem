package com.bean;

/**
 * @author excepuio 五险一金
 */
public class FiveRisksOneGold {

	private int FiveRisksOneGoldId;

	private int UserId;
	// 养老保险
	private float Endowment;

	// 医疗保险
	private float Medical;

	// 失业保险
	private float Unemployment;

	// 工伤保险
	private float Employment;

	// 生育保险
	private float Maternity;

	// 住房公积金
	private float Housing;

	private String PayTime;

	public float getUnemployment() {
		return Unemployment;
	}

	public int getFiveRisksOneGoldId() {
		return FiveRisksOneGoldId;
	}

	public void setFiveRisksOneGoldId(int fiveRisksOneGoldId) {
		FiveRisksOneGoldId = fiveRisksOneGoldId;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public float getEndowment() {
		return Endowment;
	}

	public void setEndowment(float endowment) {
		Endowment = endowment;
	}

	public float getMedical() {
		return Medical;
	}

	public void setMedical(float medical) {
		Medical = medical;
	}

	public float Employment() {
		return Unemployment;
	}

	public void setUnemployment(float unemployment) {
		Unemployment = unemployment;
	}

	public float getEmployment() {
		return Employment;
	}

	public void setEmployment(float employment) {
		Employment = employment;
	}

	public float getMaternity() {
		return Maternity;
	}

	public void setMaternity(float maternity) {
		Maternity = maternity;
	}

	public float getHousing() {
		return Housing;
	}

	public void setHousing(float housing) {
		Housing = housing;
	}

	public String getPayTime() {
		return PayTime;
	}

	public void setPayTime(String payTime) {
		PayTime = payTime;
	}

	@Override
	public String toString() {
		return "FiveRisksOneGold [FiveRisksOneGoldId=" + FiveRisksOneGoldId + ", UserId=" + UserId + ", Endowment="
				+ Endowment + ", Medical=" + Medical + ", Unemployment=" + Unemployment + ", Employment=" + Employment
				+ ", Maternity=" + Maternity + ", Housing=" + Housing + ", PayTime=" + PayTime + "]";
	}

	public FiveRisksOneGold(int fiveRisksOneGoldId, int userId, float endowment, float medical, float unemployment,
			float employment, float maternity, float housing, String payTime) {
		super();
		FiveRisksOneGoldId = fiveRisksOneGoldId;
		UserId = userId;
		Endowment = endowment;
		Medical = medical;
		Unemployment = unemployment;
		Employment = employment;
		Maternity = maternity;
		Housing = housing;
		PayTime = payTime;
	}

	public FiveRisksOneGold() {
		super();
		// TODO Auto-generated constructor stub
	}

}
