package org.akshay.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApplication {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		/*
		 * When using class path application context the spring.xml needs to be in class path
		 * Hence We need to move it to the classpath in the src folder
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//Triangle triangle = (Triangle) factory.getBean("triangle");
		Triangle triangle = (Triangle) context.getBean("triangle");
		
		
		triangle.draw();

	}

}
