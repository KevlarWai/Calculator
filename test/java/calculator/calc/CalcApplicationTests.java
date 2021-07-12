package calculator.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalcApplicationTests {
	Calc calc = new Calc();

	@Test
	void basicCalculate() {
		assertEquals(calc.calculate(2, 3, '*'), 6);
		assertEquals(calc.calculate(2, 3, '+'), 5);
		assertEquals(calc.calculate(3, 2, '-'), 1);
		assertEquals(calc.calculate(2, 3, '/'), 0.6666666666666666);
	}

	@Test
	void calculateString() {
		assertEquals(calc.calcString("2+3"), 5);
		assertEquals(calc.calcString("3-2"), 1);
		assertEquals(calc.calcString("3*3"), 9);
		assertEquals(calc.calcString("2/3"), 0.6666666666666666);
		assertEquals(calc.calcString("3/2"), 1.5);
		assertEquals(calc.calcString("12*5"), 60);
	}

	@Test
	void countOperators() {
		assertEquals(calc.countOccurancesOperator("+*-/+"), 5);
		assertEquals(calc.countOccurancesOperator("2+3*4-5/6+7"), 5);
		assertEquals(calc.countOccurancesOperator("243+563*22-4/2362+4236523"), 5);
		assertEquals(calc.lastOccuranceOperator("1+2*3-4+5"), 7);
	}

	@Test
	void longCalculation() {
		assertEquals(calc.calcString("1+2+3+4+5"), 15);
		assertEquals(calc.calcString("2+2*2"), 8);
		assertEquals(calc.calcString("6+2/2"), 4);
		assertEquals(calc.calcString("12-2/2"), 5);
	}

}
