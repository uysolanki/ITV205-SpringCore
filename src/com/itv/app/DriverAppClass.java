package com.itv.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itv.model.Car;

public class DriverAppClass {

	public static void main(String[] args) {
//		Engine e1=new Engine(18, "Honda", 1500, 25);
//		Car c1=new Car(45,"Toyota", "Fortuner", 1500, e1);	
//		System.out.println(c1);
		
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/bean-config.xml");
		Car myCar=(Car) beanFactory.getBean("c2");
		System.out.println(myCar);
		
	}

}
