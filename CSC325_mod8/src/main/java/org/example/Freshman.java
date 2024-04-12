package org.example;

public class Freshman extends Student{
    private int credits;

    // constructor that takes in name,age and credits
    public Freshman(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }                        // getters and setters for credits
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String toString(){     // method that prints credits
        return super.toString() + ", Credits: " + getCredits();
    }
}