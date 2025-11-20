package de.tha.wi1;

import static de.tha.tools.Window.*;

public class Task04 {
	public static void main(String[] args) {
		drawCheckBoard(8, 8);
	}
	
	public static void drawCheckBoard(int row, int col) {
		int windowSize = 800;
		initWindow(windowSize, windowSize, "Wer das liest ist doof");
		int tileSize = windowSize / row;
		int yCoordinate = 0;
		for (int i = 0; i < row; i++) 
		{
			int xCoordinate = 0;
			boolean printWhite = true;
			for (int j = 0; j < col; j++) 
			{
				String color = null;
				if (printWhite) {
					color = "white";
					printWhite = false;
				}
				else {
					color = "black";
					printWhite = true;
				}
				drawFilledRectangle(yCoordinate, xCoordinate, tileSize, tileSize, color);
				xCoordinate += tileSize;
			}
			yCoordinate += tileSize;
		}
		
	}
}
