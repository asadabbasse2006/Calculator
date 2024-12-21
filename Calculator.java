import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator implements ActionListener{
     
     // Requirments
     JFrame frame;
     JTextField textField;
     JButton[] numberButtons = new JButton[10];
     JButton[] functionButtons = new JButton[10];
     JButton addButton, subButton, mulButton, divButton;
     JButton decButton, eqButton, delButton, clrButton,offButton, onButton;
     JPanel panel;
     ImageIcon image;

     Font myFont = new Font("Arial",Font.BOLD,30);
     double num1 = 0, num2 = 0, result = 0;
     char operator;

     // Method initialize
     Calculator(){
          
          // Show Confirm Dialog
          JOptionPane.showConfirmDialog(null,"Do you even use calculator?","Select",JOptionPane.YES_NO_OPTION);
          //Initialize Frame
          frame = new JFrame("Calculator");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(550, 550);
          frame.setLayout(null);

          //Set TextField
          textField = new JTextField();
          textField.setBounds(50, 25, 450, 50);
          textField.setFont(myFont);
          textField.setEditable(true);
          textField.setBackground(Color.BLACK);
          textField.setSelectedTextColor(Color.WHITE);
          textField.setCaretColor(Color.WHITE);
          textField.setForeground(Color.white);
          textField.setMargin(new Insets(0,5,0,0));

          //Set Image Icon
          image = new ImageIcon("Icon.png");

          //Initialize Function Buttons Sign
          addButton = new JButton("+");
          subButton = new JButton("-");
          mulButton = new JButton("×");
          divButton = new JButton("÷");
          decButton = new JButton(".");
          eqButton = new JButton("=");
          clrButton = new JButton("Clear");
          delButton = new JButton("←");
          offButton = new JButton("OFF");
          onButton = new JButton("ON");

          // Function Buttons 
          functionButtons[0] = addButton;
          functionButtons[1] = subButton;
          functionButtons[2] = mulButton;
          functionButtons[3] = divButton;
          functionButtons[4] = decButton;
          functionButtons[5] = eqButton;
          functionButtons[6] = delButton;
          functionButtons[7] = clrButton;
          functionButtons[8] = offButton;
          functionButtons[9] = onButton;
          // Function Buttons Properities
          for (int i = 0; i < 10; i++) {
              functionButtons[i].setFont(myFont);
              functionButtons[i].setFocusable(false);
              functionButtons[i].setBackground(Color.red);
              functionButtons[i].addActionListener(this);
          }
          // Number Buttons Properities
          for (int i = 0; i < 10; i++) {
              numberButtons[i] = new JButton(String.valueOf(i));
              numberButtons[i].setFont(myFont);
              numberButtons[i].setFocusable(false);
              numberButtons[i].setBackground(Color.GREEN);
              numberButtons[i].addActionListener(this);

          }
          
          // Set Position of Buttons
          delButton.setBounds(50, 430, 100, 50);
          clrButton.setBounds(150, 430, 120, 50);
          offButton.setBounds(265, 430, 120, 50);
          onButton.setBounds(390, 430, 100, 50);
          
          // Creating an Object for Panel
          panel = new JPanel();
          panel.setBounds(50,100,450,300);
          panel.setLayout(new GridLayout(4,4,10,10));
          panel.setBackground(Color.LIGHT_GRAY);
          panel.add(numberButtons[7]);
          panel.add(numberButtons[8]);
          panel.add(numberButtons[9]);
          panel.add(mulButton);
          panel.add(numberButtons[4]);
          panel.add(numberButtons[5]);
          panel.add(numberButtons[6]);
          panel.add(subButton);
          panel.add(numberButtons[1]);
          panel.add(numberButtons[2]);
          panel.add(numberButtons[3]);
          panel.add(addButton);
          panel.add(decButton);
          panel.add(numberButtons[0]);
          panel.add(eqButton);
          panel.add(divButton);
          
          // Frame Remaining Attributes
          frame.add(panel);
          frame.add(delButton);
          frame.add(clrButton);
          frame.add(offButton);
          frame.add(onButton);
          frame.add(textField);
          frame.setVisible(true);
          frame.setIconImage(image.getImage());
          frame.getContentPane().setBackground(Color.LIGHT_GRAY);

     }
     public static void main(String[] args) {
          
          Calculator calculator = new Calculator();

     }

     // Action Performed Events
     @Override
     public void actionPerformed(ActionEvent e){
          for (int i = 0; i < 10; i++) {
               // Action Performed by Number Buttons
              if(e.getSource()== numberButtons[i]){
               textField.setText(textField.getText().concat(String.valueOf(i)));
              }
          }
          // Action Performed by Decimal Button
          if(e.getSource()==decButton){
               textField.setText(textField.getText().concat("."));
          }
          // Action Performed by Add Button
          if(e.getSource()==addButton){
               num1 = Double.parseDouble(textField.getText());
               operator = '+';
               textField.setText(" ");
          }
          // Action Performed by Subtract Button
          if(e.getSource()==subButton){
               num1 = Double.parseDouble(textField.getText());
               operator = '-';
               textField.setText(" ");
          }
          // Action Performed by Multiply Button
          if(e.getSource()==mulButton){
               num1 = Double.parseDouble(textField.getText());
               operator = '*';
               textField.setText(" ");
          }
          // Action Performed by Division Button
          if(e.getSource()==divButton){
               num1 = Double.parseDouble(textField.getText());
               operator = '/';
               textField.setText(" ");
          }
          // Action Performed by Equal Button
          if(e.getSource()==eqButton){
               num2 = Double.parseDouble(textField.getText());

               switch (operator){
                    case'+':
                    result = num1 + num2;
                    break;
                    case'-':
                    result = num1 - num2;
                    break;
                    case'*':
                    result = num1 * num2;
                    break;
                    case'/':
                    result = num1 / num2;
                    break;
               }
               textField.setText(String.valueOf(result));
               num1 = result;
          }
          // Action Performed by Clear Button
          if(e.getSource()==clrButton){
               textField.setText("");
          }
          // Action Performed by Delete Button
          if(e.getSource()==delButton){
               String string = textField.getText();
               textField.setText("");
               for (int i = 0; i < string.length()-1; i++) {
                   textField.setText(textField.getText() + string.charAt(i));
               }
          }
          // Action Performed by OFF Button
          if(e.getSource()==offButton){
               textField.setEnabled(false);
               for (JButton button : numberButtons) button.setEnabled(false);
               for (JButton button : functionButtons) if (button != null) button.setEnabled(false);
               onButton.setEnabled(true);
               offButton.setEnabled(false);
          }
          // Action Performed by ON Button
          if(e.getSource() == onButton){
               textField.setEnabled(true);
               for (JButton button : numberButtons) button.setEnabled(true);
               for (JButton button : functionButtons) if (button != null) button.setEnabled(true);
               onButton.setEnabled(false);
               offButton.setEnabled(true);
          }
     }
}