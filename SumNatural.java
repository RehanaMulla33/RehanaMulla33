package com.xworkz.controlstatements;

public class SumNatural {

	public static void main(String[] args) {
		int n = 20;
		int i = 1;
		int add = 0;
		do {
			add = add + i;
			i = i + 1;
		} while (i <= n);
		System.out.println("Sum of 20 natural numbers are=" + add);

	}

}
