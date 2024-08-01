import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    JButton[] numberbutton = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JPanel panel;
    JTextField text;
    Font font = new Font("Calibri", Font.BOLD, 25);
    char operator;
    Calculator() {
        setTitle("Calculator");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 550);
        setLocation(400,100);
        functionoperation();
        setVisible(true);
    }
    private void functionoperation(){
        // text
        text=new JTextField();
        text.setFont(font);
        text.setBounds(10,10,430,50);
        add(text);
        //panel
        panel=new JPanel();
        panel.setBounds(10,80,430,350);
        // panel.setBackground(Color.BLACK);
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
