package com.nareshit.raghu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cid")
	private Integer cid;
	private String name;
	private String city;
	private Long phone;
	
	public Customer() {}

	public Customer(String name, String city, Long phone) {
		this.name = name;
		this.city = city;
		this.phone = phone;
	}
	public Customer(Integer cid, String name, String city, Long phone) {
		super();
		this.cid = cid;
		this.name = name;
		this.city = city;
		this.phone = phone;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "[" + cid + "\t" + name + "\t" + city + "\t" + phone + "]";
	}
	
}
