package com.bean;

/**
 * @author excepuio 用户基类
 */
public class Users {
	private int UserId;

	private String UserName;

	private String UserSex;

	private String UserPhone;

	private String UserAddress;

	private String UserApartment;

	private int UserEmailId;

	private String EmailPassword;

	private float UserSalary;

	private int UserPMID;

	private int UserLevel;

	private String UserTime;

	private int CarId;

	public int getCarId() {
		return CarId;
	}

	public void setCarId(int carId) {
		CarId = carId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserID(int userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserSex() {
		return UserSex;
	}

	public void setUserSex(String userSex) {
		UserSex = userSex;
	}

	public String getUserPhone() {
		return UserPhone;
	}

	public void setUserPhone(String userPhone) {
		UserPhone = userPhone;
	}

	public String getUserAddress() {
		return UserAddress;
	}

	public void setUserAddress(String userAddress) {
		UserAddress = userAddress;
	}

	public String getUserApartment() {
		return UserApartment;
	}

	public void setUserApartment(String userApartment) {
		UserApartment = userApartment;
	}

	public int getUserEmailId() {
		return UserEmailId;
	}

	public void setUserEmailId(int userEmailId) {
		UserEmailId = userEmailId;
	}

	public float getUserSalary() {
		return UserSalary;
	}

	public void setUserSalary(float userSalary) {
		UserSalary = userSalary;
	}

	public int getUserPMID() {
		return UserPMID;
	}

	public void setUserPMID(int userPMID) {
		UserPMID = userPMID;
	}

	public int getUserLevel() {
		return UserLevel;
	}

	public void setUserLevel(int userLevel) {
		UserLevel = userLevel;
	}

	public String getUserTime() {
		return UserTime;
	}

	public void setUserTime(String userTime) {
		UserTime = userTime;
	}

	public String getEmailPassword() {
		return EmailPassword;
	}

	public void setEmailPassword(String emailPassword) {
		EmailPassword = emailPassword;
	}

	@Override
	public String toString() {
		return "Users [UserId=" + UserId + ", UserName=" + UserName + ", UserSex=" + UserSex + ", UserPhone="
				+ UserPhone + ", UserAddress=" + UserAddress + ", UserApartment=" + UserApartment + ", UserEmailId="
				+ UserEmailId + ", EmailPassword=" + EmailPassword + ", UserSalary=" + UserSalary + ", UserPMID="
				+ UserPMID + ", UserLevel=" + UserLevel + ", UserTime=" + UserTime + ", CarId=" + CarId + "]";
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int userId, String userName, String userSex, String userPhone, String userAddress,
			String userApartment, int userEmailId, String emailPassword, float userSalary, int userPMID, int userLevel,
			String userTime, int carId) {
		super();
		UserId = userId;
		UserName = userName;
		UserSex = userSex;
		UserPhone = userPhone;
		UserAddress = userAddress;
		UserApartment = userApartment;
		UserEmailId = userEmailId;
		EmailPassword = emailPassword;
		UserSalary = userSalary;
		UserPMID = userPMID;
		UserLevel = userLevel;
		UserTime = userTime;
		CarId = carId;
	}

}
