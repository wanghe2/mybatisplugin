package com.wang.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handler implements InvocationHandler{
	private Object target;
	
	public Handler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.err.println("代理前1");
		
		method.invoke(this.target, args);
		System.err.println("代理后");
		return null;
	}

}
