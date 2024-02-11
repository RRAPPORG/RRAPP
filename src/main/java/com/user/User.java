package com.user;

import java.util.ArrayList;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "USER")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	private String nickName;
	private String firstNname;
	private String lastName;
	private String middleName = "";
	private Double tenantRate = -1.0;
	private Double landlordRate = -1.0;
	private ArrayList<Double> tenantRateList;
	private ArrayList<Double> landlordRateList;
	
	public User (Long userId, String nickName, String firstNname, String lastName, String middleName) {
		this.userId = userId;
		this.nickName = nickName;
		this.firstNname = firstNname;
		this.lastName = lastName;
		this.middleName = middleName;
	}
	
	public User (Long userId, String nickName, String firstNname, String lastName) {
		this.userId = userId;
		this.nickName = nickName;
		this.firstNname = firstNname;
		this.lastName = lastName;
	}
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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