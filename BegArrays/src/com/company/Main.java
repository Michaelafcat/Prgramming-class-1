package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Array Declaration

        //int
        int[] intArray1 = new int[50];
        int[] arrayOfNumbers = new int[3];
        int[] numbersArray = new int[5];

        //double
        double[] dblArray = new double[4];
        double[] arrayOfDoubles = new double[15];
        double[] playerPoints = new double[39];

        //String
        String[] stringArray1 = new String[20];
        String[] arrayOfStrings = new String[25];
        String[] wordArray = new String[6];

        //setting values in array
        //numbersArray
        numbersArray[0] = 12;
        numbersArray[1] = 13;
        numbersArray[2] = 14;
        numbersArray[3] = 15;
        numbersArray[4] = 16;

        //arrayOfNumbers
        arrayOfNumbers[0] = 47;
        arrayOfNumbers[1] = 46;
        arrayOfNumbers[2] = 39;

        //dblArray
        dblArray[0] = 12.43;
        dblArray[1] = 5.12;
        dblArray[2] = 43.21;
        dblArray[3] = 1.34;

        //wordArray
        wordArray[0] = "What";
        wordArray[1] = "is";
        wordArray[2] = "Forrest";
        wordArray[3] = "Gump's";
        wordArray[4] = "password?";
        wordArray[5] = "1Forrest1";

        //Reading values out of an Array
        int number;
        //numbersArray
        number = numbersArray[0]; //number is now 12
        number = numbersArray[1]; //number is now 13
        number = numbersArray[2]; //number is now 14
        number = numbersArray[3]; //number is now 15

        //wordArray
        String word;
        word = wordArray[0]; //String is now "what"
        word = wordArray[2]; //String is now "is"
        word = wordArray[3]; //String is now "Forrest"
        number = numbersArray[3]; //number is now 15
        number = numbersArray[4]; //number is now 16
        word = wordArray[5]; //String is now "1Forrest1"
    }
}
