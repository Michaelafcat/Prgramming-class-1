package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        double Num1 = scan1.nextDouble();
        double Num2 = scan1.nextDouble();
        double Num3 = scan1.nextDouble();
        System.out.println("Sum is " + (Num1+Num2+Num3));
        System.out.println(("Average is " + Num1+Num2+Num3/3.0));

    }

}
