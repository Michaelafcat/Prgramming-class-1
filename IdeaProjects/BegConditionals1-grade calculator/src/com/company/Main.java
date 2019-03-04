package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner userInput;

    public static void main(String[] args) {
	// write your code here
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Number");
        String Grade = userInput.nextLine();
        int Grade1 = Integer.parseInt(Grade);
        if (Grade1 >= 93) {
            System.out.println("A");
        }
        else if (Grade1 >= 90) {
            System.out.println("A-");
        }
        else if (Grade1 >= 87) {
            System.out.println("B+");
        }
        else if (Grade1 >= 83) {
            System.out.println("B");
        }
        else if (Grade1 >= 80 ) {
            System.out.println("B-");
        }
        else if (Grade1 >= 77) {
            System.out.println("C+");
        }
        else if (Grade1 >= 73) {
            System.out.println("C");
        }
        else if (Grade1 >= 70) {
            System.out.println("C-");
        }
        else if (Grade1 >= 67) {
            System.out.println("D+");
        }
        else if (Grade1 >= 63) {
            System.out.println("D");
        }
        else if (Grade1 >= 60) {
            System.out.println("D-");
        }
        else if (Grade1 < 60) {
            System.out.println("E");
        }
        }


    }

