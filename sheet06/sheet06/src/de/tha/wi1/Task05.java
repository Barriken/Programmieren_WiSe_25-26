package de.tha.wi1;

public class Task05 {
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
	
		printSudoku(sudoku);
		
		//Kurze Tests
		//System.out.println("Diese Row ist " + isValidRow(sudoku[0]));
		//System.out.println("Diese Spalte ist " + isValidCol(sudoku, 0));
		//System.out.println("Dieser Block ist " + isValidBlock(sudoku, 6 ,6));
	}
	
	public static boolean isValidRow(int[] row) 
	{
		for (int i = 0; i < row.length; i++) 
		{
			if (row[i] == 0) {
				continue;
			}
			for (int j = i + 1; j < row.length; j++) 
			{
				if (row[i] == row[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isValidCol(int[][] sudoku, int colIndex) 
	{
		for (int row = 0; row < sudoku.length; row++) 
		{
			if (sudoku[row][colIndex] == 0) {
				continue;
			}
			for (int i = row + 1; i < sudoku.length; i++) 
			{
				if (sudoku[row][colIndex] == sudoku[i][colIndex]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isValidBlock (int[][] sudoku, int srow, int scol) 
	{
		// Alle Zahlen eines Blocks in ein Array übergeben
		int[] blockNumbers = new int[9];
		
		int indexer = 0;
		for (int row = srow; row < srow + 3; row++) 
		{
			for (int col = scol; col < scol + 3; col++) 
			{
				blockNumbers[indexer] = sudoku[row][col];
				indexer++;
			}
		}
		// Kann nun wie eine Row behandelt werden
		return (isValidRow(blockNumbers));
	}
	
	public static void printSudoku(int[][] sudoku) 
	{
		System.out.print("|+===+===+===++===+===+===++===+===+===+|");
		int counter1 = 1;
		for (int[]innerArray : sudoku) 
		{
			System.out.println();
			System.out.print("||");
			int counter = 1;
			for (int number : innerArray) 
			{
				if (number != 0) {
					System.out.format(" %1d ", number);
				}
				else {
					System.out.print("   ");
				}
				
				if (counter == 3) {
					System.out.print("||");
					counter = 1;
				}
				else {
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
