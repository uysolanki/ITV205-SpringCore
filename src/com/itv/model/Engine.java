package com.itv.model;

public class Engine {
	
	private int engineId;
	private String engineMfgName;
	private int engineCc;
	private int engineLitre;
	
	
	public Engine() {}
	public Engine(int engineId, String engineMfgName, int engineCc, int engineLitre) {
		
		this.engineId = engineId;
		this.engineMfgName = engineMfgName;
		this.engineCc = engineCc;
		this.engineLitre = engineLitre;
	}
	public int getEngineId() {
		return engineId;
	}
	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}
	public String getEngineMfgName() {
		return engineMfgName;
	}
	public void setEngineMfgName(String engineMfgName) {
		this.engineMfgName = engineMfgName;
	}
	public int getEngineCc() {
		return engineCc;
	}
	public void setEngineCc(int engineCc) {
		this.engineCc = engineCc;
	}
	public int getEngineLitre() {
		return engineLitre;
	}
	public void setEngineLitre(int engineLitre) {
		this.engineLitre = engineLitre;
	}
	
	
	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", engineMfgName=" + engineMfgName + ", engineCc=" + engineCc
				+ ", engineLitre=" + engineLitre + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
