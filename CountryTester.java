package com.xworkz.country;

import com.xworkz.country.CountryDTO;

public class CountryTester {
	public static void main(String[] args) {
		CountryDTO countryDTO=new CountryDTO();
		countryDTO.setName("Singapur");
		countryDTO.setPopulation(20000);
		countryDTO.setBranches(10);
		countryDTO.setGoodcountry(true);
		
		 System.out.println(countryDTO);
		 
		 CountryDTO countryDTO4 =new CountryDTO("America",50000,150,false);
		 
		 System.out.println(countryDTO4);
	}
	}
		
	


