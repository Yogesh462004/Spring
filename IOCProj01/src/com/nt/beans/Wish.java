package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class Wish {
	
  private LocalDateTime ldt;
  @Autowired
  public void setDateTime(LocalDateTime ldt) {
	  System.out.println("Wish.setDateTime()");
	  this.ldt=ldt;
  }
  public String getwish(String user) {
	  int hours=ldt.getHour();
	  return user+" time is :"+hours+" now";
  }
}
