package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Bank;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    	Bank b=ctx.getBean("bank",Bank.class);
    	b.calculateintrest(12);
    	ctx.close();

    }
}
