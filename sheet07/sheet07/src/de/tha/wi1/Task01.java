package de.tha.wi1;

public class Task01 {
	public static void main(String[] args) {
		System.out.println("Ergebnis mit Do While: " + powerDoWhile(2, 0));
		System.out.println("Ergebnis mit While: " + powerWhile(2, 8));
		System.out.println("Ergebnis mit Rekursion: " + powerRecursive(2, 8));
		System.out.println("Ergebnis mit Rekursion (double): " + powerRecursive(2.1, 8));
	}
	
	public static long powerDoWhile (int x, int n) {
		long result = x;
		do 
		{
			if (n == 0) {
				return 1;
			}
			else if (n > 1) {
				result = result * x;
			}
			n--;
		} while (n > 1);
		return result;
	}
	
	public static long powerWhile (int x, int n) {
		long result = 1;
		
		while (n >= 1)
		{
			result = result * x;
			n--;
		}
		return result;
	}
	
	public static long powerRecursive (int x, int n) {
		if (n == 0) {
			return 1;
		}
		n--;
		return x * powerRecursive(x,n);
	}
	
	public static double powerRecursive (double x, int n) {
		if (n == 0) {
			return 1;
		}
		n--;
		return x * powerRecursive(x,n);
	}	
}
