package com.company;

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        // write your code here
        String input = input("Whats your name");
        while (true) {
            int YG = 0;
        int theSecretNumber = GenerateNumber();
        while (true) {
            int userGuessedNumber = GetGuess();
            YG = YG + 1;
            if (!CheckGuess(theSecretNumber, userGuessedNumber))
            {
                continue;
            }
            else {
                System.out.println("Your...");
                System.out.println("you guessed " + YG + " times");
                break;
            }
        }
        String Playagain = input("Would you like to play again");

        if (Playagain.equals("yes")) {
            continue;

        }
        else {
            return;
        }
        }
    }


    static String input(String prompt) {
        Scanner console = new Scanner(System.in);
        System.out.println(prompt);
        String input = (console.nextLine());
        return input;
    }
        static int IntInput(String prompt) {
        int int1;
            while(true) {
                try {
                    int1 = Integer.parseInt(input(prompt));
                    break;
                } catch (NumberFormatException e) {
                    continue;


                }
            }
            return int1;
        }
        static int GenerateNumber() {
            Random rand = new Random();
            int n = rand.nextInt(100) + 1;
            return n;
        }

        static int GetGuess() {
        while(true) {
            int userGuessedNumber = IntInput("Guess a number between 1 & 100.");
            if (userGuessedNumber > 100 || userGuessedNumber < 1) {
                continue;
            }

            return userGuessedNumber;
        }
        }
        static void printHint(int theSecretNumber, int userGuessedNumber){
            if (userGuessedNumber<theSecretNumber){
                System.out.println("Your number is too small.");
            }
        if (userGuessedNumber>theSecretNumber){
            System.out.println("Your number is too large.");
        }
        return;

    }
    static boolean CheckGuess(int theSecretNumber, int userGuessedNumber){
            if (userGuessedNumber==theSecretNumber){
                return true;
        }
            if (theSecretNumber!=userGuessedNumber){
                printHint(theSecretNumber, userGuessedNumber);
            }
            return false;
    }






















}
