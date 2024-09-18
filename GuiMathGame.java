
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.Random;




 class GuiMathGame implements ActionListener {
     private int randomNum;
     private int randomNum2;
     private JFrame frame;
     private JPanel panel;

     private JLabel label1;
     private JLabel label2;
     private JTextField textField;

     GuiMathGame(){
         Random random = new Random();
         this.randomNum = random.nextInt(10);
         this.randomNum2 = random.nextInt(10);
         this.frame =new JFrame("GUI Math");


         this.label1 = new JLabel("Correct: 0 Wrong: 0" );
         label1.setHorizontalAlignment(SwingConstants.CENTER);
         String p = Integer.toString(randomNum);
         String q = Integer.toString(randomNum2);
         this.label2 = new JLabel( p + " + "+ q);
         label2.setHorizontalAlignment(SwingConstants.CENTER);
         this.textField = new JTextField();
         textField.setHorizontalAlignment(SwingConstants.CENTER);




         JButton button = new JButton("submit");
         button.addActionListener(this);

         this.panel = new JPanel();
         panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
         panel.setLayout(new GridLayout(0 , 1 ));
         panel.add(label1);
         panel.add(label2);
         panel.add(textField);
         panel.add(button);


         frame.add(panel, BorderLayout.CENTER);
         frame.pack();
         frame.setVisible(true);

     }
     int w = 0;
     int c = 0;


     @Override
     public void actionPerformed(ActionEvent e) {
         int input = Integer.parseInt(textField.getText());
         if(input== randomNum+ randomNum2) {
             c++;
             label1.setText("Correct: " + c + " Wrong: " + w);
         }else{
             w++;
             label1.setText("Correct: " + c + " Wrong: " + w);


         }


     }


     public static void main(String args[] ) {

         GuiMathGame gui = new GuiMathGame();
     }


}import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.Random;




 class GuiMathGame implements ActionListener {
     private int randomNum;
     private int randomNum2;
     private JFrame frame;
     private JPanel panel;

     private JLabel label1;
     private JLabel label2;
     private JTextField textField;

     GuiMathGame(){
         Random random = new Random();
         this.randomNum = random.nextInt(10);
         this.randomNum2 = random.nextInt(10);
         this.frame =new JFrame("GUI Math");


         this.label1 = new JLabel("Correct: 0 Wrong: 0" );
         label1.setHorizontalAlignment(SwingConstants.CENTER);
         String p = Integer.toString(randomNum);
         String q = Integer.toString(randomNum2);
         this.label2 = new JLabel( p + " + "+ q);
         label2.setHorizontalAlignment(SwingConstants.CENTER);
         this.textField = new JTextField();
         textField.setHorizontalAlignment(SwingConstants.CENTER);




         JButton button = new JButton("submit");
         button.addActionListener(this);

         this.panel = new JPanel();
         panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
         panel.setLayout(new GridLayout(0 , 1 ));
         panel.add(label1);
         panel.add(label2);
         panel.add(textField);
         panel.add(button);


         frame.add(panel, BorderLayout.CENTER);
         frame.pack();
         frame.setVisible(true);

     }
     int w = 0;
     int c = 0;


     @Override
     public void actionPerformed(ActionEvent e) {
         int input = Integer.parseInt(textField.getText());
         if(input== randomNum+ randomNum2) {
             c++;
             label1.setText("Correct: " + c + " Wrong: " + w);
         }else{
             w++;
             label1.setText("Correct: " + c + " Wrong: " + w);


         }


     }


     public static void main(String args[] ) {

         GuiMathGame gui = new GuiMathGame();
     }


}