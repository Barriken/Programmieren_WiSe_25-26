package de.tha.wi1;

public class Task05 {
	public static void main(String[] args) {
		
	}
	
	public static char[] convertStringCaesar (String word) {
		char[] letters = word.toCharArray();
		
		for (int i = 0; i < letters.length; i++) {
			if ((letters[i] < 65 || letters[i] > 90) && (letters[i] < 97 || letters[i] > 122)) {
				letters[i] = ' ';
			}
		}
		return letters;
	}
	
}
