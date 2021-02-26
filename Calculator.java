package javalab;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
   private static JTextField inputBox;

   Calculator(){}
   public static void main(String[] args) {
      createWindow();
   }

   private static void createWindow() {          
      JFrame frame = new JFrame("Calculator");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      createUI(frame);
      frame.setSize(500,500);            
      frame.setVisible(true);
   }

   private static void createUI(JFrame frame) {
      JPanel panel = new JPanel();
      Calculator calculator = new Calculator();
      GridBagLayout layout = new GridBagLayout();          
      GridBagConstraints gbc = new GridBagConstraints();
      panel.setLayout(layout);
   
      inputBox = new JTextField(10);        
      inputBox.setEditable(false);
      JButton b[]=new JButton[10];
      for (int i=0;i<=9;i++) {
    	   b[i]=new JButton(""+i);
    	   b[i].addActionListener(calculator);
      }
      
      JButton bPlus = new JButton("+");JButton bMinus = new JButton("-");
      JButton bDivide = new JButton("/");JButton bMultiply = new JButton("*");
      JButton bClear = new JButton("C");JButton bEquals = new JButton("=");

      bPlus.addActionListener(calculator);bMinus.addActionListener(calculator);
      bDivide.addActionListener(calculator);bMultiply.addActionListener(calculator);
      bClear.addActionListener(calculator);bEquals.addActionListener(calculator);

      gbc.fill = GridBagConstraints.BOTH;

      gbc.gridx = 0; gbc.gridy = 0; panel.add(b[1], gbc);        
      gbc.gridx = 1; gbc.gridy = 0; panel.add(b[2], gbc);
      gbc.gridx = 2; gbc.gridy = 0; panel.add(b[3], gbc);
      gbc.gridx = 3; gbc.gridy = 0; panel.add(bPlus, gbc);
      gbc.gridx = 0; gbc.gridy = 1; panel.add(b[4], gbc);
      gbc.gridx = 1; gbc.gridy = 1; panel.add(b[5], gbc);
      gbc.gridx = 2; gbc.gridy = 1; panel.add(b[6], gbc);
      gbc.gridx = 3; gbc.gridy = 1; panel.add(bMinus, gbc);
      gbc.gridx = 0; gbc.gridy = 2; panel.add(b[7], gbc);
      gbc.gridx = 1; gbc.gridy = 2; panel.add(b[8], gbc);
      gbc.gridx = 2; gbc.gridy = 2; panel.add(b[9], gbc);
      gbc.gridx = 3; gbc.gridy = 2; panel.add(bDivide, gbc);
      gbc.gridx = 1; gbc.gridy = 3; panel.add(b[0], gbc);
      gbc.gridx = 0; gbc.gridy = 3; panel.add(bClear, gbc);
      gbc.gridx = 3; gbc.gridy = 3; panel.add(bMultiply, gbc);
      gbc.gridx = 2; gbc.gridy = 3; panel.add(bEquals, gbc);
       
      gbc.gridwidth = 5;
      gbc.gridx = 0; gbc.gridy = 4; panel.add(inputBox, gbc);      
      frame.getContentPane().add(panel, BorderLayout.CENTER);        
   }

   public void actionPerformed(ActionEvent e) {
      String command = e.getActionCommand();
      if (command.charAt(0) == 'C') {                      
         inputBox.setText("");
      }else if (command.charAt(0) == '=') {                    
         inputBox.setText(evaluate(inputBox.getText()));
      }else {                                
         inputBox.setText(inputBox.getText() + command);
      }
   }
 
   public static String evaluate(String expression) {
      char[] arr = expression.toCharArray();
      String operand1 = "",operand2 = "",operator = "";
      int result = 0;

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] >= '0' && arr[i] <= '9') {
            if(operator.isEmpty()){
               operand1 += arr[i];
            }else{
               operand2 += arr[i];
            }
         }  
         
         if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
            operator += arr[i];
         }
      }

      if (operator.equals("+"))
         result = (Integer.parseInt(operand1) + Integer.parseInt(operand2));
      else if (operator.equals("-"))
         result = (Integer.parseInt(operand1) - Integer.parseInt(operand2));
      else if (operator.equals("/"))
         result = (Integer.parseInt(operand1) / Integer.parseInt(operand2));
      else
         result = (Integer.parseInt(operand1) * Integer.parseInt(operand2));          
      return operand1 + operator + operand2 + "=" +result;
   }    
} 
