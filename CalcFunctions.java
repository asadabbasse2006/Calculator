
import java.awt.event.*;

public class CalcFunctions implements ActionListener {

    CalcTextField textField;
    CalcButtons buttons;
    double num1, num2, result;
    char operator;

    public CalcFunctions(CalcTextField textField, CalcButtons buttons) {
        this.textField = textField;
        this.buttons = buttons;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == buttons.numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == buttons.decButton) {
            textField.setText(textField.getText().concat("."));
        }
        if (e.getSource() == buttons.addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == buttons.subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == buttons.mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == buttons.divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if (e.getSource() == buttons.eqButton) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource() == buttons.clrButton) {
            textField.setText("");
        }
    }
}
