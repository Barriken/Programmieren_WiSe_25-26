package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task03 {

	public static void main(String[] args) {
		int geld = readInteger("Bitte Geld eingeben in 5 Euro Schritten");
		
		int schein200 = geld / 200;
		int schein100 = (geld % 200) / 100;
		int schein50 = (geld % 100) / 50;
		int schein20 = (geld % 50) / 20;
		int schein10 = (geld % 20) / 10;
		int schein5 = (geld % 10) / 5;
		
		System.out.println("200-Euro Scheine: " + schein200);
		System.out.println("100-Euro Scheine: " + schein100);
		System.out.println("50-Euro Scheine: " + schein50);
		System.out.println("20-Euro Scheine: " + schein20);
		System.out.println("10-Euro Scheine: " + schein10);
		System.out.println("5-Euro Scheine: " + schein5);
	}

}
