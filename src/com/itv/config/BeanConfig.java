package com.itv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.itv.model.Car;
import com.itv.model.Engine;

@Configuration
@ComponentScan(basePackages="com.itv.model")
public class BeanConfig {
	
	@Bean(name="apple")
	public Engine getEngineUsingConstructor()
	{
		return new Engine(44, "Mahindra", 2800, 40);

	}
	
	@Bean(name="mango")
	@Scope("prototype")
	public Engine getEngineUsingSetter()
	{
		Engine e1=new Engine();
		e1.setEngineCc(7000);
		e1.setEngineId(45);
		e1.setEngineLitre(100);
		e1.setEngineMfgName("Volvo");
		return e1;
	}
	
	@Bean(name="banana")
	@Scope("prototype")
	public Car getCarUsingSetter()
	{
		Car c1=new Car();
		c1.setCarId(1);
		//c1.setEngine(getEngineUsingConstructor());
		c1.setMfgName("Ford");
		c1.setModelName("Accord");
		c1.setPrice(1000);
		return c1;
	}


}
