package calculator.calc;

public class CalcModel {

    public double calculate(int value, int value2, char operator) {
        double answer = 0.0;

        switch (operator) {
            case '+':
                answer = value + value2;
                break;
            case '-':
                answer = value - value2;
                break;
            case '*':
                answer = value * value2;
                break;
            case '/':
                answer = value / value2;
                break;
        }
        return answer;
    };
}
