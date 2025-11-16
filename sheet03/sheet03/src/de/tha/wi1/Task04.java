package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task04 {

	public static void main(String[] args) {
		int input = readInteger("Eine Ganzzahl eingeben: ");
		
		int result1 = input;
		for (int i = input - 1; i > 0; i--) 
		{
			result1 = result1 * i;
		}
		
		int result2 = input;
		int i = input - 1;
		while (i > 0) 
		{
			result2 = result2 * i;
			i--;
		}
		
		int result3 = input;
		int j = input - 1;
		do 
		{
			result3 = result3 * j;
			j--;
		} while (j > 0);
		
		
		System.out.println("For Schleife: " + result1);
		System.out.println("While Schleife: " + result2);
		System.out.println("Do While Schleife: " + result3);
	}
	
}
