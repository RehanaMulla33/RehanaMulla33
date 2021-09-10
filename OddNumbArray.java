package com.xworkz.controlstatements;

public class OddNumbArray {

	public static void main(String[] args) {
		int listOfNumber[] = { 55, 36, 10, 65, 21, 72, 20, 26, 80, 62, 28, 44, 33, 50 };
		for (int i = 0; i <= listOfNumber.length; i++)
			if(listOfNumber[i]%2!=0)
			
		{
			System.out.println("Odd Numbers of an Array are " +listOfNumber[i]);
			
		}
	}

}
