package com.company;

/**
 * Created by mf4200 on 2/21/2019.
 */
public class RussianBlue {
    //Properties
    String species;
    String name;

    //Constructor
    public RussianBlue(String cat, String Name) {
        species = cat;
        name = Name;
    }

    //Methods
    public void MakeSound() {
        System.out.println("Hisss");
        return;
    }

    public void PrintName(){
        System.out.println(name);
    }
    public void BeHappy() {
        System.out.println("purrrr");
        SeeLaser();
    }
    public void SeeLaser() {
        System.out.println("*cat pounces*");
    }
}
