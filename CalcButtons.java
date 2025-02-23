
import javax.swing.*;
import java.awt.*;

public class CalcButtons {

    JPanel panel;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[14];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, eqButton, delButton, clrButton, offButton, onButton;
    JButton sqrButton, sqrtButton, cubeButton, cubeRooButton;
    Font myFont = new Font("Arial", Font.BOLD, 30);

    CalcTextField textField;

    public CalcButtons(CalcTextField textField) {
        this.textField = textField;
        initButtons();
        setupPanel();
    }

    private void initButtons() {
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
        sqrButton = new JButton("sqr");
        sqrtButton = new JButton("√");
        cubeButton = new JButton("cb");
        cubeRooButton = new JButton("cbt");

        JButton[] allButtons = {addButton, subButton, mulButton, divButton, decButton, eqButton, clrButton, delButton,
            offButton, onButton, sqrButton, sqrtButton, cubeButton, cubeRooButton};
        for (int i = 0; i < allButtons.length; i++) {
            functionButtons[i] = allButtons[i];
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
            functionButtons[i].setBackground(Color.RED);
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setBackground(Color.GREEN);
        }
    }

    private void setupPanel() {
        delButton.setBounds(50, 430, 100, 50);
        clrButton.setBounds(150, 430, 120, 50);
        offButton.setBounds(265, 430, 120, 50);
        onButton.setBounds(390, 430, 100, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 450, 300);
        panel.setLayout(new GridLayout(4, 5, 10, 10));
        panel.setBackground(Color.LIGHT_GRAY);

        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(sqrButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(sqrtButton);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(cubeButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(eqButton);
        panel.add(divButton);
        panel.add(cubeRooButton);
    }

    public void setFunctionality(CalcFunctions functions) {
        for (JButton btn : numberButtons) {
            btn.addActionListener(functions);
        }
        for (JButton btn : functionButtons) {
            btn.addActionListener(functions);
        }
    }
}
