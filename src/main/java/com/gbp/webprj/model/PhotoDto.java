package com.gbp.webprj.model;

public class PhotoDto {

	int postingId;
	String photo_1;
	String photo_2;
	String photo_3;
	String photo_4;
	String photo_5;
	
	public PhotoDto(String photo_1, String photo_2, String photo_3, String photo_4, String photo_5) {
		super();
	}
	
	public int getPostingId() {
		return postingId;
	}
	
	public void setPostingId(int postingId) {
		this.postingId = postingId;
	}
	
	public String getPhoto_1() {
		return photo_1;
	}
	
	public void setPhoto_1(String photo_1) {
		this.photo_1 = photo_1;
	}
	
	public String getPhoto_2() {
		return photo_2;
	}
	
	public void setPhoto_2(String photo_2) {
		this.photo_2 = photo_2;
	}
	
	public String getPhoto_3() {
		return photo_3;
	}
	
	public void setPhoto_3(String photo_3) {
		this.photo_3 = photo_3;
	}
	
	public String getPhoto_4() {
		return photo_4;
	}
	
	public void setPhoto_4(String photo_4) {
		this.photo_4 = photo_4;
	}
	
	public String getPhoto_5() {
		return photo_5;
	}
	
	public void setPhoto_5(String photo_5) {
		this.photo_5 = photo_5;
	}
	
	
}
