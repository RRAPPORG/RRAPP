package com.user;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.json.JSONObject;

@Entity
@Table(name = "USERS")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	@Column(unique=true)
	private String nickName;
	private String firstName;
	private String lastName;
	private String middleName = "";
	private Double tenantRate = -1.0; //TODO
	private Double landlordRate = -1.0; //TODO
	private List<Double> tenantRateList; //TODO
	private List<Double> landlordRateList; //TODO
	
	public User () {
		
	}
	
	public User (Long userId, String nickName, String firstName, String lastName, String middleName) {
		this.userId = userId;
		this.nickName = nickName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}
	
	public User (Long userId, String nickName, String firstName, String lastName) {
		this.userId = userId;
		this.nickName = nickName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public User (String nickName, String firstName, String lastName, String middleName) {
		this.nickName = nickName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public List<Double> getTenantRateList() {
		return tenantRateList;
	}

	public void setTenantRateList(List<Double> tenantRateList) {
		this.tenantRateList = tenantRateList;
	}

	public List<Double> getLandlordRateList() {
		return landlordRateList;
	}

	public void setLandlordRateList(List<Double> landlordRateList) {
		this.landlordRateList = landlordRateList;
	}

}