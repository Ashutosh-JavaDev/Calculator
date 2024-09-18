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
        text.setBounds(10, 20, 430, 50);
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

        functionButtons[0] = add;
        functionButtons[1] = sub;
        functionButtons[2] = mul;
        functionButtons[3] = div;
        functionButtons[4] = point;
        functionButtons[5] = clr;
        functionButtons[6] = del;
        functionButtons[7] = equal;
        // loop
        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(font);
            functionButtons[i].setFocusable(false);
        }
        del.setBounds(15, 480, 200, 50);
        add(del);
        clr.setBounds(230, 480, 200 , 50);
        add(clr);

    }

    private void panelText() {
        // panel
        panel = new JPanel();
        panel.setBounds(10, 100, 430, 350);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setFont(font);
        add(panel);
        panel.add(numberbutton[1]);
        panel.add(numberbutton[2]);
        panel.add(numberbutton[3]);
        panel.add(add);
        panel.add(numberbutton[4]);
        panel.add(numberbutton[5]);
        panel.add(numberbutton[6]);
        panel.add(sub);
        panel.add(numberbutton[7]);
        panel.add(numberbutton[8]);
        panel.add(numberbutton[9]);
        panel.add(mul);
        panel.add(point);
        panel.add(numberbutton[0]);
        panel.add(equal);
        panel.add(div);
    }

    public static void main(String[] args) throws Exception {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        for (int i = 0; i < 10; i++) {
            if (ae.getSource() == numberbutton[i]) {
                text.setText(text.getText().concat(String.valueOf(i)));
            }
        }
        if (ae.getSource() == point) {
            text.setText(text.getText().concat("."));
        }
        if (ae.getSource() == add) {
            num1 = Double.parseDouble(text.getText());
            operator = '+';
            text.setText("");
        }
        if (ae.getSource() == sub) {
            num1 = Double.parseDouble(text.getText());
            operator = '-';
            text.setText("");
        }
        if (ae.getSource() == mul) {
            num1 = Double.parseDouble(text.getText());
            operator = '*';
            text.setText("");
        }
        if (ae.getSource() == div) {
            num1 = Double.parseDouble(text.getText());
            operator = '/';
            text.setText("");
        }
        if (ae.getSource() == equal) {
            num2 = Double.parseDouble(text.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            text.setText(String.valueOf(result));
        }
        if (ae.getSource() == clr) {
            text.setText("");
        }
        if (ae.getSource() == del) {
            String deleteNumber = text.getText();
            int dele = deleteNumber.length();
            if (dele > 0) {
                String sub = deleteNumber.substring(0, dele - 1);
                text.setText(sub);
            }
        }
    }
}
