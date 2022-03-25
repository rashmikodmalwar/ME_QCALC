package com.crio.qcalc;

public class StandardCalculator {

    // public static void getVersion(){
    //     System.out.println("Standard Calculator 1.0");
    // }
    private double result;
   

    public double getResult(){
       return result;
    }

    public void setResult(int result){
       this.result = result;
    }
    
    //using int datatype
    public void add(int num1, int num2){
        result =(double) num1+ (double)num2;
    }

    public void subtract(int num1, int num2){
        result =(double)num1-(double)num2;
    }

    public void multiply(int num1, int num2){
        result = (double)num1*(double)num2;
    }
 
    public void divide(int num1, int num2){
        result = (double)num1/(double)num2;
    }

    //using double datatype
    public void add(double num1,double num2){
        result = num1+num2;
    }

    public void subtract(double num1, double num2){
        result =num1-num2;
    }

    public void multiply(double num1, double num2){
        result = num1*num2;
    }
 
    public void divide(double num1, double num2){
        result = num1/num2;
    }

    public void clearResult(){
        result = 0;
    }

    public void printResult(){
        System.out.println("Standard Calculator Result : "+result);
    }

    }
