package com.hensandducks.test;

import java.util.Arrays;

public class FarmProduce {

	public static void main(String[] args) {
		
		// creating hen objects
		Hen hen1 = new Hen();
		Hen hen2 = new Hen();
		Hen hen3 = new Hen();
		
		// setting the eggs for each hen
		hen1.setTotalEggs(10);
		hen2.setTotalEggs(5);
		hen3.setTotalEggs(7);
		
		// creating hen array
		Hen[] hens = new Hen[3];
		
		// adding hens to array
		hens[0] = hen1;
		hens[1] = hen2;
		hens[2] = hen3;
		
		// creating duck objects
		Duck duck1 = new Duck();
		Duck duck2 = new Duck();
		
		// setting the eggs for each duck
		duck1.setTotalEggs(10);
		duck2.setTotalEggs(8);
		
		// creating ducks array
		Duck[] ducks = new Duck[2];
		
		// adding each duck to the array
		ducks[0] = duck1;
		ducks[1] = duck2;
		
		// creating farm object
		Farm farm = new Farm();
		
		// adding hens and ducks to the farm object
		farm.setHens(hens);
		farm.setDucks(ducks);
		
		System.out.println(farm.calculateTotalEggs());
	}

}
