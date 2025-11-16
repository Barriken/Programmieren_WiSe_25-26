package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task01 {

	public static void main(String[] args) {
		String word = readWord("Bitte Wort eingeben");
		
		boolean vergleich = (word == "Programmieren");
		boolean equal =  word.equals("Programmieren");
				
			System.out.println("Vergleich mit equals ist " + equal);
			System.out.println("Vergleich mit == ist " + vergleich);
	}

}
