package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class Wish {
  @Autowired
  private LocalDateTime ldt;
  
  public String getwish(String user) {
	  int hours=ldt.getHour();
	  return user+" time is :"+hours+" now";
  }
}
