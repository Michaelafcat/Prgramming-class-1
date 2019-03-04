package com.company;

/**
 * Created by mf4200 on 2/21/2019.
 */
public class Student {
    //Properties
    int studentID;
    String name;
    double contentGrade;
    double workHabitGrade;
    double participation;
    int age;

    //Constuctor
    public Student(String Name, int ID, int Age,) {
        name = Name;
        studentID = ID;
        age = Age;
        contentGrade = 0;
        workHabitGrade = 0;
        participation = 0;


    }
    //Constructor 2
    public Student () {
        name = "TestStudent";
        studentID = -1;
        contentGrade = 0;
        workHabitGrade = 0;
        participation = 0;
        age = 18;
    }
    //Methods
    public void SetContentGrade(int grade) {
        contentGrade = grade;
    }
    public void SetWorkHabitGrade(int grade) {
        workHabitGrade = grade;
    }
    public void SetParticipation(int grade) {
        participation = grade;
    }
    public double GetGrade() {
        return .35*workHabitGrade + .4*contentGrade + .25*participation;
    }
    public double printGrade() {
        System.out.println(.35*workHabitGrade + .4*contentGrade + .25*participation);
        return 0;
    }

}


