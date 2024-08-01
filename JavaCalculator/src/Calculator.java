import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    JButton[] numberbutton = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JPanel panel = new JPanel();
    JTextField text;

    Calculator() {
        setTitle("Calculator");
    }

    public static void main(String[] args) throws Exception {
        Calculator ob = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}
