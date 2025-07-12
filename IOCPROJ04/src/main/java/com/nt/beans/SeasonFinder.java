package com.nt.beans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("sf")
public class SeasonFinder {
@Autowired	
private LocalDate date;
public SeasonFinder() {
	System.out.println("SeasonFinder.SeasonFinder()");
}
public String findseason(String user) {
	int month=date.getMonthValue();
	if(month>=3 && month<=6) {
		return "Hot Summer::"+user;
	}else if(month>=7 && month<=10) {
		return "Drizlling Monsoon::"+user;
	}else {
		return "Winter Season ::"+user;
	}
}
}
