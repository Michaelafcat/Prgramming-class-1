package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by mf4200 on 2/21/2019.
 */
public class Animal {
    //Properties
    String species;
    String name;

    //Constructor
    public Animal(String Species, String Name) {
        species = Species;
        name = Name;
    }

    //Methods
    public void MakeSound() {
        System.out.println("Grrr");
        return;
    }

    public void PrintName(){
        System.out.println(name);
    }

}
