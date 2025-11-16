package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task05 {

	public static void main(String[] args) {
		int input = readInteger("Zahl eingeben: ");
		
		int result1 = 0;
		for (int i = 0; i <= input; i++) 
		{
			if (i % 2 == 0) 
			{
				result1 = result1 + i;
			}
		}
		
		int j = 0;
		int result2 = 0;
		while ( j <= input) 
		{
			if (j % 2 == 0) 
			{
				result2 = result2 + j;
			}
			j++;
		}
		
		int t = 0;
		int result3 = 0;
		do 
		{
			if (t % 2 == 0) 
			{
				result3 = result3 + t;
			}
			t++;	
		} while (t <= input);
		
		
		System.out.println("For Schleife: " + result1);
		System.out.println("While Schleife: " + result2);
		System.out.println("For Schleife: " + result1);
	}

}
