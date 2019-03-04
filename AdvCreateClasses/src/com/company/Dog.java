package com.company;

/**
 * Created by mf4200 on 2/21/2019.
 */
public class Dog {
    //Properties
    String species;
    String name;
    boolean dockedTail;

    //Constructor
    public Dog (String name, boolean DockedTail){
        species = "Dog";
        dockedTail = DockedTail;
    }

    //Methods
    public void MakeSound(){
        System.out.println("Woof");
        return;
    }
    public void PrintName(){
        System.out.println(name);
        return;
    }
    public void PlayFetch(){
        System.out.println("*chases ball 5 times then quits*");
        return;
    }
    public boolean getDockedTail(){return dockedTail;}
}
