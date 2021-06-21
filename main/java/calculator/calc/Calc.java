package calculator.calc;

public class Calc {

    public double calculate(double value, double value2, char operator) {
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

    public double stringToDouble(String value) {
        double number;
        return number;
    }
}
