package calculator.calc;

public class Calc {

    public double calculate(double value, double value2, char operator) {
        double answer = 0.0;

        System.out.println("ival1: " + value);
        System.out.println("ival2: " + value2);
        System.out.println("ioperator: " + operator);

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

        if (countOccurancesOperator(equation) > 1) {
            System.out.println("Equation: " + equation);
            System.out.println("First arg: " + equation.substring(0, lastOccuranceOperator(equation)));
            System.out.println("second arg: " + equation.substring(lastOccuranceOperator(equation) + 1));
            System.out.println("end operator: " + equation.charAt(lastOccuranceOperator(equation)));

            return calculate(calcString(equation.substring(0, lastOccuranceOperator(equation))),
                    Double.parseDouble(equation.substring(lastOccuranceOperator(equation) + 1)),
                    equation.charAt(lastOccuranceOperator(equation)));

        } else {

            operator = findFirstOperator(equation);
            operatorPosition = findFirstPositionOperator(equation);

            System.out.println("ioperatorPosition: " + operatorPosition);

            val1 = Double.parseDouble(equation.substring(0, operatorPosition));
            val2 = Double.parseDouble(equation.substring(operatorPosition + 1));

            System.out.println("val1: " + val1);
            System.out.println("val2: " + val2);

            answer = calculate(val1, val2, operator);

            System.out.println("return: " + answer);
            return answer;
        }

    }

    public int countOccurancesOperator(String equation) {
        int totalOperators = 0;

        for (int i = 0; i < equation.length(); i++) {
            if (equation.substring(i).startsWith("+")) {
                totalOperators++;
            } else if (equation.substring(i).startsWith("-")) {
                totalOperators++;
            } else if (equation.substring(i).startsWith("*")) {
                totalOperators++;
            } else if (equation.substring(i).startsWith("/")) {
                totalOperators++;
            }
        }

        return totalOperators;
    }

    public int lastOccuranceOperator(String equation) {

        if ((equation.lastIndexOf("+") > equation.lastIndexOf("-"))
                && (equation.lastIndexOf("+") > equation.lastIndexOf("*"))
                && (equation.lastIndexOf("+") > equation.lastIndexOf("/"))) {
            return equation.lastIndexOf("+");
        } else if ((equation.lastIndexOf("-") > equation.lastIndexOf("+"))
                && (equation.lastIndexOf("-") > equation.lastIndexOf("*"))
                && (equation.lastIndexOf("-") > equation.lastIndexOf("/"))) {
            return equation.lastIndexOf("-");
        } else if ((equation.lastIndexOf("*") > equation.lastIndexOf("+"))
                && (equation.lastIndexOf("*") > equation.lastIndexOf("-"))
                && (equation.lastIndexOf("*") > equation.lastIndexOf("/"))) {
            return equation.lastIndexOf("*");
        } else if ((equation.lastIndexOf("/") > equation.lastIndexOf("+"))
                && (equation.lastIndexOf("/") > equation.lastIndexOf("-"))
                && (equation.lastIndexOf("/") > equation.lastIndexOf("*"))) {
            return equation.lastIndexOf("/");
        }

        return 0;
    }

    public char findFirstOperator(String equation) {

        char operator = '+';

        if (equation.indexOf('+') > 0) {
            operator = '+';
        } else if (equation.indexOf('-') > 0) {
            operator = '-';
        } else if (equation.indexOf('*') > 0) {
            operator = '*';
        } else if (equation.indexOf('/') > 0) {
            operator = '/';
        }

        return operator;
    }

    public int findFirstPositionOperator(String equation) {

        int operatorPosition = 0;

        if (equation.indexOf('+') > 0) {
            operatorPosition = equation.indexOf('+');
        } else if (equation.indexOf('-') > 0) {
            operatorPosition = equation.indexOf('-');
        } else if (equation.indexOf('*') > 0) {
            operatorPosition = equation.indexOf('*');
        } else if (equation.indexOf('/') > 0) {
            operatorPosition = equation.indexOf('/');
        }

        return operatorPosition;
    }
}
