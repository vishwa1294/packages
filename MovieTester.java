package com.xworkz.movies;

import com.xworkz.movies.MovieDTO;

public abstract class MovieTester {

	public static void main(String[] args) {
		MovieDTO movieDTO=new MovieDTO();
		movieDTO.setName("Shadhi mein zarur aana");
		movieDTO.setNoOfTickets(4);
		movieDTO.setMoviehit(true);
		movieDTO.setTicketsavailable(true);
		movieDTO.setGoodstory(true);
		 
		 System.out.println(movieDTO);
		 
		 MovieDTO movieDTO3 =new MovieDTO ("Male",3,false,true,false);
		 
		 System.out.println(movieDTO3);
	}
		 
		 
		
	
	}


