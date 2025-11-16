package de.tha.wi1;

public class Task02 {

	public static void main(String[] args) {

		int[][] sudoku = {
				{9,0,0,0,0,0,0,4,0},
				{2,1,6,3,8,4,7,9,0},
				{4,0,0,0,0,9,8,2,1},
				{0,6,0,1,0,0,9,0,0},
				{5,0,1,9,0,8,0,7,6},
				{0,2,9,5,7,6,0,0,8},
				{1,0,4,8,6,5,2,3,7},
				{0,0,7,0,0,0,0,6,4},
				{6,5,2,4,3,7,1,8,9}
		};
		
		System.out.print("|+===+===+===++===+===+===++===+===+===+|");
		
		int counter1 = 1;
		for (int[]innerArray : sudoku) 
		{
			
			System.out.println();
			System.out.print("||");
			int counter = 1;
			for (int number : innerArray) 
			{
				if (number != 0) 
				{
					System.out.format(" %1d ", number);
				}
				else 
				{
					System.out.print("   ");
				}
				
				if (counter == 3) 
				{
					System.out.print("||");
					counter = 1;
				}
				else 
				{
					System.out.print("|");
					counter++;
				}
			}
			System.out.println();
			if (counter1 == 3) {
				
				System.out.print("|+===+===+===++===+===+===++===+===+===+|");
				counter1 = 1;
			}
			else {
				System.out.print("|+---+---+---++---+---+---++---+---+---+|");
				counter1++;
			}
		}
	}
}
