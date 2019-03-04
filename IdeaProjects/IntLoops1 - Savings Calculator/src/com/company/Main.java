package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner console = new Scanner(System.in);
        System.out.println("Enter Starting Balance in (dollars)");
        double SB = Double.parseDouble(console.nextLine());
        System.out.println("Enter Yearly Contribution in (dollars)");
        double YC = Double.parseDouble(console.nextLine());
        System.out.println("Enter Average Return on (Investment as %)");
        double AR = Double.parseDouble(console.nextLine());
        System.out.println("Enter Number of years for (the report)");
        double NY = Double.parseDouble(console.nextLine());
        int Year = 0;
        NY = NY+1;
        while (NY > Year) {
            SB = SB+YC;
            double ARI = AR/100*SB;
            SB = SB+ARI;
            System.out.println("Year " +Year+": " + SB);
            Year = Year+1;
        }

    }
}
