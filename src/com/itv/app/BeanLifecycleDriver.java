package com.itv.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itv.model.Player;

public class BeanLifecycleDriver {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/bean-config.xml");
		Player p1=beanFactory.getBean("p1", Player.class);
		System.out.println(p1);
		
		AbstractApplicationContext abs=( AbstractApplicationContext) beanFactory;
		abs.registerShutdownHook();

	}

}
