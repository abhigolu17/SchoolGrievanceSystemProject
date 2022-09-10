package com.school.grievance.model;


public class ReplyQuery {

	private String qemail;
	private String comment;
	public ReplyQuery(String qemail, String comment) {
		super();
		this.qemail = qemail;
		this.comment = comment;
	}
	public String getQemail() {
		return qemail;
	}
	public void setQemail(String qemail) {
		this.qemail = qemail;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "ReplyQuery [qemail=" + qemail + ", comment=" + comment + "]";
	}

}
