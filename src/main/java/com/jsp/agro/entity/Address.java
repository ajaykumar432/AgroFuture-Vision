package com.jsp.agro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Entity
@Data
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	private String houseNum;
	private String street;
	private String landmark;
	private String mandal;
	private String district;
	private String state;
	private int pincode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", houseNum=" + houseNum + ", street=" + street + ", landmark=" + landmark
				+ ", mandal=" + mandal + ", district=" + district + ", state=" + state + ", pincode=" + pincode + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int id, String houseNum, String street, String landmark, String mandal, String district,
			String state, int pincode) {
		super();
		this.id = id;
		this.houseNum = houseNum;
		this.street = street;
		this.landmark = landmark;
		this.mandal = mandal;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}
	
	
}
