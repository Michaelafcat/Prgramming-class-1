package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner console = new Scanner(System.in); //let the user have inputs

        System.out.println("Enter hour for 12 hr time"); // ask for the hour
        int H12;
        try {
            H12 = Integer.parseInt(console.nextLine());
        } catch (NumberFormatException Ex) {
            System.out.println("invalid Input");
            return;
        }
        if (H12 > 12||H12<1){
            System.out.println("Invalid Input");
            return;
        }
        System.out.println("Enter minute for 12 hr time"); // ask for the minute
        int M12;
        try {
            M12 = Integer.parseInt(console.nextLine());
        } catch (NumberFormatException Ex) {
            System.out.println("invalid Input");
            return;
        }
        System.out.println("Enter seconds for 12 hr time"); // ask for the seconds
        int S12;
        try {
            S12 = Integer.parseInt(console.nextLine());
        } catch (NumberFormatException Ex) {
            System.out.println("invalid Input");
            return;
        }

        if (M12 > 59  || M12<0){
            System.out.println("Invalid Input");
            return;
        }
        if (S12 > 60  || M12<0){
            System.out.println("Invalid Input");
            return;
        }
        // need try catch statments and other sources to check the inputs if there wrong


        System.out.println("Enter AM or PM");
        int myint = (int) 12.5;
        String AP12 = console.nextLine();
        if (H12 <= (11)) {
            if (AP12.equals("AM")) {
                System.out.println(H12 + ":" + M12 + ":" + S12 + AP12);
            }
            if (AP12.equals("PM")) {
                System.out.println(H12 + (12) + ":" + M12 + ":" + S12 + AP12);
            }
        } else if (H12 == (12)) {
            if (AP12.equals("PM")) {
                System.out.println(H12 + ":" + M12 + ":" + S12 + AP12);
            }
            if (AP12.equals("AM")) {
                System.out.println(H12 - (12) + ":" + M12 + ":" + S12 + AP12);
            }
        }
        if (H12 <= 0){
            if (M12 <= 0){
                if (S12 <= 0){
                    System.out.println("Invalid Input");
                }
            }
        }// create if statements to sort out how the code will be displayed for specific scenarios
    }
}
