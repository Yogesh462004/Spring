package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.Dao;
import com.nt.model.Customer;

@Service("serv")
public class ServiceImp implements Service1 {
	@Autowired
	@Qualifier("daomysql")
	private Dao dao;

	@Override
	public String register(Customer cust) throws Exception {
		double discountAmount=(cust.getBill()*(cust.getDiscount()/100.0));
		double finalamount=cust.getBill()-discountAmount;
		cust.setAmount((float) finalamount);
		int count=dao.insert(cust);
		return count==0?"Customer Registration Failed":"Customer Registered having BillAmount:"+cust.getBill();
	}

	
	

	
}
