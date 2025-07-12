package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.SeasonFinder;


public class App {
    public static void main(String[] args) {
    	FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
    	Object obj=ctx.getBean("sf");
    	SeasonFinder sf1=(SeasonFinder)obj;
    	String result=sf1.findseason("Yogesh");
    	System.out.println(result);
    	ctx.close();
    }
}
