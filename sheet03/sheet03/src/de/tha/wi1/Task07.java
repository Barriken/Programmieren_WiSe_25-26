package de.tha.wi1;

import static de.tha.tools.Input.*;

import java.util.Iterator;

public class Task07 {

	public static void main(String[] args) {
		
		int input = readInteger("Bitte Höhe des Baumes eingeben: ");
		
		int anzahlLeerZeichen = input - 1;
		
		for (int i = 1; i <= input; i++) 
		{
			for (int t = 0; t <= anzahlLeerZeichen; t++) 
			{
				System.out.print(" ");
			}
			--anzahlLeerZeichen;
			
			int anzahlSterne = (i * 2) - 1;
			for (int j = 1; j <= anzahlSterne; j++) 
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		
		
		int anzahlLeerZeichen2 = input - 1;
		
		for (int z = 0; z <= anzahlLeerZeichen2; z++) 
		{
			System.out.print(" ");
		}
		System.out.println("#");
		
	}
}
