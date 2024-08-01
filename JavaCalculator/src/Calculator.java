import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    JButton[] numberbutton = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JPanel panel = new JPanel();
    JTextField text;
    Font font = new Font("Calibri", Font.BOLD, 25);

    Calculator() {
        setTitle("Calculator");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450,550);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        Calculator ob = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}
