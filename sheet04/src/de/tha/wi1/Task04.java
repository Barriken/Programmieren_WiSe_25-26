package de.tha.wi1;
import static de.tha.tools.Input.*;

import java.util.Iterator;

public class Task04 {

	public static void main(String[] args) 
	{

		// Einlesen
		int grad = readInteger("Grad des Polynoms (>= 1): ");
	
		double[] koeffizienten = new double[grad + 1];
	
		for (int i = 0; i < grad + 1; i++) 
		{
			double koeffizient = readFloat("Koeffzient a_" + i + " : ");
		
			koeffizienten[i] = koeffizient;
		}
	
		// Ableitung erstellen
		double[] ableitung = new double[grad];
		for (int i = 1; i < grad + 1; i++) 
		{
			ableitung[i - 1] = koeffizienten[i] * i;
		}
		
		// Printen
		System.out.println();
		System.out.print("Koeffizienten: ");
		System.out.print("[");
		for (int i = 0; i < koeffizienten.length; i++) 
		{
			System.out.print(koeffizienten[i]);
			if (i != koeffizienten.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		
		
		System.out.println();
		System.out.print("Ableitung: " );
		System.out.print("[");
		for (int i = 0; i < ableitung.length; i++) 
		{
			System.out.print(ableitung[i]);
			if (i != ableitung.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println();
		
		
		// Berechnen
		double guess = 1;
		double resultPolynom = 0;
		double resultAbleitung = 0;
		double NewtonSchritt = 0;
		
		int counter = 0;
		do {
			System.out.println("Iteration " + counter + ":  x = " + guess);
			resultPolynom = 0;
			for (int i = 0; i < koeffizienten.length; i++) 
			{
				resultPolynom += koeffizienten[i] * Math.pow(guess, i);
			}
			
			resultAbleitung = 0;
			for (int i = 0; i < ableitung.length; i++) 
			{
				resultAbleitung += ableitung[i] * Math.pow(guess, i);
			}
			
			NewtonSchritt = (resultPolynom / resultAbleitung);
			guess = guess - NewtonSchritt;
			counter++;
		} while (counter < 50 && Math.abs(NewtonSchritt) > Math.pow(10,-14) && Math.abs(resultAbleitung) > Math.pow(10,-14));

		System.out.println();
		if (Math.abs(resultAbleitung) < Math.pow(10,-14)) {
			System.out.println("Keine Nullstelle gefunden.");
		}
		else {
			System.out.println("X ist ungefähr " + guess);
		}
	}
}
