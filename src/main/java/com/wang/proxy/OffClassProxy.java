package com.wang.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.wang.service.impl.OffClassMonitorServiceImpl;

public class OffClassProxy<T> implements InvocationHandler{
	
	private Object targetObj;
	
	public OffClassProxy() {
	}
	
	public OffClassProxy(T target) {
		this.targetObj = target;
	}
	
	@SuppressWarnings("unchecked")
	T  createProxy(Class<?>[] interfaces,T target){
		return	(T)Proxy.newProxyInstance(this.getClass().getClassLoader(), interfaces, /*new Handler(target)*/new OffClassProxy<T>(target));
	}
	
	
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.err.println("代理前");
		Object obj = method.invoke(this.targetObj, args);
		System.err.println("代理后");
		return obj;
	}

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		

		OffClassMonitorServiceImpl serviceImpl = new OffClassMonitorServiceImpl();
		
		System.err.println(serviceImpl.getClass().getName()+"  "+serviceImpl.getClass().getSimpleName()+" "+serviceImpl.getClass().getTypeName());
//		SelfAnnotation selfAnnotation = serviceImpl.getClass().getAnnotation(SelfAnnotation.class);
//		System.err.println(selfAnnotation.value()+" "+selfAnnotation.type()+" "+selfAnnotation.args());
		
//	   	for(Field field : serviceImpl.getClass().getDeclaredFields()) {
//	   		field.setAccessible(true);
//	   		System.err.println(field.getName()+" : "+field.get(serviceImpl));
//	   	}		
	   	
	   	for(Method method :serviceImpl.getClass().getDeclaredMethods()) {
	   		method.setAccessible(true);
	   		System.err.println(method.getName());
	   		method.getParameters();
	   		
	   		
	   	}

	   	
//	   	OffClassProxy<OffClassMonitorService> offClassProxy = new OffClassProxy<OffClassMonitorService>();
//		OffClassMonitorService offClassMonitorService = offClassProxy.createProxy(OffClassMonitorServiceImpl.class.getInterfaces(),serviceImpl);
//		offClassMonitorService.printData("good job");
	}
}
