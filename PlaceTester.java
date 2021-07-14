package com.xworkz.dp.place;

import com.xworkz.dp.place.PlaceDTO;

public class PlaceTester {

	public static void main(String[] args) {
		
		PlaceDTO placeDTO=new PlaceDTO();
		placeDTO.setName("Sagar Hospital");
		placeDTO.setLocation("Banashankari");
		placeDTO.setPlaceopened(true);
		placeDTO.setNoOfPlaces(10);
		placeDTO.setAtmosphere(true);
		 
		 System.out.println(placeDTO);
		 
		 PlaceDTO placeDTO1=new PlaceDTO("Malagi Hospital","Jkd",5,true,false);
		 
		 System.out.println(placeDTO1);
	}
		 
		 
		
	
		
	}


