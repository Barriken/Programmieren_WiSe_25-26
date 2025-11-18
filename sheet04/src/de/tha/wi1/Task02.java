package de.tha.wi1;

public class Task02 {

	public static void main(String[] args) {
		
				int data[] = {
			    42, 87, 13, 65, 90, 22, 7, 54, 38, 62, 64, 31, 76, 48, 15, 70, 3, 81, 24, 93,
			    11, 60, 45, 57, 28, 85, 17, 96, 2, 73, 33, 68, 9, 78, 50, 91, 19, 35, 4, 26,
			    8, 63, 47, 71, 52, 39, 4, 95, 23, 66, 88, 41, 59, 12, 84, 18, 77, 25, 46, 69,
			    34, 53, 4, 98, 43, 10, 56, 20, 97, 16, 6, 75, 27, 40, 83, 21, 61, 49, 32, 67,
			    14, 58, 29, 94, 1, 62, 5, 79, 36, 82, 37, 4, 44, 72, 92, 51, 55, 74, 86, 14
			};

				
		// 1. Aufgabe
		int counter = 0;
		for (int number : data) 
		{
			if (counter % 10 == 0) 
			{
				System.out.println();
			}
			System.out.format("%4d", number);
			counter++;
		}
		
		
		// 2. Aufgabe
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;	
		for (int number : data) 
		{
				if (number < min) {
					min = number;
				}
				if (number > max) {
					max = number;
				}
		}
		System.out.println();
		System.out.println();
		System.out.println("Kleinste Zahl: " + min);
		System.out.println("Größte Zahl: " + max);
		
		
		// 3. Aufgabe 
		float sum = 0;
		for (int number : data) 
		{
			sum += number;
		}
		float average = sum / data.length;
		System.out.println();
		System.out.format("Durchschnitt aller Werte: %.2f" , average);
		
		
		// 4. Aufgabe
		int counter2 = 0;
		for (int number : data) 
		{
			if (number % 5 == 0) {
				counter2++;
			}
		}
		
		int[] numbersDividibleBy5 = new int[counter2];
		int index = 0;
		for (int number : data) 
		{
			if (number % 5 == 0) 
			{
				numbersDividibleBy5[index] = number;
				index++;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Zahlen, die durch 5 teilbar sind: " + index);
		for (int number : numbersDividibleBy5) 
		{
			System.out.format("%4d", number);
		}
		
		// 5. Aufgabe
		int currentModus = 0;
		int currentModusCount = 0;
		for (int number : data) 
		{
			int currentNumber = number;
			int currentNumberCount = 0;
			for (int number2: data) 
			{
				if (number2 == currentNumber) 
				{
					currentNumberCount++;
				}
			}
			if (currentNumberCount > currentModusCount) 
			{
				currentModus = currentNumber;
				currentModusCount = currentNumberCount;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Häufigste Zahl (Modus): " + currentModus);
		System.out.println("Häufigkeit: " +  currentModusCount);
	}
}
