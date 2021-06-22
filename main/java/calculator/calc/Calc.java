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

    public double calcString(String equation) {
        double val1 = 0.0;
        double val2 = 0.0;
        char operator = '+';
        int operatorPosition = 0;
        double answer = 0.0;

        if (equation.indexOf('+') > 0) {
            operatorPosition = equation.indexOf('+');
            operator = '+';
        }else if (equation.indexOf('-') > 0){
            operatorPosition = equation.indexOf('-');
            operator = '-';
        } else if (equation.indexOf('*') > 0){
            operatorPosition = equation.indexOf('*');
            operator = '*';
        }else if (equation.indexOf('/') > 0){
            operatorPosition = equation.indexOf('/');
            operator = '/';
        }

        System.out.println("val1: " + val1 );
        System.out.println("val2: " + val2 );
        System.out.println("operator: " + operator );
        System.out.println("operatorPosition: " + operatorPosition );

        val1 = Double.parseDouble(equation.substring(0,operatorPosition));
        val2 = Double.parseDouble(equation.substring(operatorPosition+1));

        System.out.println("val1: " + val1 );
        System.out.println("val2: " + val2 );

        answer = calculate(val1, val2, operator);

        return answer;
    }
}
