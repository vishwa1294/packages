package com.xworkz.dp.place;

import java.io.Serializable;

public class PlaceDTO implements Serializable{
	
private String name;
private	String location;
private	boolean placeopened;
private	int noOfPlaces;
private	boolean atmosphere;


public PlaceDTO (String name,String location,int noOfPlaces,boolean placeopened ,boolean atmosphere) {
	super();
	this.name=name;
	this.location=location;
	this.noOfPlaces=noOfPlaces;
	this.placeopened=placeopened;
	this.atmosphere=atmosphere;
}

public PlaceDTO() {
	System.out.println("Init PlaceDTO");
}

@Override
public String toString() {
	System.out.println("Init PlaceDTO for tostring");
	return "PlaceDTO [name=" + name + ",location=" + location + ",noOfPlaces=" + noOfPlaces + ",placeopened=" + placeopened + ",atmosphere=" + atmosphere + "]";
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


public String getLocation() {
	return location;
}


public void setLocation(String location) {
	this.location = location;
}


public boolean isPlaceopened() {
	return placeopened;
}


public void setPlaceopened(boolean placeopened) {
	this.placeopened = placeopened;
}


public int getNoOfPlaces() {
	return noOfPlaces;
}


public void setNoOfPlaces(int noOfPlaces) {
	this.noOfPlaces = noOfPlaces;
}


public boolean isAtmosphere() {
	return atmosphere;
}


public void setAtmosphere(boolean atmosphere) {
	this.atmosphere = atmosphere;
}

}




























