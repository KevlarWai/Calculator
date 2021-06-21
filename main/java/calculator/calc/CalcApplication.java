package calculator.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CalcApplication.class, args);
		CalcModel calc = new CalcModel();
		System.out.println(calc.calculate(2, 3, '/'));
	
	
	}

}
