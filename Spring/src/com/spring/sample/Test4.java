package com.spring.sample;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Test4 {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("applicationContext1.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Employee2 s=(Employee2)factory.getBean("e");  
        s.show();  
          
    }  
}  
