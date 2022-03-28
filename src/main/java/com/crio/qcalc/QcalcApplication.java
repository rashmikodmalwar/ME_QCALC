package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		
		System.out.println("Starting QCalc..");

		StandardCalculator calc = new StandardCalculator();
		 calc.add(4.0, 3);
		 calc.printResult();
		 calc.subtract(-Double.MAX_VALUE, Double.MAX_VALUE);
		 calc.printResult();
		 calc.multiply(4, 6);
		 calc.printResult();
		 calc.divide(6, 3);
		 calc.printResult();
		 calc.clearResult();
      System.out.println("Hello world!");
	}

}
