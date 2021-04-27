package com.persistent.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CUS_ID")
	private int id;
	private String name;
	private String address;
	private String number;

	public Customer() {

	}

	public Customer(int id, String name, String address, String number) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.number = number;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", number=" + number + "]";
	}

}
