package de.tha.wi1;

public class Task02 {
	public static void main(String[] args) {
		System.out.println("Größter gemeinsamer Teiler ist: " + ggt(17, 13));
		System.out.println("Größter gemeinsamer Teiler ist: " + ggt(0, 10));
		
	}

	public static int ggt(int x, int y) {
		
		// Für Werte == 0 soll 0 returned werden
		if (x == 0 || y == 0) {
			return 0;
		}
		if (x == y) {
			return x;
		}
		if (x > y) {
			return ggt(x - y, y);
		}
		else //if (x < y) 
		{
			return ggt(x, y -x);
		}
	}
}
