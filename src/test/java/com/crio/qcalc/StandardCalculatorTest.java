package com.crio.qcalc;


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


    @DisplayName("Test Multiplication Overflow of Two Doubles")
    void testMultiplicationOverflowForDoubles(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.multiply(Double.MAX_VALUE,Double.MAX_VALUE);
            }
        });
    }
    
    @Test
    @DisplayName("Test Multiplication Overflow of Two Doubles in which One is Positive and Other is Negative")
    void testMultiplicationOverflowForDoublesOnePosOtherNeg(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.multiply(-Double.MAX_VALUE,Double.MAX_VALUE);
            }
        });
    }

    @Test
    @DisplayName("Test Addition Overflow of Two Doubles")
    void testAdditionOverflowForDoubles(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
            }
        });
    }
    @Test
    @DisplayName("Test Subtraction Overflow of Two Doubles")
    void testSubtractionOverflowForDoubles(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.subtract(-Double.MAX_VALUE,Double.MAX_VALUE);
            }
        });
    }

    @Test
    @DisplayName("Test Addition of Two Doubles")
    void testAdditionOperationForDoubles(){
        standardCalculator.add(1.0,1.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2.5, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Doubles")
    void testSubtractionOperationForDoubles(){
        standardCalculator.subtract(10.0,20.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(-10.5, actualResult);
    }


    @Test
    @DisplayName("Test Addition of Two Integers")
    void testAdditionOperation(){
        standardCalculator.add(1,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2, actualResult);
    }

}
