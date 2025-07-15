package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Wish;
import com.nt.cfgs.AppConfig;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
    	Wish wmg=ctx.getBean("wish",Wish.class);
    	System.out.println(wmg.msg());
    	
    }
}
