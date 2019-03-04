package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MyPrintFunction();
        BobPrinter();
             int resultA1=Add(2,2);
        System.out.println(resultA1);
        int resultA2=Add(69,69);
        System.out.println(resultA2);
        int resultA3=Add(-420,0);
        System.out.println(resultA3);
        int resultS1=Sub(2,2);
        System.out.println(resultS1);
        int resultS2=Sub(-47,298);
        System.out.println(resultS2);
        int resultS3=Sub(10,-60);
        System.out.println(resultS3);
        int resultA11=Add1(5);
        System.out.println(resultA11);
        int resultA12=Add1(999);
        System.out.println(resultA12);
        int resultA13=Add1(-421);
        System.out.println(resultA13);
        int resultM1=Mult(2,2);
        System.out.println(resultM1);
        int resultM2=Mult(10,10);
        System.out.println(resultM2);
        int resultM3=Mult(-423,2);
        System.out.println(resultM3);






    }
    static void MyPrintFunction() {
        System.out.println("In MyPrintFunction");
    }

    static void BobPrinter() {
        System.out.println("bob bob bob bob bob");
    }

    static int Add(int num1 , int num2) {
       num1=num1 + num2;
        return num1;
    }

    static int Sub(int num1 , int num2) {
        num2=num1 - num2;
        return num2;
    }

    static int Add1 (int integer1) {
        integer1=integer1 + 1;
        return integer1;
    }

    static int Mult(int num1, int num2){
        num1=num1 * num2;
        return num1;
    }












}
