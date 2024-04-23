package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/bean.xml");
		
		context.registerShutdownHook();
		Just s1 = (Just) context.getBean("s1");
		System.out.println(s1);
		
		System.out.println("-----------------------");
		JustIN p1 = (JustIN) context.getBean("p1");
		
		System.out.println(p1);
	}

}
