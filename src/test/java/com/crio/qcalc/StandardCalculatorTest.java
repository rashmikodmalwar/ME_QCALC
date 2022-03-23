package com.crio.qcalc;

import org.assertj.core.internal.IntArrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }

    @Test
    @DisplayName("Test Addition of Two Integers")
    void TestAdditionOperation(){
        standardCalculator.add(1,1);
        int actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Integers")
    void TestSubtractionOperation(){
        standardCalculator.subtract(1,1);
        int actualResult = standardCalculator.getResult();
        Assertions.assertEquals(0, actualResult);
    }

   @Test
   @DisplayName("Test Multiplication of two Integers")
   void testMultiplicationOperation(){
       standardCalculator.multiply(3, 4);
       int actualResult = standardCalculator.getResult();
       Assertions.assertEquals(12,actualResult);
   }

   @Test
   @DisplayName("Test Division of two Integers")
   void testDivisionOperation(){
       standardCalculator.divide(3, 3);
       int actualResult = standardCalculator.getResult();
       Assertions.assertEquals(1,actualResult);
   }


}
