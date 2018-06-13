package com.airline.common;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class AirlineAbstractFactory {

	public static Object getInstance(String className) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		List<Class<?>> classes = new ArrayList<Class<?>>();
		classes = ClassFinder.find("com.airline.model");
		Class<?> c = null;
		Object instance= null;
		for(Class<?> classe : classes) {
			//System.out.println(classe.getName());
			if(classe.getName().toLowerCase().contains(className)) {
				
				c  = classe;
			}
		}
		try {
			instance = c.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 BeanInfo info = Introspector.getBeanInfo(c);
	        System.out.println("Calling setters");
	        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
	            if (pd.getWriteMethod() == null) continue;
	            System.out.println("\tSetting " + pd.getName());
	            if(!pd.getWriteMethod().getName().toLowerCase().contains("id")) {
	            		pd.getWriteMethod().invoke(instance, "Set now");
	            }
	        }
	        System.out.println("Reading the getters");
	        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
	            System.out.println("\t" + pd.getName() + " = " + pd.getReadMethod().invoke(instance));
	        }
		return instance;
	}
}
