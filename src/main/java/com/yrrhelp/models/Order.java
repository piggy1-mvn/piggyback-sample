package com.yrrhelp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "orders",schema = "database1")
public class Order {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
	
	@Column(name="email")
	private String email;
	 
	@Column(name="address") 
    private String address;
	
	@Column(name="pincode") 
    private int pincode;
    
    public Order(){
    	
    }
    
    public Order(String email, String address, int pincode) {
    	this.email = email;
    	this.address= address;
    	this.pincode = pincode;
    }

    
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
    
	
}
