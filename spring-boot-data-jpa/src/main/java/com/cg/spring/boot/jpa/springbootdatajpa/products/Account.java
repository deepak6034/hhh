package com.cg.spring.boot.jpa.springbootdatajpa.products;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Account {

	@Id
	private int acccountNumber;
	private int balance;
	
	@JoinColumn(name = "user_id")
	private long userid;
	
	 Account() {};
	 
		
		
	public int getAcccountNumber() {
		return acccountNumber;
	}
	public void setAcccountNumber(int acccountNumber) {
		this.acccountNumber = acccountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}



	public long getUserid() {
		return userid;
	}



	public void setUserid(long userid) {
		this.userid = userid;
	}
	
}
