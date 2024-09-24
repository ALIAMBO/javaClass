//remove package controllers first 
package controllers;

    //super class
class Animal {
    public void eat(){
        System.out.println("The animal is eating.");
    }
}

    //subclass
class Dog extends Animal{
    public void bark(){
        System.out.println("The dog is barking.");
    }
}

class Cat extends Animal{
    public void meow(){
        System.out.println("The cat is miewing.");
    }
}

public class Inheritence {
   
    public static void main(String[] args) {
       Dog dog = new Dog();
       Cat cat = new Cat();
       dog.eat();
       dog.bark();
       cat.eat();
       cat.meow();

    }
}
