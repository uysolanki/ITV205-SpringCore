package com.itv.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	private int carId;
	private String mfgName;
	private String modelName;
	private int price;
	
	@Autowired
	Engine ex;

	public Car() {}
	public Car(int carId, String mfgName, String modelName, int price, Engine engine) {
		super();
		this.carId = carId;
		this.mfgName = mfgName;
		this.modelName = modelName;
		this.price = price;
		this.ex = engine;
	}
	
	public Car(int carId, String mfgName, String modelName, int price) {
		super();
		this.carId = carId;
		this.mfgName = mfgName;
		this.modelName = modelName;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", mfgName=" + mfgName + ", modelName=" + modelName + ", price=" + price
				+ ", engine=" + ex + "]";
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public void setMfgName(String mfgName) {
		this.mfgName = mfgName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setEngine(Engine engine) {
		this.ex = engine;
	}
	
	
	
	
}
