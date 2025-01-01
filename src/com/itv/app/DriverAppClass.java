package com.itv.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.itv.config.BeanConfig;
import com.itv.model.Engine;

public class DriverAppClass {

	public static void main(String[] args) {
//		Engine e1=new Engine(18, "Honda", 1500, 25);
//		Car c1=new Car(45,"Toyota", "Fortuner", 1500, e1);	
//		System.out.println(c1);
		
//		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/bean-config.xml");
		ApplicationContext beanFactory = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println("Bye");
		
		Engine myEngine=(Engine) beanFactory.getBean("apple");
		System.out.println(myEngine);
		
	}

}
