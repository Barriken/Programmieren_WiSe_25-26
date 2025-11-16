package de.tha.wi1;
import static de.tha.tools.Input.*;

public class Task05 {
	public static void main (String[] args) {
		
		int age = readInteger("Bitte Alter eingeben:");
		int height = readInteger("Bitte Größe in cm eingeben:");
		int weight = readInteger("Bitte Gewicht in Kilogramm eingeben:");
		float activity = readFloat("Bitte Aktivitätsfaktor eingeben:");
		boolean isMan = readBoolean("Mann (true) oder Frau (false)");
		
		int result = (int) Math.round(activity * ((10 * weight) + (6.25 * height) - (5 * age) + (isMan ? 5 : -161)));
		
		System.out.println("Gesamtumsatz: " + result + " kcal pro Tag");
	}
}
