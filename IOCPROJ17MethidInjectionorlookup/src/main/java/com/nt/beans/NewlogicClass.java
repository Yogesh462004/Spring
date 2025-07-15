package com.nt.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewlogicClass implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("NewlogicClass.reimplement()");
		return 7.5;
	}

}
