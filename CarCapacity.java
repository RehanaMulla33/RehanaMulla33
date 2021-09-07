package com.xworkz.controlstatements;

public class CarCapacity {

	public static void main(String[] args) {
	String carType="Hyundai";
	switch(carType) {
	case "Ford" :
		System.out.println("The Engine capacity is 900-1050 ");
		System.out.println("Price is 13 lakh ");
		break;
	case "Hyundai" :
		System.out.println("The Engine capacity is 1200-1500 ");
		System.out.println("Price is 15 lakh ");
		break;
	
	case "Swift" :
		System.out.println("The Engine capacity is 1700-1900 ");
		System.out.println("Price is 14 lakh ");
	break;
	
	case "Tata nexon" :
		System.out.println("The Engine capacity is 1450-1780 ");
		System.out.println("Price is 16 lakh ");
		break;
	
	case "Toyoto" :
		System.out.println("The Engine capacity is 1580-1790 ");
		System.out.println("Price is 17 lakh ");
	default: 
		System.out.println("Invalid Entry");
	}

	}

}
