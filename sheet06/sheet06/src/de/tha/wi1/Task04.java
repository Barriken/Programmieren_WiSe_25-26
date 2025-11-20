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
		int counter = 0;
		for (int i = 0; i < row; i++) 
		{
			int xCoordinate = 0;
			
			for (int j = 0; j < col; j++) 
			{
				String color = null;
				if ((j + i ) % 2 == 0) {
					color = "white";
				}
				else {
					color = "black";
				}
				drawFilledRectangle(xCoordinate, yCoordinate, tileSize, tileSize, color);
				xCoordinate += tileSize;
			}
			yCoordinate += tileSize;
		}
	}
}
