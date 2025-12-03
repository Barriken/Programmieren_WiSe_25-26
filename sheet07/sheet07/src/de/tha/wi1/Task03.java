package de.tha.wi1;

import static de.tha.tools.Window.*;

public class Task03 {
	
	public static void main(String[] args) {

		int height = 800;
		int width = 800;
		
        initWindow(width, height, "Schneeflocke");

        int size = 600;               // großes Quadrat, damit man was sieht
        int startX = (width - size) / 2;
        int startY = (height - size) / 2;

       // snowflake(startX, startY, size, 4);
        snowflakeStar(startX, startY, size, 4);
		
	}
	public static void snowflake (int x, int y, int s, int depth) 
	{
		if (depth == 0 || s < 3) 
		{
			drawFilledRectangle(x, y, s, s, "cyan");
			return;
		}
		else 
		{
			depth--;
			s = s / 3;
			
			// Die Koordinaten der Schneeflocken können mit s angepasst werden
			snowflake(x + s, y, s, depth);
			snowflake(x + s, y + s, s, depth);
			snowflake(x + s + s, y + s, s, depth);
			snowflake(x + s, y + s + s, s, depth);
			snowflake(x, y + s, s, depth);
		}
	}
	
	
	public static void snowflakeStar (int x, int y, int s, int depth) 
	{
		if (depth == 0 || s < 3) 
		{
			drawFilledRectangle(x, y, s, s, "cyan");
			return;
		}
		else 
		{
			depth--;
			s = s / 3;
			
			// Die Koordinaten der Schneeflocken können mit s angepasst werden
			snowflakeStar(x, y, s, depth);
			snowflakeStar(x, y + 2 * s, s, depth);
			snowflakeStar(x + s, y + s, s, depth);
			snowflakeStar(x + 2 * s, y, s, depth);
			snowflakeStar(x + 2 * s, y + 2 * s, s, depth);
		}
	}
}
