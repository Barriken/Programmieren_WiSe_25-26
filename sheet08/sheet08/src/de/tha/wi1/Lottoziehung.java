package de.tha.wi1;

import java.util.Random;

public class Lottoziehung {
	
	public static void main (String[] args) {
		
		Lottoziehung lotto = new Lottoziehung();
		
		System.out.println(lotto.nextNumber());
		System.out.println(lotto.nextNumber());
		System.out.println(lotto.nextNumber());
		System.out.println(lotto.nextNumber());
		System.out.println(lotto.nextNumber());
		System.out.println(lotto.nextNumber());
		System.out.println(lotto.nextNumber());
		System.out.println(lotto.nextNumber());
		System.out.println(lotto.nextNumber());
	}
	
	private static int TimesCalled = 0;
	
	private static int[] DrawnNumbers = new int[6];
	
	public int nextNumber() 
	{
		TimesCalled++;
		
		int[] data = new int[49];
		for (int i = 1; i <= data.length; i++) {
			data[i - 1] = i;
		}
		
		int returnedNumber = 0;
		if (TimesCalled < 7) 
		{
			Random rnd = new Random();
			do 
			{
				int randomNumber = rnd.nextInt(data.length);
				returnedNumber = data[randomNumber];
			} while (!uniqueNumber(returnedNumber));
			DrawnNumbers[TimesCalled - 1] = returnedNumber;
		}
		else if( TimesCalled == 7) 
		{
			Random rnd = new Random();
			int randomNumber = rnd.nextInt(10);
			
			// - 1 da data bei 1 anfängt, wir aber 0 - 9 haben wollen
			returnedNumber = data[randomNumber] - 1;
		}
		else if( TimesCalled > 7) 
		{
			returnedNumber = -1;
		}
		return returnedNumber;
	}
	
	public boolean uniqueNumber ( int searchedNumber) 
	{
		for (int number : DrawnNumbers) 
		{
			if (number == searchedNumber) {
				return false;
			}
		}
		return true;
	}
	
}