package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner console = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double Num1;
        try {
            Num1 = Double.parseDouble(console.nextLine());
        } catch (NumberFormatException Ex) {
            System.out.println("invalid Input" + Ex);
            return;
        }

        double Num2;
        try {
            Num2 = Double.parseDouble(console.nextLine());
        } catch (NumberFormatException Ex) {
            System.out.println("invalid Input" + Ex);
            return;
        }
        System.out.println("Sum is " + (Num1+Num2));


    }
}
