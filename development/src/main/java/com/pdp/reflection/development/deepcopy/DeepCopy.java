package com.pdp.reflection.development.deepcopy;

import java.lang.reflect.Field;

public class DeepCopy {
	public static void copy(Object from, Object to) {
		Class<?> c = from.getClass();
		do {

			for (Field field : c.getDeclaredFields()) {
				field.setAccessible(true);
				try { 
					if (isPrimitive(field.getType())) {
						field.set(to, field.get(from));
					} else {
						if(field.get(from) != null){
							copy(field.get(from), field.get(to));
						}
					}
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
			c = c.getSuperclass();
		} while (c != null);
	}

	private static boolean isPrimitive(Class<?> c) { 
		return c.isPrimitive() || c == String.class || c == Integer.class;
	}
}
