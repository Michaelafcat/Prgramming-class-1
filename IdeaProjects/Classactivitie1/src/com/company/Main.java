package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner console = new Scanner(System.in);
        System.out.println("How many numbers do you want to average.");
        int inputx = Integer.parseInt(console.nextLine());
        int t = 0;
        int y = 0;
        while (y < inputx){
            System.out.println("Enter number");
            int inputz = Integer.parseInt(console.nextLine());
            t = t+inputz;
            y++;
        }
        System.out.println(t/inputx);

    }
}
