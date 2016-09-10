package calculator;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public final class Main extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private static ArrayList names = new ArrayList();
    private static JFrame frame;
    private static JLabel[] label;
    private static JLabel winLabel = new JLabel();

    private static JTextField display = new JTextField();
    private static JButton one = new JButton("1");
    private static JButton two = new JButton("2");
    private static JButton three = new JButton("3");
    private static JButton four = new JButton("4");
    private static JButton five = new JButton("5");
    private static JButton six = new JButton("6");
    private static JButton seven = new JButton("7");
    private static JButton eight = new JButton("8");
    private static JButton nine = new JButton("9");
    private static JButton zero = new JButton("0");

    private static JButton add = new JButton("+");
    private static JButton divide = new JButton("/");
    private static JButton multiply = new JButton("*");
    private static JButton subtract = new JButton("-");
    private static JButton equal = new JButton("=");
    
    private static JButton clear = new JButton("c");
    
    int firstNum;
    int secondNum;
    int total;
    int plusminus;

    int plusClick;
    int minusClick;
    int multiplyClick;
    int divideClick;

    public Main() throws FileNotFoundException {
        frame = new JFrame("Calculator");
        frame.setSize(255, 220);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);    //center
        display.setBounds(0, 60, 240, 20);
        one.setBounds(0, 120, 60, 20);
        two.setBounds(60, 120, 60, 20);
        three.setBounds(120, 120, 60, 20);
        four.setBounds(0, 100, 60, 20);
        five.setBounds(60, 100, 60, 20);
        six.setBounds(120, 100, 60, 20);
        seven.setBounds(0, 80, 60, 20);
        eight.setBounds(60, 80, 60, 20);
        nine.setBounds(120, 80, 60, 20);
        zero.setBounds(60, 140, 60, 20);
        add.setBounds(180, 80, 60, 20);
        subtract.setBounds(180, 100, 60, 20);
        multiply.setBounds(180, 120, 60, 20);
        divide.setBounds(180, 140, 60, 20);
        equal.setBounds(120, 140, 60, 20);
        clear.setBounds(0, 140, 60, 20);

        frame.add(display);
        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(zero);
        frame.add(add);
        frame.add(multiply);
        frame.add(divide);
        frame.add(subtract);
        frame.add(equal);
        frame.add(clear);

        one.addActionListener(this);//for something to happen when start is clicked
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        equal.addActionListener(this);
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        clear.addActionListener(this);
        
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);   //show frame
    }//end Main

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == one) {
            display.setText(display.getText() + one.getText());
        }
        if (e.getSource() == two) {
            display.setText(display.getText() + two.getText());
        }
        if (e.getSource() == three) {
            display.setText(display.getText() + three.getText());
        }
        if (e.getSource() == four) {
            display.setText(display.getText() + four.getText());
        }
        if (e.getSource() == five) {
            display.setText(display.getText() + five.getText());
        }
        if (e.getSource() == six) {
            display.setText(display.getText() + six.getText());
        }
        if (e.getSource() == seven) {
            display.setText(display.getText() + seven.getText());
        }
        if (e.getSource() == eight) {
            display.setText(display.getText() + eight.getText());
        }
        if (e.getSource() == nine) {
            display.setText(display.getText() + nine.getText());
        }
        if (e.getSource() == zero) {
            display.setText(display.getText() + zero.getText());
        }

        if (e.getSource() == add) {
            firstNum = (Integer.parseInt(String.valueOf(display.getText())));
            display.setText("");
            plusClick = 1;

        } else if (e.getSource() == subtract) {
            firstNum = (Integer.parseInt(String.valueOf(display.getText())));
            display.setText("");
            minusClick = 1;
        } else if (e.getSource() == multiply) {
            firstNum = (Integer.parseInt(String.valueOf(display.getText())));
            display.setText("");
            multiplyClick = 1;
        } else if (e.getSource() == divide) {
            firstNum = (Integer.parseInt(String.valueOf(display.getText())));
            display.setText("");
            divideClick = 1;
        }

        if (e.getSource() == equal) {
            secondNum = (Integer.parseInt(String.valueOf(display.getText())));
            if (plusClick > 0) {
                total = firstNum + secondNum;
                display.setText(String.valueOf(total));
                firstNum = 0;
                secondNum = 0;
                plusClick = 0;
            } else if (minusClick > 0) {
                total = firstNum - secondNum;
                display.setText(String.valueOf(total));
                firstNum = 0;
                secondNum = 0;
                minusClick = 0;
            } else if (multiplyClick > 0) {
                total = firstNum * secondNum;
                display.setText(String.valueOf(total));
                firstNum = 0;
                secondNum = 0;
                multiplyClick = 0;
            } else if (divideClick > 0) {
                total = firstNum / secondNum;
                display.setText(String.valueOf(total));
                firstNum = 0;
                secondNum = 0;
                divideClick = 0;
            }
        }
        if(e.getSource()==clear){
            display.setText("");
        }

    }//end action performed()

    public static void main(String[] args) throws java.io.IOException {
        Main gui = new Main();

        gui.frame.setVisible(true);
    }
}