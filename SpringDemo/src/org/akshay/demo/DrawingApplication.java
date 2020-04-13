package org.akshay.demo;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;


public class DrawingApplication {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		/*
		 * When using class path application context the spring.xml needs to be in class path
		 * Hence We need to move it to the classpath in the src folder
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Getting the Triangle Bean in the Main Application now");
		//Triangle triangle = (Triangle) factory.getBean("triangle");
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		
		
		triangle.draw();

	}

}
