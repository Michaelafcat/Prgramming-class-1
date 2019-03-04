package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code hereH
        Scanner console = new Scanner(System.in);
        System.out.println("enter a number:");
        int input1 = Integer.parseInt(console.nextLine());
        System.out.println("enter a number:");
        int input2 = Integer.parseInt(console.nextLine());

        int x = input1;
        int y = input2;
        if (x > y) {
            x = input2;
            y = input1;
        }
        while (x <= y) {
            //check if x is prime
            int b = 2;
            boolean isPrime = true;
            while (b < x) {
                double v = x % b;
                if (v == 0) {
                    isPrime = false;
                }
                b++;
            }
            //if prime print x
            if (isPrime && x > 1) {
                System.out.println(x + " is prime");
            }
                x++;
            }

        }
    }
