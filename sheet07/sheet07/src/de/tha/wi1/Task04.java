package de.tha.wi1;

public class Task04 {
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
		
		int[][] unsolvedSudoku = copy(sudoku);
		boolean isSolved = solve(sudoku);
		System.out.println("Das Sudoku konnte" + (isSolved ? " erfolgreich " : " leider nicht ") + "gelöst werden.");
		
		if (isSolved) {
			printSudoku(unsolvedSudoku, sudoku);
		}
		
		//Kurze Tests
		//System.out.println("Diese Row ist " + isValidRow(sudoku[0]));
		//System.out.println("Diese Spalte ist " + isValidCol(sudoku, 0));
		//System.out.println("Dieser Block ist " + isValidBlock(sudoku, 6 ,6));
	}
	
	
	// (c)
	public static void printSudoku(int[][] unsolvedSudoku, int[][] sudoku) 
	{
		System.out.print("|+===+===+===++===+===+===++===+===+===+|");
		int counter1 = 1;
		for (int i = 0; i < sudoku.length; i++) 
		{
			System.out.println();
			System.out.print("||");
			int counter = 1;
			for (int j = 0; j < sudoku.length; j++) 
			{
				// Wenn sich die 2 Sudokus an einer Stelle unterscheiden,  
				// heißt das, dass an dieser Stelle eine Zahl gelöst wurde.
				if (sudoku[i][j] != unsolvedSudoku[i][j]) {
					System.out.print("\u001B[32m " + sudoku[i][j] + " \u001B[0m");
				}
				else {
					System.out.print(" " + sudoku[i][j] + " ");
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
	
	// (b)
	public static int[][] copy (int[][] ogArray)
	{
		int[][] copiedArray = new int[ogArray.length][ogArray[0].length];
		
		for (int i = 0; i < ogArray.length; i++) {
			for (int j = 0; j < ogArray[0].length; j++) {
				copiedArray[i][j] = ogArray[i][j];
			}
		}
		return copiedArray;
	}
	
	
	// (a)
	public static boolean solve (int[][] mat) 
	{
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				if (mat[i][j] == 0) 
				{
					for (int numberToInsertIntoSudoku = 1; numberToInsertIntoSudoku <= 9; numberToInsertIntoSudoku++) 
					{
						mat[i][j] = numberToInsertIntoSudoku;
						
						// Die richtigen Koordinaten zur Blockprüfung finden
						int sRow = findBlockStartRowKoordinate(i);
						int sCol = findBlockStartColumnKoordinate(j);
						
						if (isValidRow(mat[i]) && isValidCol(mat, j) && isValidBlock(mat, sRow, sCol)) 
						{
							if (solve(mat) == true) 
							{
								return true;
							}
						}
					}
					mat[i][j] = 0;
					return false;
				}
			}
		}
		return true;
	}
	
	// Startkoordinaten für den Block finden
	public static int findBlockStartColumnKoordinate(int col) {
		if (col == 0 || col / 3 == 0) {
			return 0;
		}
		if (col / 3 == 1){
			return 3;
		}
		else {
			return 6;
		}
	}
	
	// Startkoordinaten für den Block finden
	public static int findBlockStartRowKoordinate(int row) {
		if (row == 0 || row / 3 == 0) {
			return 0;
		}
		if (row / 3 == 1){
			return 3;
		}
		else {
			return 6;
		}
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
