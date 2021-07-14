package calculator.calc;

public class Calc {

	private static Calc instance = new Calc();

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

		if (countOccurancesOperator(equation) > 1) {

			return calculate(calcString(equation.substring(0, lastOccuranceOperator(equation))),
					Double.parseDouble(equation.substring(lastOccuranceOperator(equation) + 1)),
					equation.charAt(lastOccuranceOperator(equation)));

		} else {

			operator = findFirstOperator(equation);
			operatorPosition = findFirstPositionOperator(equation);

			val1 = Double.parseDouble(equation.substring(0, operatorPosition));
			val2 = Double.parseDouble(equation.substring(operatorPosition + 1));

			return calculate(val1, val2, operator);

		}

	}

	// Split equations into values with operators, insert into array and sort
	public String operationsOrder(String equation) {
		String newEquation = "error";
		int numberOfValues = countOccurancesOperator(equation);

		String[] splitEquation = new String[numberOfValues];
		// find a way to split equation with apropriate values with operators
		// for(int i = 0; int < numberOfValues; i++){
		// splitEquation[i] = ;
		// }

		return newEquation;
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

	private char findFirstOperator(String equation) {

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

	private int findFirstPositionOperator(String equation) {

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
