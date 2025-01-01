package com.itv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

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


}
