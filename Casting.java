//package controllers;


//super class 
class Animal{
    public void sound(){
        System.out.println("Animal Sound");
    }
}

//subclass
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks.");
    }
}

public class Casting {  
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();

        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal;
            myDog.bark();
        }
    }
    
}
