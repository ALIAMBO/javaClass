package controllers;

public class Person {

    private String gpa;
    private double score ;
    private int years;
    private double avgGpa;
    
    public Person (String gpa, double score, int years, double avgGpa){
        //can change as many times as I want
        this.gpa = gpa;
        this.score = score;
        this.years = years;
        this.avgGpa = avgGpa;
    }

    // no static because 
    public void displayDetails(){
        
       System.out.println(gpa + score +"with "+ years + " years of study");
       
    }

    public static void main(String []args){
        Person person = new Person("My GPA is ", 3.5,4);
        Person person2 = new Person("My sister's GPA is ", 3.7,2);
        Person person3 = new Person("My brother's GPA is ", 3.0,5);
        person.displayDetails();
        person2.displayDetails();
        person3.displayDetails();
    }
}
