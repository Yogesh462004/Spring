package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value="classpath:com/nt/commons/myfile.properties")
public class Cricketer {
  @Value("${per.jersey}")	
  private int jersey;
  @Value("${per.name}")
  private String name;
  public void batting() {
	  ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
       Bat b=ctx.getBean("bat",Bat.class);
       System.out.println(b.runs());
  }
}
