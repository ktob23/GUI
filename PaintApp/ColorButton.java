package PaintApp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class ColorButton extends JButton{
   //class variables
    private String name;
    private Color color;
    public static Random rand=new Random();

    //instance variable
    public ColorButton(){
        name = "Try me";
        color = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));

        this.setBackground(this.color);
        this.setText(this.name);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color g) {
        color = g;
    }

}