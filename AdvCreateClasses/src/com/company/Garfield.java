package com.company;

/**
 * Created by mf4200 on 2/21/2019.
 */
public class Garfield {
    //Properties
    String species;
    String name;

    //Constructor
    public Garfield() {
        species = "Cat";
        name = "Garfield";
    }

    //Methods
    public void MakeSound() {
        System.out.println("mmmm, lasagna");
        return;
    }

    public void PrintName(){
        System.out.println(name);
    }
    public void BeHappy() {
        LayonLap();
        System.out.println("*takes a nap*");
    }
    public void LayonLap() {
        System.out.println("*cuddles on owner's lap*");
    }
    public void SeeLaser() {
        BeHappy();
    }
}
