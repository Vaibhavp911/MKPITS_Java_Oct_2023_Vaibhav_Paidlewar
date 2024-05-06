package com.mkpits.registration;

public class RegistrationModel {

	private int id;
	private String name;
	private String username;
	private String email;
	private String gender;
	private String dob;
	private String city;
	private String mobno;
	private String password;
	private String cpassword;
	
	public RegistrationModel(int id, String name, String username, String email, String gender, String dob, String city,
			String mobno, String password, String cpassword) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.city = city;
		this.mobno = mobno;
		this.password = password;
		this.cpassword = cpassword;
	}

	public RegistrationModel(String name, String username, String email, String gender, String dob, String city,
			String mobno, String password, String cpassword) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.city = city;
		this.mobno = mobno;
		this.password = password;
		this.cpassword = cpassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	@Override
	public String toString() {
		return "RegistrationModel [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email
				+ ", gender=" + gender + ", dob=" + dob + ", city=" + city + ", mobno=" + mobno + ", password="
				+ password + ", cpassword=" + cpassword + "]";
	}
	
}
