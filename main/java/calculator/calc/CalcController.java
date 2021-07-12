package calculator.calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {
	private static CalcController instance = new CalcController();
	private Calc model;
	private CalcView view;
	private EqualBtnListener equalBtnListener;

	public CalcController() {
		this.model = Calc.getInstance();
		this.view = CalcView.getInstance();
		
		this.equalBtnListener = new EqualBtnListener();
		view.setequalsBtnListener(equalBtnListener);

	}


	private class EqualBtnListener implements ActionListener {
		EqualBtnListener(){
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			view.setAnswer(String.valueOf(model.calcString(view.getText())));
		}
	}

	public static CalcController getInstance() {
		return instance;

	}
}
