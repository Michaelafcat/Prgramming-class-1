package com.company;

public class Main {

    public static void main(String[] args) {

        //Animal
        Animal Animal1 = new Animal("Gorilla", "Harambe");
        Animal1.MakeSound();
        Animal1.PrintName();

        //Dog
        Dog Dog1 = new Dog("Odie",false);
        Dog1.MakeSound();
        Dog1.PrintName();
        Dog1.PlayFetch();
        Dog1.getDockedTail();

        //Cat
        Cat Cat1 = new Cat("Half cat, half ladybug", "Catbug");
        Cat1.MakeSound();
        Cat1.PrintName();
        Cat1.BeHappy();
        Cat1.SeeLaser();

        //OrangeTabby
        OrangeTabby OrangeTabby1 = new OrangeTabby("Tabby cat (Orange)", "Punky");
        OrangeTabby1.MakeSound();
        OrangeTabby1.PrintName();
        OrangeTabby1.BeHappy();
        OrangeTabby1.LayonLap();
        OrangeTabby1.SeeLaser();

        //RussianBlue
        RussianBlue RussianBlue1 = new RussianBlue("Russian cat (Blue)", "Bob");
        RussianBlue1.MakeSound();
        RussianBlue1.PrintName();
        RussianBlue1.BeHappy();
        RussianBlue1.SeeLaser();

        //Garfield
        Garfield Garfield1 = new Garfield();
        Garfield1.MakeSound();
        Garfield1.PrintName();
        Garfield1.BeHappy();
        Garfield1.LayonLap();
        Garfield1.SeeLaser();

    }
}
