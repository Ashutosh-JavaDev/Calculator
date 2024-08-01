import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    JButton[] numberbutton = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton add, sub, mul, div, clr, del, equal, point;
    JPanel panel;
    JTextField text;
    Font font = new Font("Calibri", Font.BOLD, 25);
    char operator;
    double num1 = 0, num2 = 0, result;

    Calculator() {
        setTitle("Calculator");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 550);
        setLocation(400, 100);
        functionoperation();
        setVisible(true);
    }

    private void functionoperation() {
        // text
        text = new JTextField();
        text.setFont(font);
        text.setEditable(false);
        text.setBounds(10, 10, 430, 50);
        add(text);
        // panel
        panel = new JPanel();
        panel.setBounds(10, 80, 430, 350);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setFont(font);
        add(panel);

    }

    public static void main(String[] args) throws Exception {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}
