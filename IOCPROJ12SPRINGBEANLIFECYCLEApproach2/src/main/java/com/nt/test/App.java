package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Voting;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    	Voting v=ctx.getBean("voting",Voting.class);
    	String result=v.msg();
    	System.out.println(result);
    	ctx.close();

    }
}
