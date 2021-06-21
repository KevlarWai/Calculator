package calculator.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalcApplicationTests {

	@Test
	void contextLoads() {
		CalcModel calc = new CalcModel();
		assertEquals(calc.calculate(2, 3, '*'), 6);
		assertEquals(calc.calculate(2, 3, '+'), 5);
		assertEquals(calc.calculate(3, 2, '-'), 1);
		assertEquals(calc.calculate(2, 3, '/'), 0.6666666666666666);
	}

}
