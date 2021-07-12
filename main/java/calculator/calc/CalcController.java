package calculator.calc;

public class CalcController {
	private static CalcController instance = new CalcController();
	private Calc model;
	private CalcView view;

	public CalcController() {
		this.model = Calc.getInstance();
		view = CalcView.getInstance();

	}

	public static CalcController getInstance() {
		return instance;

	}
}
