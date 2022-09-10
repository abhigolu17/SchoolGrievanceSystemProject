package com.school.grievance.model;

import org.springframework.data.annotation.Id;

public class Student {
	
	@Id
	private Integer sid;
    private String sfname;
    private String slname;
    private String sgender;
    private String semail;
    private String saddress;
    private String spincode;
    private String spassword;
    
	public Student(Integer sid, String sfname, String slname, String sgender, String semail, String saddress,
			String spincode, String spassword) {
		super();
		this.sid = sid;
		this.sfname = sfname;
		this.slname = slname;
		this.sgender = sgender;
		this.semail = semail;
		this.saddress = saddress;
		this.spincode = spincode;
		this.spassword = spassword;
	}
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSfname() {
		return sfname;
	}
	public void setSfname(String sfname) {
		this.sfname = sfname;
	}
	public String getSlname() {
		return slname;
	}
	public void setSlname(String slname) {
		this.slname = slname;
	}
	public String getSgender() {
		return sgender;
	}
	public void setSgender(String sgender) {
		this.sgender = sgender;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String getSpincode() {
		return spincode;
	}
	public void setSpincode(String spincode) {
		this.spincode = spincode;
	}
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sfname=" + sfname + ", slname=" + slname + ", sgender=" + sgender
				+ ", semail=" + semail + ", saddress=" + saddress + ", spincode=" + spincode + ", spassword="
				+ spassword + "]";
	}   
}
