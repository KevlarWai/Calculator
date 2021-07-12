package calculator.calc;

import javax.swing.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcApplication {

	public static void main(String[] args) {
		// SpringApplication.run(CalcApplication.class, args);

		CalcController.getInstance();

	}

}
