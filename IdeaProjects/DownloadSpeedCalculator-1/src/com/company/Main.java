package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a download speed in Mb/s");
        double DS;
        DS = Double.parseDouble(console.nextLine());
        System.out.println("Enter a file size");
        double FS;
        FS = Double.parseDouble(console.nextLine());
        System.out.println("Enter a file type(KB,MB,GB)");
        String FT;
        FT = (console.nextLine());
        if (FT.equals("KB")){
            double AN = FS/DS*8/1000;
            System.out.print(AN);
        }
        else if (FT.equals("MB")){
            double AN = FS/DS*8*1;
            System.out.print(AN);
        }

        else if (FT.equals("GB")){
            double AN = FS/DS*8*1000;
            System.out.print(AN);
        }
        System.out.println("seconds");



    }
}
