package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
 
public class Clicker1{
   //Instance variables for Main clas 
 
   private JButton button;
   private JLabel scoreLabel;
   private Random rand;
   private int score;
 
  
   public Clicker1(){
 
        //create a JFrame Object 
        
        JFrame frame = new JFrame("Clicker Game");
        frame.setSize(800, 600);
        frame.setLayout(null);
     
        rand = new Random();
        scoreLabel = new JLabel("Score : ");
        button= new JButton("Jump");
      
        button.setBounds(100, 100, 100, 50);
        scoreLabel.setBounds(0,0,200,50);
        button.addActionListener(new ActionListener() {
     
          //override actionPerformed Methods
          public void actionPerformed(ActionEvent e) {
    
              
              //increase the score
              score++;
 
              //show score on the screen
                scoreLabel.setText("Score: " + score);
                         
             
              
              //sets button to random color
            Color color = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
            button.setBackground(color);
                
            
               //move button to new random location
              button.setLocation(50+ rand.nextInt(100), 50+ rand.nextInt(100));
                       
            } } );
        frame.add(button);
        frame.add(scoreLabel);
        frame.setVisible(true);
    }
 
}
