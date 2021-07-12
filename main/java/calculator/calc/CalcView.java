package calculator.calc;

import javax.swing.*;
import java.awt.*;

public class CalcView {

	private static CalcView instance = new CalcView();
	private JFrame frame;

	private int width = 300;
	private int height = 500;
	private int boarder = 30;
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
		JButton equals = new JButton("=");

		int buttonWidth = (width - (2 * boarder)) / 3;
		int buttonHeight = (height - (3 * boarder) - texty) / 6;
		int calcButtonWidth = (width - (2 * boarder)) / 4;
		int xposition = (width - (2 * boarder)) / 3;
		int yposition = (height - (3 * boarder) - texty) / 6;

		button0.setBounds(boarder + (1 * xposition), (texty + boarder) + (yposition * 3), buttonWidth, buttonHeight);
		button1.setBounds(boarder + (0 * xposition), (texty + boarder) + (yposition * 0), buttonWidth, buttonHeight);
		button2.setBounds(boarder + (1 * xposition), (texty + boarder) + (yposition * 0), buttonWidth, buttonHeight);
		button3.setBounds(boarder + (2 * xposition), (texty + boarder) + (yposition * 0), buttonWidth, buttonHeight);
		button4.setBounds(boarder + (0 * xposition), (texty + boarder) + (yposition * 1), buttonWidth, buttonHeight);
		button5.setBounds(boarder + (1 * xposition), (texty + boarder) + (yposition * 1), buttonWidth, buttonHeight);
		button6.setBounds(boarder + (2 * xposition), (texty + boarder) + (yposition * 1), buttonWidth, buttonHeight);
		button7.setBounds(boarder + (0 * xposition), (texty + boarder) + (yposition * 2), buttonWidth, buttonHeight);
		button8.setBounds(boarder + (1 * xposition), (texty + boarder) + (yposition * 2), buttonWidth, buttonHeight);
		button9.setBounds(boarder + (2 * xposition), (texty + boarder) + (yposition * 2), buttonWidth, buttonHeight);
		addition.setBounds(boarder + (0 * ((width - (2 * boarder)) / 4)), (texty + boarder) + (yposition * 4),
				calcButtonWidth, buttonHeight);
		subtraction.setBounds(boarder + (1 * ((width - (2 * boarder)) / 4)), (texty + boarder) + (yposition * 4),
				calcButtonWidth, buttonHeight);
		multiply.setBounds(boarder + (2 * ((width - (2 * boarder)) / 4)), (texty + boarder) + (yposition * 4),
				calcButtonWidth, buttonHeight);
		divide.setBounds(boarder + (3 * ((width - (2 * boarder)) / 4)), (texty + boarder) + (yposition * 4),
				calcButtonWidth, buttonHeight);
		equals.setBounds(boarder, (texty + boarder) + (yposition * 5), width - (2 * boarder), buttonHeight);

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
		frame.add(equals);

		frame.getContentPane().add(BorderLayout.NORTH, panel);
		frame.getContentPane().add(BorderLayout.CENTER, inputArea);
		frame.setVisible(true);
	}

	public static CalcView getInstance() {
		return instance;
	}

}
