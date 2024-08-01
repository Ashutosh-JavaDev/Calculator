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
            numberbutton[i].setFocusable(false);
        }
        // Function Button
        add=new JButton("+");
        sub=new JButton("+");
        mul=new JButton("+");
        div=new JButton("+");
        point=new JButton("+");
        clr=new JButton("+");
        del=new JButton("+");
        equal=new JButton("+");

        
        

    }
    private void panelText(){
          // panel
          panel = new JPanel();
          panel.setBounds(10, 80, 430, 350);
          panel.setLayout(new GridLayout(4, 4, 10, 10));
          panel.setFont(font);
          add(panel);
          panel.add(numberbutton[1]);
          panel.add(numberbutton[2]);
          panel.add(numberbutton[3]);
          panel.add(numberbutton[4]);
          panel.add(numberbutton[5]);
          panel.add(numberbutton[6]);
          panel.add(numberbutton[7]);
          panel.add(numberbutton[8]);
          panel.add(numberbutton[9]);
          panel.add(numberbutton[0]);
    }

    public static void main(String[] args) throws Exception {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}
