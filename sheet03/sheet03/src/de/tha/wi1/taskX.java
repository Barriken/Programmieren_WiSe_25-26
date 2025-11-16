package de.tha.wi1;

import static de.tha.tools.Input.*;

public class taskX 
{
	 public static void main(String[] args) 
	 {
		int limit = readInteger("Bitte Obergrenze angeben: ");
		
		for (int i = 1; i <= limit; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
			
			System.out.println("Ende von Task 1");
			System.out.println("Beginn von Task 2");
			
			int j = 0;
			int result = 0;
			while (j <= 100) {
				
				if (j % 2 == 1) {
					result = result + j;
				}
				j++;
				
				
			}
			System.out.println(result);
		}
	 }
}