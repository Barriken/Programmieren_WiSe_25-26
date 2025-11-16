package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task02 {

	public static void main(String[] args) {
		String word = readWord("Bitte Form eingeben: ");
		float result = 0f;
		boolean isValid = true;
		
		switch(word) {
		case "Kreis":
			float radius = readFloat("Kreisradius angeben: ");
			result = radius * radius * (float) Math.PI;
			break;
			
		case "Dreieck":
			float grundFlaeche = readFloat("Grundfläche angeben: ");
			float hoehe = readFloat("Höhe angeben:");
			result = (grundFlaeche * hoehe)/2;
			break;
			
		case "Rechteck":
			float kantenLaenge1 = readFloat("Kantenlänge 1 angeben: ");
			float kantenLaenge2 = readFloat("Kantenlänge 2 angeben: ");
			result = kantenLaenge1 * kantenLaenge2;
			break;
			
		case "Quadrat":
			float kantenLaenge = readFloat("Kantenlänge angeben: ");
				result = kantenLaenge * kantenLaenge;
			break;
			
		default: 
			System.out.println("Unbekannte Form :( ");
			isValid = false;
		}
		
		if (isValid) {
			System.out.format("Die Fläche von deinem " + word + " beträgt %.2f" , result);
		}
		
	}

}
