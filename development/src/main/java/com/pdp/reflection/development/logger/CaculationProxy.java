package com.pdp.reflection.development.logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.apache.log4j.Logger;

import com.pdp.reflection.development.execute.RunApp;

public class CaculationProxy implements InvocationHandler {
	private static Logger LOGGER = Logger.getLogger(CaculationProxy.class);
	private Object realObject;

	public CaculationProxy(Object realObject) {
		this.realObject = realObject;
	}

	public static Object newInstance(Object obj) {
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj
				.getClass().getInterfaces(), new CaculationProxy(obj));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result= null;
		try{
			LOGGER.info("Method '"+method.getName()+"' was called through proxy");
			result = method.invoke(realObject, args);
			LOGGER.info("Calculation result is: "+result);
		}catch(InvocationTargetException e){
			throw e.getTargetException();
		}finally{
			LOGGER.info("Methot end");
		}
		return result;
	}

}
