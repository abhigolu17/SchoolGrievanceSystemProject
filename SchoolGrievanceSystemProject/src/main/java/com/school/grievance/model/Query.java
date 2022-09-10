package com.school.grievance.model;

import org.springframework.data.annotation.Id;

public class Query {
	
	@Id
	private String email;
	private String fname;
	private String surname;
	private String need;
	private String message;
	
	public Query(String fname, String surname, String email, String need, String message) {
		super();
		this.fname = fname;
		this.surname = surname;
		this.email = email;
		this.need = need;
		this.message = message;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNeed() {
		return need;
	}
	public void setNeed(String need) {
		this.need = need;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Query [fname=" + fname + ", surname=" + surname + ", email=" + email + ", need=" + need + ", message="
				+ message + "]";
	}
	
}
