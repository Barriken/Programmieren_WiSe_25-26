package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task03 {


	public static void main(String[] args) throws Exception {
		        
//        char cmd = readChar("> ");
//		char r = readChar();				
//		int s = readInteger();
//		System.out.println("Befehl " + cmd + " Reihe " + r + " Sitz " + s);
		char input = 'q';
		
		char[][]sitzPlan = 
			{
				{'A','.','.','.','.','.','.','.','.'},
				{'B','.','.','.','.','.','.','.','.'},
				{'C','.','.','.','.','.','.','.','.'},
				{'D','.','.','.','.','.','.','.','.'},
				{'E','.','.','.','.','.','.','.','.'},
			};
		
		System.out.println("Willkommen beim Kino-Sitzplan!");
		do
		{
			
			System.out.println();
			System.out.println("Befehle:");
			System.out.println("| p = Plan | b = buchen | s = stornieren | f = anzahl | q = quit |");
			System.out.println("Was möchten Sie tun?");
			input = readChar();
			
			switch (input) {
			case 'p': {
				System.out.print("   1 2 3 4 5 6 7 8 ");
				for (char[] innerArray : sitzPlan) 
				{
					System.out.println();
					for (char sitz : innerArray) 
					{
						System.out.print(" " + sitz);
					}	
				}
				System.out.println();
				break;
			}
			case 'b': {
				char row = readChar("Reihe eingeben (A-E)");
				int seatNumber = readInteger("Sitznummer eingeben (A-E)");
				boolean validRow = false;
				int lineCounter = 0;
				
				for (char[] innerArray : sitzPlan) 
				{
					if (innerArray[0] == row) 
					{
						validRow = true;
						break;
					}
					else 
					{
						lineCounter++;
					}	
				}
				if (validRow && (seatNumber >= 1 && seatNumber <= 8))
				{
					if (sitzPlan[lineCounter][seatNumber] == '.') 
					{
						sitzPlan[lineCounter][seatNumber] = 'x';
						System.out.println("Erfolgreich gebucht.");
					}
					else 
					{
						System.out.println("Sitz bereits belegt!");
					}
				}
				else 
				{
					System.out.println("Ungültiger Sitz!");
				}
;				break;
			}
			case 's': {
				char row = readChar("Reihe eingeben (A-E)");
				int seatNumber = readInteger("Sitznummer eingeben (A-E)");
				boolean validRow = false;
				int lineCounter = 0;
				
				for (char[] innerArray : sitzPlan) 
				{
					if (innerArray[0] == row) 
					{
						validRow = true;
						break;
					}
					else 
					{
						lineCounter++;
					}	
				}
				if (validRow && (seatNumber >= 1 && seatNumber <= 8))
				{
					if (sitzPlan[lineCounter][seatNumber] == 'x') 
					{
						sitzPlan[lineCounter][seatNumber] = '.';
						System.out.println("Erfolgreich storniert.");
					}
					else 
					{
						System.out.println("Sitz nicht belegt!");
					}
				}
				else 
				{
					System.out.println("Ungültiger Sitz!");
				}
				break;
			}
			case 'f': {
				int counter = 0;
				for (char[] innerArray : sitzPlan) 
				{
					for (char sitz : innerArray) 
					{
						if (sitz == '.') 
						{
							counter++;
						}
					}
				}
				System.out.println("Anzahl der freien Plätze: " + counter);
				break;
			}
			case 'q': {
				System.out.println("Bis später Attentäter");
				break;
			}
			default:
				System.out.println("Ungültiger Befehl :(");
				System.out.println();
			}	
		}  while (input != 'q');
	}
}
