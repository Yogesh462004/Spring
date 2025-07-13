package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Customer;
import com.nt.service.ServiceImp;

@Controller("cont")
public class Controller1 {
	@Autowired
	private ServiceImp service;
	public String registerCust(Customer cust)throws Exception {
		String result=service.register(cust);
		return result;
	}

}
