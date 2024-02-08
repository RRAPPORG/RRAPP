package com.user;

class User {
	private String nickName;
	private String lastNname;
	private String secondName;
	private String middleName;
	
	public User (String nickName, String lastNname, String secondName, String middleName) {
		this.nickName = nickName;
		this.lastNname = lastNname;
		this.secondName = secondName;
		this.middleName = middleName;
	}
	
	public User (String nickName, String lastNname, String secondName) {
		this.nickName = nickName;
		this.lastNname = lastNname;
		this.secondName = secondName;
	}
}