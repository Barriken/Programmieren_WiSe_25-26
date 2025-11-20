package de.tha.wi1;

public class Task02 {
	public static void main (String[]args) {
		
		int[] allValues = {1, 3, 5, 7, 9, 11};
		int[] noValues = {};
		int[] check1 = {3, 7, 9}; // -> liefert true
		int[] check2 = {2, 3, 7}; // -> liefert false
		int[] check3 = {}; 
		
		System.out.println("Check1 : " + arrayContains(allValues, check1));
		System.out.println("Check2 : " + arrayContains(allValues, check2));
		System.out.println("Kein Zahlen zu prüfen: " + arrayContains(noValues, check2));
		System.out.println("Leerer Check : " + arrayContains(allValues, check3));
	}
	
	//Methode
	public static boolean arrayContains (int[] allValues, int[] check) {
		
		for (int numberToBeSearchedFor : check) 
		{
			boolean contains = false;
			for (int numberToCheck : allValues) 
			{
				if (numberToCheck == numberToBeSearchedFor) {
					contains = true;
					break;
				}	
			}
			if (contains == true) {
					continue;
				}
			return false;
		}
		return true;
	}
}
