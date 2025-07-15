package com.nt.cfgs;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt")
public class AppConfig {
@Bean	
public LocalDateTime ldt() {
	return LocalDateTime.now();
}
}
