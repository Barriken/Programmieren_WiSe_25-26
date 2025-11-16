package de.tha.wi1;

public class Task01{
	
	public static void main(String[] args) {	
		
		
		int day = 30;
		int month = 10;
		int year = 2025;
		int wochentag;
		
		
		
		if (month == 1 || month == 2) {
			month = month + 12;
			year = year - 1;
		}
		
		int y = year % 100;
		int c = year / 100;
		
		wochentag = (day + (((26 * (month + 1))/10) + ((5 * y)/4) + (c/4) + 5 * c - 1)) % 7;
		
		//Sheet 04 add on: Arrays
		String[] daysOfTheWeek = {"Sonntag", "Montag", "Dienstag", "Mittwoch","Donnerstag", "Freitag", "Samstag"};
		System.out.println("Wochentag ist " + daysOfTheWeek[wochentag]);
	}
}