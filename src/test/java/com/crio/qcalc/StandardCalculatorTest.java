package com.crio.qcalc;

import org.assertj.core.api.Assert;
import org.assertj.core.internal.IntArrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }

    @Test
    @DisplayName("Test Addition For Integer")
    void TestAdditionOperation(){
        standardCalculator.add(1,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2, actualResult);
    }
    

    @Test
    @DisplayName("Test Substraction for Integer")
    void testSubtractionOperation(){
        standardCalculator.subtract(10,20);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(-10, actualResult);
    }

    @Test
    @DisplayName("Test Mulipliacation for Integer")
    void testMulipliacationOperation(){
        standardCalculator.multiply(10,20);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(200, actualResult);
    }
    
    @Test
    @DisplayName("Test Division for Integer")
    void testDivisionOperation(){
        standardCalculator.divide(20,10);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    @DisplayName("Test Addition For Double")
    void TestAdditionOperationOverflowForDouble(){
        Assertions.assertThrows(ArithmeticException.class, new Executable(){
        
            @Override
            public void execute() throws Throwable {
                standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
                
            }
        });
    }
    

    @Test
    @DisplayName("Test Substraction for Double")
    void testSubtractionOperationOverflowForDouble(){
        Assertions.assertThrows(ArithmeticException.class, new Executable(){
        
            @Override
            public void execute() throws Throwable {
                standardCalculator.subtract(-Double.MAX_VALUE, Double.MAX_VALUE);
            }
        } );
    }


    @Test
    @DisplayName("Test Multiplication for double")
    public void TestMultiplicationOperationForDouble(){
    standardCalculator.multiply(10.2, 2.0);
    double actualResult = standardCalculator.getResult();
    Assertions.assertEquals(20.4,actualResult);
    }

    @Test
    @DisplayName("Test Division for double")
    public void TestDivisionOperationForDouble(){
        standardCalculator.divide(20.4, 20);
        double actualResult =standardCalculator.getResult();
        Assertions.assertEquals(1.02, actualResult);
    }


}
