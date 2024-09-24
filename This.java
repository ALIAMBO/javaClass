//package controllers;

//super class
class Animal {
    String name;

    public Animal(String name){
        this.name = name; //this consider as super and can be use everywhere 
    }

    public void sound(){
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal {
    public Dog(String name){
        super(name);
    }

    @Override
    public void sound(){
        super.sound();
        System.out.println(name + " barks");
    }
}

public class This {
    public static void main(String[] args) {
        Dog dog = new Dog("Angear");
        double num = 2.6_5_34;
        System.out.println(num);
        dog.sound();

    }
}
