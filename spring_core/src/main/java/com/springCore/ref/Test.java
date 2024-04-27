package com.springCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/ref/ref.xml");
 Input input1=	(Input) context.getBean("input1");
 System.out.println(input1.getLoan_id());
 System.out.println(input1.getAppl_detail().getType());
	
	}

}
