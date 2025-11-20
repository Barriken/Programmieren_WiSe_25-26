package de.tha.wi1;
import static de.tha.tools.Input.*;

import java.util.Arrays;
public class Task03 { 
	public static void main (String[] args) {
		String input = readWord("Wort eingeben: ");
		
		char[] letters = input.toCharArray();
		letters = convertToSmall(letters);
		
		System.out.println("Dein Wort \"" + input + "\" ist ein Palindrom: " + isPalindrome(letters));
		
	}
	
	// Chars klein machen
	public static char[] convertToSmall (char[] characters) 
	{
		for (int i = 0; i < characters.length; i++) 
		{
			if (characters[i] >= 65 && characters[i] <= 90) 
			{
				characters[i] = (char)(characters[i] + 32);
			}
		}
		return characters;
	}
	
	// Nach Palindrom checken
	public static boolean isPalindrome(char[] letters) 
	{
		char[]invertedLetters = new char[letters.length]; 
		
		int indexer = 0;
		for (int i = letters.length - 1; i >= 0; i--) {
			invertedLetters[indexer] = letters[i];
			indexer++;
		}
//		return (invertedLetters == letters);
		
		for(int i = 0; i < invertedLetters.length; i++)
		{
			if(invertedLetters[i] != letters[i])
			{
				return false;
			}
		}
		
		return true;
	}
}
