package com.ratereview;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "RATE_REVIEW")
class RateReviewUser {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long rateReviewId;
	private int fromUserId;
	private int toUserid;
	private Double rate;
	private String review;
	
	public RateReviewUser(Long rateReviewId, int fromUserId, int toUserid, Double rate, String review) {
		super();
		this.rateReviewId = rateReviewId;
		this.fromUserId = fromUserId;
		this.toUserid = toUserid;
		this.rate = rate;
		this.review = review;
	}

	public Long getRateReviewId() {
		return rateReviewId;
	}

	public void setRateReviewId(Long rateReviewId) {
		this.rateReviewId = rateReviewId;
	}

	public int getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(int fromUserId) {
		this.fromUserId = fromUserId;
	}

	public int getToUserid() {
		return toUserid;
	}

	public void setToUserid(int toUserid) {
		this.toUserid = toUserid;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}
}