package controllers;

public class ObjectLifeCycle {
    public static void main(String[] args) {
        String obj1 = new String("Atok");

        //java will print this one instead of "Atok" beacause it cleared cache 
        obj1 = new String("Luqman");

        System.out.println(obj1);
    }
}
