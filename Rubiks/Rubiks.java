package Rubiks;
import javax.swing.*;    // For JFrame and JPanel
import java.awt.*;       // For Color, Container, and GridLayout
public class Rubiks{
   public static void main(String[] args){
      JFrame theGUI = new JFrame();
      theGUI.setTitle("Rubiks Cube");
      theGUI.setSize(200, 200);
      theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel panel1 = new JPanel(); 
      panel1.setBackground(Color.white);
      JPanel panel2 = new JPanel(); 
      panel2.setBackground(Color.red);
      JPanel panel3 = new JPanel(); 
      panel3.setBackground(Color.green);
      JPanel panel4 = new JPanel(); 
      panel4.setBackground(Color.orange);
      JPanel panel5 = new JPanel(); 
      panel5.setBackground(Color.green);
      JPanel panel6 = new JPanel(); 
      panel6.setBackground(Color.blue);
      JPanel panel7 = new JPanel(); 
      panel7.setBackground(Color.red);
      JPanel panel8 = new JPanel(); 
      panel8.setBackground(Color.white);
      JPanel panel9 = new JPanel(); 
      panel9.setBackground(Color.red);
      Container pane = theGUI.getContentPane();
      pane.setLayout(new GridLayout(3, 3));
      pane.add(panel1);
      pane.add(panel2);
      pane.add(panel3);
      pane.add(panel4);
      pane.add(panel5);
      pane.add(panel6);
      pane.add(panel7);
      pane.add(panel8);
      pane.add(panel9);
      theGUI.setVisible(true);
   }
}