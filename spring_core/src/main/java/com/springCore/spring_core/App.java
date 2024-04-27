package com.springCore.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       ApplicationContext contex= new ClassPathXmlApplicationContext("config.xml");
      Students student1=(Students) contex.getBean("student1");
      Students student2=(Students) contex.getBean("student2");
      //System.out.println(student1.getStudentId());
     System.out.println(student1);
     System.out.println(student2);
     
      
    }
}
