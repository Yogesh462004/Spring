package com.nt.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Voting {
	@Value("${per.age}")
	private int age;
	@Value("${per.name}")
	private String name;
	public String msg() {
		if (age>=18) {
			return "Eligible Bro1";
		}else {
			return "Not eleigible";
		}
	}
	@PostConstruct
	public void init() throws Exception {
System.out.println("Voting.init(1)");		
	}
     @PreDestroy
	public void destroy()  {
          System.out.println("Voting.destroy(1)");		
	}

}
