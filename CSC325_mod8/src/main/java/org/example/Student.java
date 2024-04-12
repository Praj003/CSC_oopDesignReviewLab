package org.example;

public class Student extends Human {
    private double gpa = 0.0;

    public Student(String name, int age) {
        super(name, age);    // constructor for name and age
    }

    @Override
    public String getAddress() {
        return null;}
    @Override
    public void setAddress(String address) {
    }

    public double getGpa() {
        return gpa;
    }
    // Getters and Setters for gpa
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // methods that prints  name age & gpa
    public String toString(){
        return "Name: " + getName() + ", Age: " + getAge() + " , Gpa: " + getGpa();
    }
}