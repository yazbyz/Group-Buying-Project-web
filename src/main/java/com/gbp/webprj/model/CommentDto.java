package com.gbp.webprj.model;

public class CommentDto {

	// field
	String comment_id;
	String user_id;
	String posting_id;
	String content;
	String registeredAt;
	String updateAt;
	String status;

	// constructor
	public CommentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	// getter & setter
	public String getComment_id() {
		return comment_id;
	}

	public void setComment_id(String comment_id) {
		this.comment_id = comment_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPosting_id() {
		return posting_id;
	}

	public void setPosting_id(String posting_id) {
		this.posting_id = posting_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegisteredAt() {
		return registeredAt;
	}

	public void setRegisteredAt(String registeredAt) {
		this.registeredAt = registeredAt;
	}

	public String getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// toString
	@Override
	public String toString() {
		return "CommentDTO [comment_id=" + comment_id + ", user_id=" + user_id + ", posting_id=" + posting_id
				+ ", content=" + content + ", registeredAt=" + registeredAt + ", updateAt=" + updateAt + ", status="
				+ status + "]";
	}

}
