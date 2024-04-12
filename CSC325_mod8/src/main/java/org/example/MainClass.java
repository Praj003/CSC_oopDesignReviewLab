package org.example;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {
    public static void main(String[] args) {

        // made scanner to get input
        Scanner scnr  = new Scanner(System.in);

        // creates a new student object
        Student std1= new Student("James", 20);
        System.out.println("Enter the gpa of " + std1.getName() + ": ");
        std1.setGpa(scnr.nextDouble()); // reads and sets the gpa

        // creates a new student object
        Student std2= new Freshman("James", 20, 12);
        System.out.println("Enter the gpa of " + std2.getName() + ": ");
        std2.setGpa(scnr.nextDouble());

        // creates a new student object
        Student std3 = new Senior("John", 30, 90);
        System.out.println("Enter the gpa of " + std3.getName() + ": ");
        std3.setGpa(scnr.nextDouble());
        
        // Prints the methods
        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std3);

    }
}