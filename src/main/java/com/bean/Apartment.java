package com.bean;

/**
 * @author excepuio ≤ø√≈
 */
public class Apartment {
	private int ApartmentId;

	private String ApartmentName;

	private int ApartmentPMId;

	private String ApartmentExplain;

	public int getApartmentId() {
		return ApartmentId;
	}

	public void setApartmentId(int apartmentId) {
		ApartmentId = apartmentId;
	}

	public String getApartmentName() {
		return ApartmentName;
	}

	public void setApartmentName(String apartmentName) {
		ApartmentName = apartmentName;
	}

	public int getApartmentPMId() {
		return ApartmentPMId;
	}

	public void setApartmentPMId(int apartmentPMId) {
		ApartmentPMId = apartmentPMId;
	}

	public String getApartmentExplain() {
		return ApartmentExplain;
	}

	public void setApartmentExplain(String apartmentExplain) {
		ApartmentExplain = apartmentExplain;
	}

	@Override
	public String toString() {
		return "Apartment [ApartmentId=" + ApartmentId + ", ApartmentName=" + ApartmentName + ", ApartmentPMId="
				+ ApartmentPMId + ", ApartmentExplain=" + ApartmentExplain + "]";
	}

	public Apartment(int apartmentId, String apartmentName, int apartmentPMId, String apartmentExplain) {
		super();
		ApartmentId = apartmentId;
		ApartmentName = apartmentName;
		ApartmentPMId = apartmentPMId;
		ApartmentExplain = apartmentExplain;
	}

	public Apartment() {
		super();
		// TODO Auto-generated constructor stub
	}

}
