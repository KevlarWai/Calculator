package calculator.calc;

public class CalcController {
    private Calc model;
    private CalcView view;

    public CalcController(Calc model, CalcView view) {
        this.model = model;
        this.view = view;
    }
}
