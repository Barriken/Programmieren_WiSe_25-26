package de.tha.wi1;

public class Task01 {

	public static void main(String[] args) {
		int totalSec = 3671; 		// 1 h, 1 min, 11 s
		int a = 7, b = -12; 		// Beispielwerte
		int x = -98; 				// z.B. Prozentwert oder Punktzahl
		int lo = 0, hi = 100; 		// Zielbereich
		double celsius = 23.7; 		// Temperatur in Celsius
		
		
		int hh = totalSec / 3600;
		int mm = (totalSec % 3600) / 60;
		int ss = (totalSec % 3600) % 60;
		
		System.out.println(hh +" h, " + mm + " m, " + ss + " s");
		
		int minAB = a < b ? a : b ;
		int maxAB = a > b ? a : b ;
		
		System.out.println("Min: " + minAB + "; Max: " + maxAB);
		
		int absB = b > 0 ? b : -b;
		
		System.out.println("Betrag von b ist: " + absB);
		
		int clamped = x < lo || x > hi ? x < lo ? lo : hi : x;
		
		System.out.println("Begrenzter Wert: " + clamped);
		
		double fahrenheit = ((9/5.0) * celsius) + 32;
		
		System.out.println("Temperatur in Fahrenheit:" + fahrenheit);
		
	}
	
}
