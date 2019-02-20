package com.bean;

/**
 * @author excepuio 部门对应人员基类
 */
public class ApartmentUser {

	int ApartmentUserId;

	int ApartmentId;

	int UserId;

	public int getApartmentUserId() {
		return ApartmentUserId;
	}

	public void setApartmentUserId(int apartmentUserId) {
		ApartmentUserId = apartmentUserId;
	}

	public int getApartmentId() {
		return ApartmentId;
	}

	public void setApartmentId(int apartmentId) {
		ApartmentId = apartmentId;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public ApartmentUser(int apartmentUserId, int apartmentId, int userId) {
		super();
		ApartmentUserId = apartmentUserId;
		ApartmentId = apartmentId;
		UserId = userId;
	}

	public ApartmentUser() {
		super();
		// TODO Auto-generated constructor stub
	}

}
