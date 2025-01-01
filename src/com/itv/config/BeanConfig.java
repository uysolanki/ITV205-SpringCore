package com.itv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.itv.model.Engine;

@Configuration
public class BeanConfig {
	
	@Bean
	public Engine getEngineUsingConstructor()
	{
		Engine e1=new Engine(44, "Mahindra", 2800, 40);
		return e1;
	}
	
	@Bean
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
