package com.gbp.webprj.model;

public class ProfileInfo {

	String nickname;
	double suggest_rate;
	double request_rate;
	
	public ProfileInfo() {
		super();
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public double getSuggest_rate() {
		return suggest_rate;
	}

	public void setSuggest_rate(double suggest_rate) {
		this.suggest_rate = suggest_rate;
	}

	public double getRequest_rate() {
		return request_rate;
	}

	public void setRequest_rate(double request_rate) {
		this.request_rate = request_rate;
	}
	
	
}
