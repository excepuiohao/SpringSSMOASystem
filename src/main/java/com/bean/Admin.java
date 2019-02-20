package com.bean;

/**
 * @author zhaohao 管理员基类
 */
public class Admin {

	private int AdminId;

	private String AdminPassword;

	private String AdminName;

	public int getAdminId() {
		return AdminId;
	}

	public void setAdminId(int adminId) {
		AdminId = adminId;
	}

	public String getAdminPassword() {
		return AdminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		AdminPassword = adminPassword;
	}

	public String getAdminName() {
		return AdminName;
	}

	public void setAdminName(String adminName) {
		AdminName = adminName;
	}

	@Override
	public String toString() {
		return "Admin [AdminId=" + AdminId + ", AdminPassword=" + AdminPassword + ", AdminName=" + AdminName + "]";
	}

	public Admin(int adminId, String adminPassword, String adminName) {
		super();
		AdminId = adminId;
		AdminPassword = adminPassword;
		AdminName = adminName;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

}
