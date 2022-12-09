package CardGame;

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

public class DrawCardImage {
    public static void main(String[] args){
    int cardHeight = 30;
    int cardWidth = 30;
    int imageWidth = 250;
    int imageHeight = 350;
       
    BufferedImage image = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_RGB);
        
    Graphics g = image.getGraphics();
    //create a card
		Card c1 = new Card(Rank.DEUCE, Suit.CLUBS);

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
		g.setColor(Color.BLACK);
		g.drawString("" + c1.getRank(), fromLeft, fromTop);

		//place Suit below Rank 
		//fromLeft += 5;
		fromTop = 50;
		g.drawString(c1.getSuit(), fromLeft, fromTop);

        //bottom right Rank + Suit
        fromLeft = 25;
        fromTop = 35;
        g.drawString("" + c1.getRank(), imageWidth - fromLeft, imageHeight - fromTop);

        fromTop = 10;
		g.drawString(c1.getSuit(), imageWidth - fromLeft, imageHeight - fromTop);

        //draw Suits on the card
        font = new Font(Font.DIALOG, Font.BOLD, 50);
		g.setFont(font);
		g.drawString(c1.getSuit(), imageWidth / 2 - 20, 80);
		g.drawString(c1.getSuit(), imageWidth / 2 - 20, imageHeight - 40);

		//below is saving to a file code
		String fileName = "card2.png";
		File file = new File(fileName);
		try {
			ImageIO.write(image, "png", file);
		} catch (IOException e) {
			String message = "Could not save " + fileName;
			JOptionPane.showMessageDialog(null, message);
		}

    }
    
}