package com.xworkz.country;

import java.io.Serializable;

public class CountryDTO implements Serializable{
	
	private	String name;
	private int Population;
	private int branches;
	private boolean goodcountry;
	
	public  CountryDTO (String name,int population,int branches,boolean goodcountry) {
		super();
		this.name=name;
		this.Population=Population;
		this.branches=branches;
		this.goodcountry=goodcountry;
		}

	public  CountryDTO() {
		System.out.println("Init  CountryDTO");
	}

	@Override
	public String toString() {
		System.out.println("Init  CountryDTO for tostring");
		return "MovieDTO [name=" + name + ",Population=" + Population + ",.branches=" + branches + ",goodcountry=" + goodcountry+  "]";
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public int getPopulation() {
		return Population;
	}

	
	public void setPopulation(int population) {
		Population = population;
	}

	
	public int isBranches() {
		return branches;
	}

	
	public void setBranches(int branches) {
		this.branches = branches;
	}

	public boolean isGoodcountry() {
		return goodcountry;
	}

	
	public void setGoodcountry(boolean goodcountry) {
		this.goodcountry = goodcountry;
	}
	

}
