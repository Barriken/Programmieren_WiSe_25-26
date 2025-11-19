package de.tha.wi1;
import static de.tha.tools.Input.*;
public class Task03 {

	public static void main(String[] args) {
	
	float a = readFloat("Koeffizient a: ");
	float b = readFloat("Koeffizient b: ");
	float c = readFloat("Koeffizient c: ");
	
	float[] koefficients = {a, b, c};
	
	String outputA = a != 0 ? a + "*x^2" : "";
	String outputB = b != 0 ? b + "*x" : "";
	String outputC = c != 0 ? c + "" : "";
	System.out.println("Formel: " + outputA + outputB + outputC + " = 0");
	
	}
}
