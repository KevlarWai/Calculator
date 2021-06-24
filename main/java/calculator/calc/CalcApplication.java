package calculator.calc;

import javax.swing.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CalcApplication.class, args);

		Calc model = new Calc();
		CalcView view = new CalcView();

		CalcController controller = new CalcController(model, view);

		// JFrame frame = new JFrame("Calculator");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(300, 300);
        // JButton button = new JButton("Press");
        // frame.getContentPane().add(button); // Adds Button to content pane of frame
        // frame.setVisible(true);

	}

}
