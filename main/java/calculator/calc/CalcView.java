package calculator.calc;

import javax.swing.*;
import java.awt.*;

public class CalcView {

    private JFrame frame;

    public CalcView() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 500);
        JPanel panel = new JPanel();
        JPanel inputArea = new JPanel(); 
        JTextField tf = new JTextField(10);
        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton addition = new JButton("+");
        JButton subtraction = new JButton("-");
        JButton multiply = new JButton("X");
        JButton divide = new JButton("/");
        panel.add(tf);
        inputArea.add(button1);
        inputArea.add(button2);
        inputArea.add(button3);
        inputArea.add(button4);
        inputArea.add(button5);
        inputArea.add(button6);
        inputArea.add(button7);
        inputArea.add(button8);
        inputArea.add(button9);
        inputArea.add(button0);
        inputArea.add(addition);
        inputArea.add(subtraction);
        inputArea.add(multiply);
        inputArea.add(divide);

        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, inputArea);
        // frame.getContentPane().add(button1);
        // frame.getContentPane().add(button2);
        // frame.getContentPane().add(button3);
        // frame.getContentPane().add(button4);
        // frame.getContentPane().add(button5);
        // frame.getContentPane().add(button6);
        // frame.getContentPane().add(button7);
        // frame.getContentPane().add(button8);
        // frame.getContentPane().add(button9);
        // frame.getContentPane().add(button0);
        frame.setVisible(true);
    }

}
