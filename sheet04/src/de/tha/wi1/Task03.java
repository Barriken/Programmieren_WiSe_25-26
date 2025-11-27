package de.tha.wi1;
import static de.tha.tools.Input.*;
public class Task03 {

	public static void main(String[] args) {
	
	float a = readFloat("Koeffizient a: ");
	float b = readFloat("Koeffizient b: ");
	float c = readFloat("Koeffizient c: ");
	
	float[] koefficients = {a, b, c};
	
	printFormel(a, b, c);
	printErgebnis(a, b, c);
	System.out.println();
	}
	
	public static void printErgebnis( float a, float b, float c ) {
		if (a != 0 && b != 0 && c != 0) {
			float x1 = (-b + (float)Math.sqrt(b * b - 4 * a *c)) / (2 * a); 
			float x2 = (-b - (float)Math.sqrt(b * b - 4 * a *c)) / (2 * a); 
			

			System.out.println("\nDie Gleichung hat zwei reelle Lösungen:");
			System.out.format(" x1 = %.2f", x1);
			System.out.format("\n x2 = %.2f", x2);
		}
		else if (a == 0 && b != 0) {
		 float x1 = - (c /b);
		 System.out.println("\nDie Gleichung hat eine reelle Lösung:");
		 System.out.format("x = %.2f", x1);
		}
		else if ( a == 0 && b == 0 && c == 0) {
			System.out.println("\nDie Gleichung hat unendlich viele Lösungen.");
		}
		else {
			System.out.println("\nDie Gleichung hat keine reelle Lösung.");
		}
	}
	public static void printFormel( float a, float b, float c) {
		String outputA = a != 0 ? a + "*x^2" : "";
		String outputB = b != 0 ? b + "*x" : "";
		String outputC = c != 0 ? c + "" : "";
		
		if (a != 0) {
			if (a < 0) {
				outputA = "- " + Math.abs(a) + "*x^2 ";
			}
			else {
				outputA = a + "*x^2 ";
			}
		}
		else {
			outputA = " ";
		}
		
		if (b != 0) {
			if (b < 0) {
				outputB = "- " + Math.abs(b) + "*x ";
			}
			else {
				outputB = "+ " + b + "*x ";
			}
		}
		else {
			outputB = " ";
		}
		
		if (c != 0) {
			if (c < 0) {
				outputC = "- " + Math.abs(c);
			}
			else {
				outputC = "+ " + c + "";
			}
		}
		else {
			outputC = " ";
		}
		
		
		System.out.println("\nFormel: " + outputA + outputB + outputC + " = 0");
		
	}
}
