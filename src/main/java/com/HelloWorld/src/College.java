package com.HelloWorld.src;
import java.util.*;


public class College {

	public String name;
	public String state;
	public String ACT;
	public String SAT;
	public String homepage;
	public int cost;
	public double acceptance_rate;
	public ArrayList<String> programs = new ArrayList<String>();
	
	public College() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setACT(String ACT) {
		this.ACT = ACT;
	}
	
	public void setSAT(String SAT) {
		this.SAT = SAT;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	
	public void setAcceptance(double rate) {
		this.acceptance_rate = rate;
	}
	
	public void addProgram(String program) {
		this.programs.add(program);
	}
	
	
}
