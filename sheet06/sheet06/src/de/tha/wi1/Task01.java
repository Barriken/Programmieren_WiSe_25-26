package de.tha.wi1;

public class Task01 {

	public static void main(String[] args)
	{
		
        // Beispiel-Array mit unregelmäßigen Dimensionen
        int[][][] data = {
            { {1, 2, 3}, {4, 5} },
            { {10}, {20, 30, 40}, {50} },
            { {7, 8}, {}, {11, 12, 13, 14} }
        };
		
        System.out.println("Größte Zahl mit For-Schleife ist " + findMaxForLoop(data));
        System.out.println("Größte Zahl mit For-Each-Schleife ist " + findMaxForEachLoop(data));
        
	}
	public static int findMaxForLoop(int [][][] a) {
		int max = Integer.MIN_VALUE;
    	for (int i = 0; i < a.length; i++) 
    	{
    		for (int j = 0; j < a[i].length; j++) 
    		{
    			for (int y = 0; y < a[i][j].length; y++) 
    			{
    				if (a[i][j][y] > max) 
    				{
    					max = a[i][j][y];
    				}
    			}
    		}
    	}
    	return max;
    }
	public static int findMaxForEachLoop(int [][][] a) {
		int max = Integer.MIN_VALUE;
		for (int[][] b : a) {
			for (int [] c : b) {
				for (int number : c) {
					if (number > max) {
						max = number;
					}
				}
			}
		}
		return max;
	}
	
}
