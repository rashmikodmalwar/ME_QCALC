package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		
		System.out.println("Starting QCalc..");

		StandardCalculator calc = new StandardCalculator();
		 calc.add(1, 1);
		 calc.subtract(4, 2);
		 calc.multiply(4, 6);
		 calc.divide(6, 3);
		 System.out.println(calc.getResult());
		 calc.printResult();
		 calc.clearResult();
		

      System.out.println("Hello world!");
	}

}
