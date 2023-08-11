





























package com.add;

public class user {
	private Integer Uid;
	private String Uname;
	private String Upassword;
	private String Uaddress;
	private String Uemail;
	public Integer getUid() {
		return Uid;
	}
	public void setUid(Integer uid) {
		Uid = uid;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getUpassword() {
		return Upassword;
	}
	public void setUpassword(String upassword) {
		Upassword = upassword;
	}
	public String getUaddress() {
		return Uaddress;
	}
	public void setUaddress(String uaddress) {
		Uaddress = uaddress;
	}
	public String getUemail() {
		return Uemail;
	}
	public void setUemail(String uemail) {
		Uemail = uemail;
	}
	@Override
	public String toString() {
		return "user [Uid=" + Uid + ", Uname=" + Uname + ", Upassword=" + Upassword + ", Uaddress=" + Uaddress
				+ ", Uemail=" + Uemail + ", getUid()=" + getUid() + ", getUname()=" + getUname() + ", getUpassword()="
				+ getUpassword() + ", getUaddress()=" + getUaddress() + ", getUemail()=" + getUemail() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
