package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Wish;

public class MainApp {

	public static void main(String[] args) {
     FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
     Object obj=ctx.getBean("wmg");
     Wish w=(Wish)obj;
     String result=w.getwish("YogeshBro");
     System.out.println(result);
	}

}
