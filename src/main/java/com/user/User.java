package com.user;

import java.util.ArrayList;

class User {
	private String nickName;
	private String firstNname;
	private String lastName;
	private String middleName = "";
	private double tenantRate = -1.0;
	private double landlordRate = -1.0;
	private ArrayList<Double> tenantRateList;
	private ArrayList<Double> landlordRateList;
	
	public User (String nickName, String firstNname, String lastName, String middleName) {
		this.nickName = nickName;
		this.firstNname = firstNname;
		this.lastName = lastName;
		this.middleName = middleName;
	}
	
	public User (String nickName, String firstNname, String lastName) {
		this.nickName = nickName;
		this.firstNname = firstNname;
		this.lastName = lastName;
	}
	
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getFirstNname() {
		return firstNname;
	}

	public void setFirstNname(String firstNname) {
		this.firstNname = firstNname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public double getTenantRate() {
		return tenantRate;
	}

	public void setTenantRate(double tenantRate) {
		this.tenantRate = tenantRate;
	}

	public double getLandlordRate() {
		return landlordRate;
	}

	public void setLandlordRate(double landlordRate) {
		this.landlordRate = landlordRate;
	}

	public ArrayList<Double> getTenantRateList() {
		return tenantRateList;
	}

	public void setTenantRateList(ArrayList<Double> tenantRateList) {
		this.tenantRateList = tenantRateList;
	}

	public ArrayList<Double> getLandlordRateList() {
		return landlordRateList;
	}

	public void setLandlordRateList(ArrayList<Double> landlordRateList) {
		this.landlordRateList = landlordRateList;
	}

	
}