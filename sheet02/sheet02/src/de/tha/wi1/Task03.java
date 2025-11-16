package de.tha.wi1;

public class Task03 {
	
	public static void main(String[] args) {
		int a = 4, b = 0, c = 0;
		boolean d = true;
		float f1 = 0.0f;
		
		
		System.out.format("a = %2d, b = %2d, c = %2d, d = %5b, f1 = %.2f%n", a, b, c, d, f1);
		
		a = b = c = a * 4;
		System.out.format("a = %2d, b = %2d, c = %2d, d = %5b, f1 = %.2f%n", a, b, c, d, f1);

		c = b = (a = 3) + a + a + a;
		System.out.format("a = %2d, b = %2d, c = %2d, d = %5b, f1 = %.2f%n", a, b, c, d, f1);
	
		b = a % 2 == 0 ? a * 2 : a * 5;
		System.out.format("a = %2d, b = %2d, c = %2d, d = %5b, f1 = %.2f%n", a, b, c, d, f1);
	
		d = d == true &( a = (a + 1) % 5 )== 0;
		System.out.format("a = %2d, b = %2d, c = %2d, d = %5b, f1 = %.2f%n", a, b, c, d, f1);
	
		f1 = a % 10 == 0 || b % 10 == 0 ? a/3f : a * 10;
		System.out.format("a = %2d, b = %2d, c = %2d, d = %5b, f1 = %.2f%n", a, b, c, d, f1);
	}
	
}
