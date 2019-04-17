package com.company;

import sun.org.mozilla.javascript.internal.ast.WhileLoop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner Console = new Scanner(System.in);
        //lists for user info (global)

        ArrayList<String> userName = new ArrayList<String>();
        ArrayList<String> password = new ArrayList<String>();

        while (true) {
            //Main menu
            System.out.println("Would you like to (create account) or (login)?");
            String enter = Console.nextLine();
            //creating account

            if (enter.equals("create account")) {
                String Create1;
                while (true) {
                    System.out.println("Create Username:");
                    Create1 = Console.nextLine();
                    if (Checkusername(Create1,userName)!=-1) {
                        System.out.println("information wrong, try again.");
                        continue;

                    } else {
                        break;
                    }
                }
                System.out.println("Enter password:");
                String Create2 = Console.nextLine();
                userName.add(Create1);
                password.add(Create2);
                //login

            } else if (enter.equals("login")) {

                System.out.println("Enter Username:");
                String Check1 = Console.nextLine();
                System.out.println("Enter Password:");
                String Check2 = Console.nextLine();
                int index = Checkusername(Check1,userName);
                if (index!=-1) {

                    if (Checkpassword(Check2,password,index)) {
                        System.out.println("Welcome, " + Check1);
                        Console.nextLine();
                        return;
                    } else {
                        System.out.println("acoount information does not match any current accounts");
                    }
                } else {
                    System.out.println("acoount information does not match any current accounts");
                }


            } else {
                System.out.println("Invalid choice, please try again.");

            }
        }
    }

//returns index if it exists in the list and -1 if it doesnt
    private static int Checkusername(String check1, ArrayList<String> userName) {
      int i =0;
      while(i<userName.size()) {
          if (userName.get(i).equals(check1)) {
              return i;
          }
         i++;
      }
        return -1;
    }

    private static boolean Checkpassword(String check1, ArrayList<String> password, int index) {
        if (password.get(index).equals(check1)) {
            return true;
        }
        return false;
    }

}

