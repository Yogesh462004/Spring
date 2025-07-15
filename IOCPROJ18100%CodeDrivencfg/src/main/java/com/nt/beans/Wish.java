package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wish {
	@Autowired
	private LocalDateTime l;
	public String msg() {
		int hours=l.getHour();
		if(hours>=12) {
			return "Good afternoon"+hours;
		}else {
			return "now time is::"+hours;
		}
	}

}
