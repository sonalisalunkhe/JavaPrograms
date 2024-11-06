package com.qa.JavaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> car=new ArrayList<>();
		
		car.add("ABC");
		car.add("xyz");
		car.add("pqr");
		
		
		for(int i=0;i<car.size();i++) {
			System.out.println(car.get(i));
		}
		
		 HashMap<String, String> capitalCities = new HashMap<String, String>();

		    // Add keys and values (Country, City)
		    capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    System.out.println(capitalCities);
		    
		    Set<String> str=capitalCities.keySet();
		    System.out.println(str);
		    
		    for(int i=0;i<capitalCities.size();i++) {
		    	Set<String> str1=capitalCities.keySet();
			    System.out.println(str);

		    	
		    	
		    }
	}

}
