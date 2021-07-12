package calculator.calc;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcView extends JFrame implements ActionListener {

	private static CalcView instance = new CalcView();
	private JFrame frame;

	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton addition;
	private JButton subtraction;
	private JButton multiply;
	private JButton divide;
	private JButton equals;
	private JTextField tf;

	private int width = 300;
	private int height = 500;
	private int boarder = 30;
	private int texty = 100;

	public CalcView() {
		frame = new JFrame("Calculator");
		setBounds(100, 100, width, height);
		getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		tf = new JTextField(10);
		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		addition = new JButton("+");
		subtraction = new JButton("-");
		multiply = new JButton("X");
		divide = new JButton("/");
		equals = new JButton("=");

		int buttonWidth = (width - (2 * boarder)) / 3;
		int buttonHeight = (height - (3 * boarder) - texty) / 6;
		int calcButtonWidth = (width - (2 * boarder)) / 4;
		int xposition = (width - (2 * boarder)) / 3;
		int yposition = (height - (3 * boarder) - texty) / 6;

		tf.setBounds(boarder, boarder, width - (boarder * 2), 40);
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

		add(tf);

		add(button0);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		add(addition);
		add(subtraction);
		add(multiply);
		add(divide);
		add(equals);

		setVisible(true);
	}

	public void setZeroBtnListener(ActionListener listener) {
		button0.addActionListener(listener);
	}

	public void setOneBtnListener(ActionListener listener) {
		button1.addActionListener(listener);
	}

	public void setTwoBtnListener(ActionListener listener) {
		button2.addActionListener(listener);
	}

	public void setThreeBtnListener(ActionListener listener) {
		button3.addActionListener(listener);
	}

	public void setFourBtnListener(ActionListener listener) {
		button4.addActionListener(listener);
	}

	public void setFiveBtnListener(ActionListener listener) {
		button5.addActionListener(listener);
	}

	public void setSixBtnListener(ActionListener listener) {
		button6.addActionListener(listener);
	}

	public void setSevenBtnListener(ActionListener listener) {
		button7.addActionListener(listener);
	}

	public void setEightBtnListener(ActionListener listener) {
		button8.addActionListener(listener);
	}

	public void setNineBtnListener(ActionListener listener) {
		button9.addActionListener(listener);
	}

	public void setAdditionBtnListener(ActionListener listener) {
		addition.addActionListener(listener);
	}

	public void setSubtractionBtnListener(ActionListener listener) {
		subtraction.addActionListener(listener);
	}

	public void setMultiplyBtnListener(ActionListener listener) {
		multiply.addActionListener(listener);
	}

	public void setDivideBtnListener(ActionListener listener) {
		divide.addActionListener(listener);
	}

	public void setequalsBtnListener(ActionListener listener) {
		equals.addActionListener(listener);
	}
	
	public void setText(String text) {
		tf.setText(tf.getText()+ text);
	}
	
	public static CalcView getInstance() {
		return instance;
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
