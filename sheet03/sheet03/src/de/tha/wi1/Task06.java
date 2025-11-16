package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task06 {

	public static void main(String[] args) {
		
		int input = readInteger("Zahl eingeben");
		
		int result = 0;
		for (int i = 1_000_000_000; i >= 1; i = i / 10) 
		{
			result = (input / i) + result;
			input = input % i;	
		}
		System.out.println("Quersumme: " + result);
	}
}
