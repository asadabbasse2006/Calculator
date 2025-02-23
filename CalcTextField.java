
import javax.swing.*;
import java.awt.*;

public class CalcTextField extends JTextField {

    Font myFont = new Font("Arial", Font.BOLD, 30);

    public CalcTextField() {
        setBounds(50, 25, 450, 50);
        setFont(myFont);
        setEditable(true);
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        setCaretColor(Color.WHITE);
        setMargin(new Insets(0, 5, 0, 0));
    }
}
