import javax.swing.*;
import java.awt.GridLayout;
// import java.awt.Color;
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
        panelText();
        setVisible(true);
    }

    private void functionoperation() {
        // text
        text = new JTextField();
        text.setFont(font);
        text.setEditable(false);
        text.setBounds(10, 10, 430, 50);
        add(text);
        // Number Button
        for (int i = 0; i < 10; i++) {
            numberbutton[i] = new JButton(String.valueOf(i));
            numberbutton[i].addActionListener(this);
            numberbutton[i].setFont(font);
            numberbutton[i].setFocusable(false);
        }
        // Function Button
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        point = new JButton(".");
        clr = new JButton("Clear");
        del = new JButton("Delete");
        equal = new JButton("=");

        functionButtons[0]=add;
        functionButtons[1]=sub;
        functionButtons[2]=mul;
        functionButtons[3]=div;
        functionButtons[4]=point;
        functionButtons[5]=clr;
        functionButtons[6]=del;
        functionButtons[7]=equal;
        // loop
        for(int i=0;i<8;i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(font);
            functionButtons[i].setFocusable(false);
        }
        del.setBounds(15, 500, 200, 30);
        add(del);
        clr.setBounds(235,500,200,30);
        add(clr);

    }

    private void panelText() {
        // panel
        panel = new JPanel();
        panel.setBounds(10, 80, 430, 350);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setFont(font);
        add(panel);
        panel.add(numberbutton[1]);
        panel.add(numberbutton[2]);
        panel.add(numberbutton[3]);
        panel.add(functionButtons['+']);
        panel.add(numberbutton[4]);
        panel.add(numberbutton[5]);
        panel.add(numberbutton[6]);
        panel.add(functionButtons['-']);
        panel.add(numberbutton[7]);
        panel.add(numberbutton[8]);
        panel.add(numberbutton[9]);
        panel.add(functionButtons['*']);
        panel.add(functionButtons['.']);
        panel.add(numberbutton[0]);
        panel.add(functionButtons['=']);
        panel.add(functionButtons['/']);
    }

    public static void main(String[] args) throws Exception {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}
