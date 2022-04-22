import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private JTextField inputSpace;
    public Calculator(){
        setLayout(null);
        inputSpace = new JTextField();
        inputSpace.setEditable(false);
inputSpace.setBackground(Color.white);
inputSpace.setHorizontalAlignment(JTextField.RIGHT);
input
        setTitle("Calculator");
        setVisible(true);
        setSize(300,370);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
