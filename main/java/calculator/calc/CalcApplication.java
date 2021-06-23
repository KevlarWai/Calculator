package calculator.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CalcApplication.class, args);
		Calc calc = new Calc();
		String equ= "1+2*3-4+5";
		System.out.println(equ.substring(calc.lastOccuranceOperator(equ)+1));
	
	}

}
