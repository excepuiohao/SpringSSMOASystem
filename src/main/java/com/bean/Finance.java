package com.bean;

/**
 * @author excepuio ÿîÑ’ª˘Óê
 */
public class Finance {

	private int FinanceId;

	private int ApartmentId;

	private float ApartmentMoney;

	private int FinanceMonth;

	public int getFinanceId() {
		return FinanceId;
	}

	public void setFinanceId(int financeId) {
		FinanceId = financeId;
	}

	public int getApartmentId() {
		return ApartmentId;
	}

	public void setApartmentId(int apartmentId) {
		ApartmentId = apartmentId;
	}

	public float getApartmentMoney() {
		return ApartmentMoney;
	}

	public void setApartmentMoney(float apartmentMoney) {
		ApartmentMoney = apartmentMoney;
	}

	public int getFinanceMonth() {
		return FinanceMonth;
	}

	public void setFinanceMonth(int financeMonth) {
		FinanceMonth = financeMonth;
	}

	@Override
	public String toString() {
		return "Finance [FinanceId=" + FinanceId + ", ApartmentId=" + ApartmentId + ", ApartmentMoney=" + ApartmentMoney
				+ ", FinanceMonth=" + FinanceMonth + "]";
	}

	public Finance(int financeId, int apartmentId, float apartmentMoney, int financeMonth) {
		super();
		FinanceId = financeId;
		ApartmentId = apartmentId;
		ApartmentMoney = apartmentMoney;
		FinanceMonth = financeMonth;
	}

	public Finance() {
		super();
		// TODO Auto-generated constructor stub
	}

}
