package de.tha.wi1;


public class Task06 {
	public static void main(String[] args) {
		
		int[] profile = {0, 1, 2, 3, 4, 3, 2, 3, 4, 4, 4, 4, 5, 6, 5, 4, 3, 2, 1, 0};

		//System.out.println(getMapHeight(profile));
		drawProfile(profile);
	}
	
	public static void drawProfile (int[] profile) {
		int height = getMapHeight(profile);
		
		char[][]map = new char[height][profile.length];
		initMap(map, profile);
		printMap(map);
	}
	
	public static void printMap(char[][] map) {
		for (char[] array : map) 
		{
			System.out.println();
			for (char letter : array) 
			{
				System.out.print(letter);
			}
		}
	}
	
	public static char getMapSymbol(int[] profile, int i) 
	{
		if (i == 0) 
		{
			if (profile[i] < profile[i + 1]) {
				return '/';
			}
			if (profile[i] > profile[i + 1]) {
				return '\\';
			}
			else {
				return '-';
			}
		}
		if (i == (profile.length - 1)) 
		{
			if (profile[i] < profile[i - 1]) {
				return '\\';
			}
			if (profile[i] > profile[i - 1]) {
				return '/';
			}
			else {
				return '-';
			}
		}
		if (profile[i - 1] == profile[i] && profile[i + 1] == profile[i]) {
			return '-';
		}
		if (profile[i - 1] < profile[i] && profile[i + 1] > profile[i]) {
			return '/';
		}
		if (profile[i - 1] > profile[i] && profile[i + 1] < profile[i]) {
			return '\\';
		}
		if (profile[i - 1] < profile[i] && profile[i + 1] < profile[i]) {
			return '^';
		}
		if (profile[i - 1] > profile[i] && profile[i + 1] > profile[i]) {
			return 'v';
		}
		return '-';
	}
	public static void initMap(char[][] map, int[] profile) {
		// Viel Glück, das zu verstehen
		for (int i = 0; i < map.length; i++) 
		{
			for (int j = 0; j < map[i].length; j++)
			{
				if (profile[j] == i) {
					map[(map.length - 1)- i][j] = getMapSymbol(profile, j);
				}
				else {
					map[(map.length - 1)- i][j] = ' ';
				}
			}
		}
	}
	
	public static int getMapHeight (int[] profile) 
	{
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int number : profile) 
		{
			if (number > max) {
				max = number;
			}
			if (number < min) {
				min = number;
			}
		}
		int height = Math.abs(min - max);
		if (min <= 0) {
			height++;
		}
		return height;
	}
}
