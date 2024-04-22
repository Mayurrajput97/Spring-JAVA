package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
//		AppliactionContext context = new ClassPathXmlApplicationContext("com/springcore/collectionsconfig.xml");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/cc.xml");
		Emp emp1 = (Emp) context.getBean("emp1");
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getPhones());

		
	}
}
