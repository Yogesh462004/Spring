package com.nt.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value="classpath:com/nt/commons/myfile.properties")
public interface Cricketer { //can use abstract class also
  @Value("${per.jersey}")	
   static final int jersey=0;
  @Value("${per.name}")
  static final String name="";
  @Lookup
  public abstract Bat getBat();
  public default void batting() {
	  ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
       Bat b=getBat();
       System.out.println(b.runs()+" hihello");
  }
}
