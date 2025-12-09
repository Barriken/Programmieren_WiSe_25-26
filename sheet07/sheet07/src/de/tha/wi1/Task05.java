package de.tha.wi1;

public class Task05 {
	public static void main(String[] args)
	{
		
		char[] cleartext = convertStringCaesar("Dies ist ein Test und hier steht ein X");
		
		
		System.out.println("Verschlüsselter Text:" );
		for (char letter : encrypt(cleartext, (byte)22) ) {
			System.out.print(letter);
		}
		
		System.out.println();
		System.out.println();
		
		char[] encryptedExample = convertStringCaesar("Bollu xyl Wixy zohencihcyln");
		
		System.out.println("Zu entschlüsselnder Text: " + " Bollu xyl Wixy zohencihcyln");
		System.out.println("Entschlüsselte Form:");
		for (char letter : encrypt((encryptedExample), (byte)6) ) {
			System.out.print(letter);
		}
		System.out.println();
		System.out.println();
		System.out.println("Der Schlüssel war '6'.");
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
	
	public static char[] encrypt (char[] clearText, byte shift) {
		char[] encryptedText = new char[clearText.length];
		
		for (int i = 0; i < clearText.length; i++) {
			encryptedText[i] = encDecChar(clearText[i], shift, true);
		}
		return encryptedText;
	}
	
	public static char[] decrypt (char[] encryptedText, byte shift) {
		char[] clearText = new char[encryptedText.length];
		
		for (int i = 0; i < encryptedText.length; i++) {
			clearText[i] = encDecChar(encryptedText[i], shift, false);
		}
		return clearText;
	}
	
	public static char encDecChar (char letter, byte shift, boolean encrypt) 
	{
		if (letter == ' ') 
		{
			return ' ';
		}
		if (letter >= 'A' && letter <= 'Z')
		{
			if (encrypt) 
			{
				letter = (char)(letter + shift);
				if (letter > 'Z') {
					letter = (char)(letter - 26);
				}
			}
			else if (!encrypt) {
				letter = (char)(letter + shift);
				if (letter < 'A') {
					letter = (char)(letter + 26);
				}
			}
		}
		else if (letter >= 'a' && letter <= 'z')
		{
			if (encrypt) 
			{
				letter = (char)(letter + shift);
				if (letter > 'z') {
					letter = (char)(letter - 26);
				}
			}
			else if (!encrypt) {
				letter = (char)(letter + shift);
				if (letter < 'a') {
					letter = (char)(letter + 26);
				}
			}
		}
		return letter;
	}
	
}
