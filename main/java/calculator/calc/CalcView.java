package calculator.calc;

import javax.swing.*;
import java.awt.*;

public class CalcView {

    private JFrame frame;

    private int width = 300;
    private int height = 500;
    private int boarder = 30;
    private int textx = 20;
    private int texty = 100;

    public CalcView() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
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

        button0.setBounds(boarder + (1*((width - 2*boarder)/3)),(texty + (boarder * 2) + (40 * 3)), (width - 2*boarder) / 3, (height-(3*boarder) - texty )/6);
        button1.setBounds(boarder + (0*((width - 2*boarder)/3)),(texty + (boarder * 2) + (40 * 0)), (width - 2*boarder) / 3, (height-(3*boarder) - texty )/6);
        button2.setBounds(boarder + (1*((width - 2*boarder)/3)),(texty + (boarder * 2) + (40 * 0)), (width - 2*boarder) / 3, (height-(3*boarder) - texty )/6);
        button3.setBounds(boarder + (2*((width - 2*boarder)/3)),(texty + (boarder * 2) + (40 * 0)), (width - 2*boarder) / 3, (height-(3*boarder) - texty )/6);
        button4.setBounds(boarder + (0*((width - 2*boarder)/3)),(texty + (boarder * 2) + (40 * 1)), (width - 2*boarder) / 3, (height-(3*boarder) - texty )/6);
        button5.setBounds(boarder + (1*((width - 2*boarder)/3)),(texty + (boarder * 2) + (40 * 1)), (width - 2*boarder) / 3, (height-(3*boarder) - texty )/6);
        button6.setBounds(boarder + (2*((width - 2*boarder)/3)),(texty + (boarder * 2) + (40 * 1)), (width - 2*boarder) / 3, (height-(3*boarder) - texty )/6);
        button7.setBounds(boarder + (0*((width - 2*boarder)/3)),(texty + (boarder * 2) + (40 * 2)), (width - 2*boarder) / 3, (height-(3*boarder) - texty )/6);
        button8.setBounds(boarder + (1*((width - 2*boarder)/3)),(texty + (boarder * 2) + (40 * 2)), (width - 2*boarder) / 3, (height-(3*boarder) - texty )/6);
        button9.setBounds(boarder + (2*((width - 2*boarder)/3)),(texty + (boarder * 2) + (40 * 2)), (width - 2*boarder) / 3, (height-(3*boarder) - texty )/6);
        addition.setBounds(boarder + (0*((width - 2*boarder)/4)),(texty + (boarder * 2) + (40 * 4)), (width - 2*boarder) / 4, (height-(3*boarder) - texty )/6);
        subtraction.setBounds(boarder + (1*((width - 2*boarder)/4)),(texty + (boarder * 2) + (40 * 4)), (width - 2*boarder) / 4, (height-(3*boarder) - texty )/6);
        multiply.setBounds(boarder + (2*((width - 2*boarder)/4)),(texty + (boarder * 2) + (40 * 4)), (width - 2*boarder) / 4, (height-(3*boarder) - texty )/6);
        divide.setBounds(boarder + (3*((width - 2*boarder)/4)),(texty + (boarder * 2) + (40 * 4)), (width - 2*boarder) / 4, (height-(3*boarder) - texty )/6);



        panel.add(tf);

        frame.add(button0);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(addition);
        frame.add(subtraction);
        frame.add(multiply);
        frame.add(divide);


        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, inputArea);
        frame.setVisible(true);
    }

}
