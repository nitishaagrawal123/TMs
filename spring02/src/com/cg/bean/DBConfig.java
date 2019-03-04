package com.cg.bean;

public class DBConfig {
	private String driverName;
	private String url;
	private String userName;
	private String password;

	public DBConfig() {
		super();
	}

	public DBConfig(String driverName, String url, String userName, String password) {
		super();
		this.driverName = driverName;
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DBConfig [driverName=" + driverName + ", url=" + url + ", userName=" + userName + ", password="
				+ password + "]";
	}

}
