package de.tha.wi1;
import static de.tha.tools.Input.*;

import java.util.Iterator;

public class Task04 {

	public static void main(String[] args) {

		int power = readInteger("Grad: ");
		float zero = 1;
		float solution;
		float regular0 = 0;
		float derivative0 = 0;
		int counter=0;
		boolean condition0, condition1, condition2 = true;
		
		int[] polynoms = new int[power+1];
		int[] polynomsD = new int[power];
		
		//(a)
		for (int i=0; i<polynoms.length; i++) {
			polynoms[i] = readInteger("Koeffizient a_" + i + ": ");
		}
		
		//(b)
		for (int i=0; i<polynomsD.length; i++) {
			polynomsD[i] = polynoms[i+1]*(i+1);
		}
		
		System.out.print("\nKoeffizienten: ");
		for (int i=0; i<polynoms.length; i++) {
			System.out.print(polynoms[i] + " ");
		}
		
		System.out.print("\nAbleitung: ");
		for (int i=0; i<polynomsD.length; i++) {
			System.out.print(polynomsD[i] + " ");
		}
		
		//(c)
		System.out.println("\n");
		do {
			//Polynom und Ableitung für gegebene Nullstelle berechnen
			//System.out.println("Iteration " + counter + ": " + zero);
			for (int i=0; i<polynoms.length; i++) {
				regular0 += polynoms[i] * Math.pow(zero, i);
				if (i<polynomsD.length) {
					derivative0 += polynomsD[i] * Math.pow(zero, i);
				}
			}
			//Delta x berechnen
			System.out.format("Iteration %d: x=%.10f, p(x)=%.3e, |dx|=%.3e%n", counter, zero, regular0, derivative0);
			zero -= regular0/derivative0;
			counter++;
			condition0 = counter<50;
			condition1 = zero>Math.abs(Math.pow(10, -14));
			condition2 = derivative0>Math.abs(Math.pow(10, -14));
			regular0 = 0;
			derivative0 = 0;
		} while(condition0 & condition1 & condition2);
	}
}
