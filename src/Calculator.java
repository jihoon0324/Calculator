import javax.swing.*;

public class Calculator extends JFrame {
    private JTextField inputSpace;
    public Calculator(){
        setLayout(null);
        inputSpace = new JTextField();
        setTitle("Calculator");
        setVisible(true);
        setSize(300,370);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
