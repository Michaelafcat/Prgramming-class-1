package com.company;

/**
 * Created by mf4200 on 2/21/2019.
 */
public class OrangeTabby {
    //Properties
    String species;
    String name;

    //Constructor
    public OrangeTabby(String cat, String Name) {
        species = cat;
        name = Name;
    }

    //Methods
    public void MakeSound() {
        System.out.println("Meow");
        return;
    }

    public void PrintName(){
        System.out.println(name);
    }
    public void BeHappy() {
        System.out.println("*takes a nap*");
        LayonLap();
    }
    public void LayonLap() {
        System.out.println("*cuddles on owner's lap*");
    }
    public void SeeLaser() {
        System.out.println("*cat pounces*");
    }
}
