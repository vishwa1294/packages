package com.xworkz.movies;

import java.io.Serializable;

public class MovieDTO implements  Serializable{
	private	String name;
	private int noOfTickets;
	private boolean moviehit;
	private boolean ticketsavailable;
	private boolean goodstory;
	
	public MovieDTO (String name,int noOfTickets,boolean moviehit ,boolean ticketsavailable,boolean goodstory) {
		super();
		this.name=name;
		this.noOfTickets=noOfTickets;
		this.moviehit=moviehit;
		this.ticketsavailable=ticketsavailable;
		this.goodstory=goodstory;
	}

	public MovieDTO() {
		System.out.println("Init MovieDTO");
	}

	@Override
	public String toString() {
		System.out.println("Init MovieDTO for tostring");
		return "MovieDTO [name=" + name + ",noOfTickets=" + noOfTickets + ",moviehit=" + moviehit + ",ticketsavailable=" + ticketsavailable + ", goodstory=" +  goodstory + "]";
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getNoOfTickets() {
		return noOfTickets;
	}

	
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	
	public boolean isMoviehit() {
		return moviehit;
	}

	
	public void setMoviehit(boolean moviehit) {
		this.moviehit = moviehit;
	}

	public boolean isTicketsavailable() {
		return ticketsavailable;
	}

	
	public void setTicketsavailable(boolean ticketsavailable) {
		this.ticketsavailable = ticketsavailable;
	}

	public boolean isGoodstory() {
		return goodstory;
	}

	
	public void setGoodstory(boolean goodstory) {
		this.goodstory = goodstory;
	}
	

}
