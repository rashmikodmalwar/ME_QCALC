package com.crio.qcalc;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		
		System.out.println("Starting QCalc..");

		StandardCalculator calc = new StandardCalculator();
		 calc.add(4.0, 3);
		 calc.printResult();
		 calc.subtract(2, 4);
		 calc.printResult();
		 calc.multiply(4, 6);
		 calc.printResult();
		 calc.divide(6, 3);
		 calc.printResult();
		 calc.clearResult();

		 LogicCalculator calc1 = new LogicCalculator();
		 calc1.OR(8,4);
		 calc1.printResult();
     	 System.out.println("Hello world!");
	}

}
