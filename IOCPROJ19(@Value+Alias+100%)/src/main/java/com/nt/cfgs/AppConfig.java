package com.nt.cfgs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.nt")
@ImportResource(locations="com/nt/cfgs/applicationContext.xml")
public class AppConfig {
  @Autowired	
  private Environment env;
  @Value("${jdbc.url}")
  private String url;
  @Value("${jdbc.drivername}")
  private String drivername;
  @Value("${jdbc.username}")
  private String username;
  @Value("${jdbc.password}")
  private String pwd;
  @Bean
  public DriverManagerDataSource drds() {
	  DriverManagerDataSource dr=new DriverManagerDataSource();
	  dr.setDriverClassName(drivername);
	  dr.setUrl(url);
	  dr.setUsername(username);
	  dr.setPassword(pwd);
	  return dr;
  }
}
