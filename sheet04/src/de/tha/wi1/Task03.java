package de.tha.wi1;
import static de.tha.tools.Input.*;
public class Task03 {

	public static void main(String[] args) {
	
		
		
		//TODO: beispielausgabe 2 (ein koeffizient 0) und 3 (weniger als 2 reelle lösungen) ergänzen
		
		
		
		float a = readFloat("a: ");
		float b = readFloat("b: ");
		float c = readFloat("c: ");
		float discriminant;
		float x1, x2;
		
		if (a!=0 & b!=0 & c!=0) {
			System.out.print("Formel: ");
		}
		if (a!=0) {
			System.out.print(a + "*x^2 ");
		}
		if (b!=0) {
			System.out.print(b + "*x ");
		}
		if (c!=0) {
			System.out.print(c + " ");
		}
		if (a!=0 | b!=0 | c!=0) {
			System.out.print("= 0");
		}
		
		discriminant = b*b - 4*a*c;
		
		//Quadrat gleichung
		if (a!=0) {
			//diskriminante prüfuen
			if (discriminant<0) {
				System.out.println("\nkeine reele lsg");
			} else if (discriminant==0) {
				x1 = -b / 2*a;
				x1 *= 100;
				x1 = Math.round(x1);
				x1 /= 100;
				System.out.print("\n1 reele lsg:\n" + "x = " + x1);				
			} else { //discriminant>0
				x1 = (-b + (float) Math.sqrt(b*b - 4*a*c))/(2*a);
				x2 = (-b - (float) Math.sqrt(b*b - 4*a*c))/(2*a);
				x1 *= 100;
				x2 *= 100;
				x1 = Math.round(x1);
				x2 = Math.round(x2);
				x1 = x1/100;
				x2 = x2/100;
				System.out.print("\n2 reele lsg" + "\nx1: " + x1 + "\nx2: " + x2);
			}
		//Lineare gleichung
		} else {
			x2 = -c/b;			
			System.out.println("\n1 reelle lsg:\n" + "x = " + x2);		
		}			
	}
}
