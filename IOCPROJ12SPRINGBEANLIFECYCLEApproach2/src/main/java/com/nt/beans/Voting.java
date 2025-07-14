package com.nt.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Voting implements InitializingBean,DisposableBean{
	@Value("${per.age}")
	private int age;
	@Value("${per.name}")
	private String name;
	public String msg() {
		if (age>=18) {
			return "Eligible Bro";
		}else {
			return "Not eleigible";
		}
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
System.out.println("Voting.afterPropertiesSet()");		
	}

	@Override
	public void destroy() throws Exception {
          System.out.println("Voting.destroy()");		
	}

}
