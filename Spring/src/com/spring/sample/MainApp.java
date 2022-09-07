package com.spring.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	   public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	     // ApplicationContext context2 = new ClassPathXmlApplicationContext("Beans.xml");
	      Test obj = (Test) context.getBean("helloWorld");
	      obj.getMessage();
	      
	   }
	}
