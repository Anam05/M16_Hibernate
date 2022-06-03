package com.tns.association;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;


@Entity
@Table(name="Address1")
public class Address implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@Column(name="ID")
	
	private int AddressId;
	@Column(name="Street")
	private String street;
	@Column(name="City")
	private String city;
	@Column(name="State")
	private String State;
	@Column(name="ZipCode")
	private String zipcode;
	
	public Address() {
		
	}

	public Address(int addressId, String street, String city, String state, String zipcode) {
		super();
		this.AddressId = addressId;
		this.street = street;
		this.city = city;
		this.State = state;
		this.zipcode = zipcode;
	}

	public int getAddressId() {
		return AddressId;
	}

	public void setAddressId(int addressId) {
		this.AddressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		this.State = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [AddressId=" + AddressId + ", street=" + street + ", city=" + city + ", State=" + State
				+ ", zipcode=" + zipcode + "]";
	}
	
	

}
