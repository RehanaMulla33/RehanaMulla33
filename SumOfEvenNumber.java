package com.xworkz.controlstatements;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		int listOfNumber[] = { 55, 36, 10, 65, 21, 72, 20, 26, 80, 62, 28, 44, 33, 50 };
		int sum=0;
		for (int i = 0; i <= listOfNumber.length; i++)
			if(listOfNumber[i]%2==0)
			
		{
			sum=sum+listOfNumber[i];
			
		}
		System.out.println("Sum ofEven Numbers of an Array are " +sum);
	}
	}

 