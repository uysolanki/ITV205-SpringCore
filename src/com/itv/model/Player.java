package com.itv.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Player //implements InitializingBean,DisposableBean
{

	private int jno;
	private String pname;
	private int rs;
	private int mp;
	
	public Player() {
		System.out.println("Player Constructor");
	}
	public int getJno() {
		return jno;
	}
	public void setJno(int jno) {
		this.jno = jno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getRs() {
		return rs;
	}
	public void setRs(int rs) {
		this.rs = rs;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	@Override
	public String toString() {
		return "Player [jno=" + jno + ", pname=" + pname + ", rs=" + rs + ", mp=" + mp + "]";
	}
	
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("Best Of Luck");
//		
//	}
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("Get Well soon");
//		
//	}
	
	@PostConstruct
	public void itvedant()
	{
		System.out.println("Good Luck!!!!!!!");
	}
	
	@PreDestroy
	public void education()
	{
		System.out.println("All the best$$$$$$$");
	}
}
