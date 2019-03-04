package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString = "1";
        float myFloat = 10.7f;
        double myDouble = 10.9123457890;
        boolean myBool = true;
        long myLong = 123123;
        int myInt = 12;
        myDouble = myFloat;
        myDouble = myInt;
        myDouble = myLong;
        myDouble = Double.parseDouble(myString);
        myString = "1";
// not all strings can be converted into doubles
        myFloat = 10.7f;
        myDouble = 10.9123457890;
        myBool = true;
        myLong = 123123;
        myInt = 12;
        myFloat = (int) myDouble;
        myFloat = myInt;
        myFloat = myLong;
        myFloat = Float.parseFloat(myString);
// all floats can be converted to a double but not all doubles can be converted into floats
        myString = "1";
        myFloat = 10.7f;
        myDouble = 10.9123457890;
        myBool = true;
        myLong = 123123;
        myInt = 12;
        myInt = (int) myDouble;
        myInt = (int) myInt;
        myInt = (int) myLong;
        myInt = Integer.parseInt(myString);
// double is 10, it is not the same as double because int completely gets rid of the decimal points



    }
}
