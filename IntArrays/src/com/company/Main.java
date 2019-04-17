package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Declare's
            //Integers
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        ArrayList<Integer> listOfInts = new ArrayList<Integer>();
        ArrayList<Integer> testScores = new ArrayList<Integer>();

            //Double
        ArrayList<Double> dblList = new ArrayList<Double>();
        ArrayList<Double> listOfDoubles = new ArrayList<Double>();
        ArrayList<Double> playerPoints = new ArrayList<Double>();

            //String
        ArrayList<String> stringList = new ArrayList<String>();
        ArrayList<String> listOfStrings = new ArrayList<String>();
        ArrayList<String> studentName = new ArrayList<String>();

            // lol what
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<String> strList = new ArrayList<String>();

        //Changes to intList
        intList.add(12);
        intList.add(5);
        intList.add(7);
        intList.add(3);

        //intElement
        int intElement = intList.get(0);
        System.out.println(intElement);
        intElement = intList.get(1);
        System.out.println(intElement);
        intElement = intList.get(2);
        System.out.println(intElement);
        intElement = intList.get(3);
        System.out.println(intElement);

        //Changes to intlist 2
        intList.set(13);
        intList.set(8);

        intElement = intList.get(0);
        System.out.println(intElement);
        intElement = intList.get(1);
        System.out.println(intElement);
        intElement = intList.get(2);
        System.out.println(intElement);
        intElement = intList.get(3);
        System.out.println(intElement);

        //Changes to dblList
        dblList.add.(12.1);
        dblList.add.(5.2);
        dblList.add.(7.3);

        //dblElement
        int dblElement = dblList.get(0);
        System.out.println(dblElement);
        dblElement = dblList.get(1);
        System.out.println(dblElement);
        dblElement = dblList.get(2);
        System.out.println(dblElement);

        dblElement.set(13.1);
        dblElement.set(8.2);

        dblElement = dblList.get(0);
        System.out.println(dblElement);
        dblElement = dblList.get(1);
        System.out.println(dblElement);
        dblElement = dblList.get(2);
        System.out.println(dblElement);

        //Changes to strList
        String strList.add("Hi");
        strList.add("How");
        strList.add("Are");
        strList.add("You?");

        String strElement = strList.get(0);
        System.out.println(strElement);
        strElement = strList.get(1);
        System.out.println(strElement);
        strElement = strList.get(2);
        System.out.println(strElement);
        strElement = strList.get(3);
        System.out.println(strElement);

        strList.set("good");
        strList.set("thanks");

        strElement = strList.get(0);
        System.out.println(strElement);
        strElement = strList.get(1);
        System.out.println(strElement);














    }
}
