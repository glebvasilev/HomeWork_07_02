package com.company;

class Cat {
    protected String name;
    protected int age;
    static int count;

    public Cat(String name, int age) {
        if (name != null & age > 0)
        System.out.println("Hello, " + name);
        else
            System.out.println("Enter the name and age!");
        count++;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static int getCount(){
        return count;
    }
}
public class Main {

    public static void main(String[] args) {
        Cat c = new Cat("Kitty", 5);
        System.out.println("Now we have " + Cat.getCount() + " cat");
    }
}