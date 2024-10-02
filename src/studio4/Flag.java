package studio4;

import java.awt.Color;
import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setXscale(0,3);
		StdDraw.setYscale (0,3);
	
		
		   //purple
		   StdDraw.setPenColor(204, 204, 255);
		   StdDraw.filledRectangle(0.5, 1, 0.5, 1);
		   //white
		   StdDraw.setPenColor(255, 255, 255);
		   StdDraw.filledRectangle(1.5, 1, 0.5, 1);
		   //pink
		   StdDraw.setPenColor(255, 182, 193);
		   StdDraw.filledRectangle(2.5, 1, 0.5, 1);
		   //circle in the middle
		   StdDraw.setPenColor(173, 216, 230);
		   StdDraw.filledCircle(1.5, 1, 0.5);
		   
		   Font font = new Font("Comic Sans MS", Font.BOLD,40);
		   StdDraw.setPenColor(Color.BLACK);
		   StdDraw.setFont(font);
		   StdDraw.text(1.5, 2.5, "Studio 4: This is our flag.");
		   
		   Font font2 = new Font("Comic Sans MS", Font.PLAIN,20);
		   StdDraw.setPenColor(Color.BLACK);
		   StdDraw.setFont(font2);
		   StdDraw.text(1.5, 1, "SC RH AB MT");

		   StdDraw.show();
		}

	
	}