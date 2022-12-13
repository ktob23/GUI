package Birthday;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class DrawCard {
    public static void main(String[] args){
    int cardHeight = 30;
    int cardWidth = 30;
    int imageWidth = 500;
    int imageHeight = 500;
       
    BufferedImage image = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_RGB);
        
    Graphics g = image.getGraphics();

		//set Font size
		Font font = new Font(Font.DIALOG, Font.BOLD, 24);
		g.setFont(font);
		FontMetrics fm = g.getFontMetrics(font);

		//Create background 
		g.setColor(Color.WHITE);
		g.fillRoundRect(0, 0, imageWidth - 1, imageHeight - 1, 8, 8);
		g.setColor(Color.BLACK);
		g.drawRoundRect(0, 0, imageWidth - 1, imageHeight - 1, 8, 8);

		//place rank on top left
		int fromLeft = 5;
		int fromTop = 25;
		g.setColor(Color.RED);

		//draw lines of stars on top and bottom and heart in middle
		fromTop = 50;
		g.drawString("\u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 ", 0, fromTop);
        
		g.drawString("\u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 \u2736 ", 0, imageHeight - 30);

        g.drawString("\u2764", imageWidth/2-20, imageHeight/2);

        fromTop = 10;

        //draw Names on the card
        font = new Font(Font.DIALOG, Font.BOLD, 50);
        g.setColor(Color.BLACK);
		g.setFont(font);
		g.drawString("Happy Birthday", 0, 100);
		g.drawString("Aston", 0, 155);
		
		g.drawString("From, Kenji", 0, imageHeight - 80);

		//below is saving to a file code
		String fileName = "birthday_card.png";
		File file = new File(fileName);
		try {
			ImageIO.write(image, "png", file);
		} catch (IOException e) {
			String message = "Could not save " + fileName;
			JOptionPane.showMessageDialog(null, message);
		}

    }
    
}