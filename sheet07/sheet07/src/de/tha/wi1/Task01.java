package de.tha.wi1;

public class Task01 {
	
	
	
	
	public static long powerDoWhile(int x, int n) {
		
		int i = 1;
		do {
			x = x * x;
			i++;
		} while ( i < n);
		
		return x;
		
		
		
	}

	public static void main(String[] args) {
		
		System.out.println(powerDoWhile(3,3));
		
	}	
}
