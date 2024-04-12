package org.example;

public class Senior extends Student{
    private int credits;

    //Constructor that sets the credits and chekcs if > 85
    public Senior(String name, int age, int credits) {
        super(name, age);
        if(credits < 85){
            System.out.println("Senior needs to have at least 85 credits!!!");
        }else{
            this.setCredits(credits);
        }
    }

    public String toString(){             //  method that prints
        return super.toString() +  ", Credits: " +  getCredits();
    }

    public int getCredits() {
        return credits;
    }           // Getters and setters for credits
    public void setCredits(int credits) {
        this.credits = credits;
    }
}