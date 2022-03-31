package com.crio.qcalc;

public class StandardCalculator {

    // public static void getVersion(){
    //     System.out.println("Standard Calculator 1.0");
    // }
    protected double result;
   

    public double getResult(){
       return result;
    }

    public void setResult(int result){
       this.result = result;
    }
    
    //using int datatype
    public final void add(int num1, int num2){
        result =(double) num1+ (double)num2;
    }

    public final void subtract(int num1, int num2){
        result =(double)num1-(double)num2;
    }

    public final void multiply(int num1, int num2){
        result = (double)num1*(double)num2;
    }
 
    public final void divide(int num1, int num2){
        result = (double)num1/(double)num2;
    }

    //using double datatype
    public final void add(double num1,double num2){
        double result = num1+num2;
        if(result == Double.MAX_VALUE || result == Double.POSITIVE_INFINITY){
            throw new ArithmeticException("Double overflow");
        } 

        this.result = result;
    }

    public final void subtract(double num1, double num2){
        double resultSub = num1-num2;
        if(resultSub == -Double.MAX_VALUE || resultSub == Double.NEGATIVE_INFINITY){
            throw new ArithmeticException("Double Overflow");
        }
        this.result = resultSub;
    }

    public final void multiply(double num1, double num2){
        double result = num1*num2;
        if(result == Double.MAX_VALUE || result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY){
            throw new ArithmeticException("Double Overflow");
        }
       this.result = result;
    }
 
    public final void divide(double num1, double num2){
        if(num2 == 0.0){
            throw new ArithmeticException("Divide By Zero");
        }
        result = num1/num2;
    }

    public void clearResult(){
        result = 0;
    }

    public void printResult(){
        System.out.println("Standard Calculator Result : "+result);
    }

    }
