package org.example;

public abstract class Human {
    private String name;
    private String address;
    private int age;

    // constructor that takes only two paras
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getAddress() ;

    public abstract void setAddress(String address);


    public int getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
}