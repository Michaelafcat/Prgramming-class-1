package com.company;

/**
 * Created by mf4200 on 2/15/2019.
 */
public class Animal {
    //properties
    private String species;
    String name;
    private String color;
    private int age;

    //constructor
    public Animal(String Color, String Name, String Species){
        age=0;
        color = Color;
        name = Name;
        species = Species;

    }

    //methods
    public void MakeSound(){
        System.out.println("Grrrrr");
    }
    public void SetAge(int newAge){

    }
    public String PrintDescription(){
        System.out.println(name +" is a "+ age +" year old, "+color+" "+species);
    }
}
