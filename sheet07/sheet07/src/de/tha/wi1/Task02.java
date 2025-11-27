package de.tha.wi1;

public class Task02 {
	public static void main(String[] args) {
		System.out.println("Größter gemeinsamer Teiler ist: " + ggt(17, 13));
	}

	public static int ggt(int x, int y) {
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
