package com.rentalplace;

class RentalPlace {
	private int rentalPlaceId;
	private int ownerUserId;
	private String location;
	private String description;
	private Double rentalPlaceRate = -1.0;
	
	public RentalPlace(int rentalPlaceId, int ownerUserId, String location, String description,
			Double rentalPlaceRate) {
		super();
		this.rentalPlaceId = rentalPlaceId;
		this.ownerUserId = ownerUserId;
		this.location = location;
		this.description = description;
		this.rentalPlaceRate = rentalPlaceRate;
	}

	public int getRentalPlaceId() {
		return rentalPlaceId;
	}

	public void setRentalPlaceId(int rentalPlaceId) {
		this.rentalPlaceId = rentalPlaceId;
	}

	public int getOwnerUserId() {
		return ownerUserId;
	}

	public void setOwnerUserId(int ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getRentalPlaceRate() {
		return rentalPlaceRate;
	}

	public void setRentalPlaceRate(Double rentalPlaceRate) {
		this.rentalPlaceRate = rentalPlaceRate;
	}
}