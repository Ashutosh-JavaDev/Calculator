import javax.swing.*;
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
        setLocation(400,400);
        functionoperation();
        setVisible(true);
    }
    private void functionoperation(){
        // text
        text=new JTextField();
        text.setFont(font);
        text.setBounds(50,10,100,50);
        add(text);
        //panel
        panel=new JPanel();
        panel.setBounds(50,80,100,300);
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
