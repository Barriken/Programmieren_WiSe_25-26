package de.tha.wi1;

public class Task04 {
	public static void main(String[]args) {
		
		int jahr = 2020;
		
		boolean istSchaltJahr;
		
		istSchaltJahr = jahr % 4 == 0 ? (jahr % 100 == 0 ? (jahr % 400 == 0 ? true : false) : true ): false;
	
		System.out.println(istSchaltJahr);
	}
}
