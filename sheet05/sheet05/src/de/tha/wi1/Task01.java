package de.tha.wi1;

public class Task01 {

	public static void main(String[] args) {
	
		int[] rnd = { 17, 83, 64, 5, 90, 48, 71, 3, 27, 66,
				      14, 95, 9, 56, 78, 22, 60, 99, 2, 31 };
				
		// Selection Sort
		
		for (int pos = 0; pos < rnd.length; pos++) 
		{
			int minIndex = pos;
			for (int j = pos; j < rnd.length; j++) 
			{
				if (rnd[j] < rnd[minIndex]) {
					minIndex = j;
				}
			}
			int hilfsv = rnd[pos];
			rnd[pos] = rnd[minIndex];
			rnd[minIndex] = hilfsv;
			
			System.out.println();
			System.out.print( (pos + 1) + ".er Schritt: " );
		for (int number : rnd ){
			System.out.format("%3d", number);
		}
		}
		
	}
}
