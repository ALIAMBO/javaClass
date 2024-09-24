//package controllers;
//remove package controllers

//super class
class Animal{
    public void sound(){
        System.out.println("Hop Hop");
    }
}

//subclass
class Dog extends Animal{
    @Override

    public void sound(){
        System.out.println("Barking");
    }
}

//subclass
class Cat extends Animal{
    @Override

    public void sound(){
        System.out.println("Meow");
    }
}

//subclass
class Cow extends Animal{
    @Override

    public void sound(){
        System.out.println("Moo");
    }
}

public class Polymorphsm {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();

        myAnimal = new Cow();
        myAnimal.sound();
        
}
}
