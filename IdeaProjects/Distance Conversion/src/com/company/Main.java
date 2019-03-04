package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a distance");
        double D;
        try {
            D = Double.parseDouble(console.nextLine());
        } catch (NumberFormatException Ex) {
            System.out.println("invalid Input" + Ex);
            return;
        }
        System.out.println("Meters or Feet");
        String MF;
        MF = (console.nextLine());

        if (MF.equals("Meters")){
            double AN = D/1*3.28;
            System.out.print(AN);
        }
        else if (MF.equals("Feet")){
            double AN = D/3.28;
            System.out.print(AN);
        }
        System.out.println("Feet");
    }
}
