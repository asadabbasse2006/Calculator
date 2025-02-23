
import java.awt.*;
import javax.swing.*;

public class CalcFrame extends JFrame {

    CalcTextField textField;
    CalcButtons buttons;
    CalcFunctions functions;

    public CalcFrame() {
        // Frame settings
        setTitle("Calculator");
        setSize(550, 550);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.LIGHT_GRAY);

        // Text Field
        textField = new CalcTextField();
        add(textField);

        // Buttons
        buttons = new CalcButtons(textField);
        add(buttons.panel);
        add(buttons.delButton);
        add(buttons.clrButton);
        add(buttons.offButton);
        add(buttons.onButton);

        // Functionality
        functions = new CalcFunctions(textField, buttons);
        buttons.setFunctionality(functions);

        setVisible(true);
    }
}
