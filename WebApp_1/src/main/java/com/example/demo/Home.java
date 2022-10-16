package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  
public class Home {
	
	
	@Autowired
	private InternetConnection Modem;
	
	public void display()
	{
		Modem.give_Internet();
		System.out.println("Hi");
	}
	
	//POJO class - Plain old java objects
	private String owner;
	private int doorNo;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorNo(){
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	

}
