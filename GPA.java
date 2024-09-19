package controllers;

public class GPA {
    private int gpa1;
    private int gpa2;
    private int gpa3;
    // private double avgGpa;
    // private double totalGPa;
    // private double avgGpa;

    public GPA(int gpa1, int gpa2, int gpa3){

        this.gpa1 = gpa1;
        this.gpa2 = gpa2;
        this.gpa3 = gpa3;
     
    }

     public void displaycalculateGpa (){

    double gpasum = gpa1 + gpa2 + gpa3;
    double avgGpa = gpasum/3;   
    System.out.println("Average gpa for this semester is "+ avgGpa);
     }
    
    public static void main(String[] args) {
        GPA gpa = new GPA(2, 3, 2);

        // double totalGPa = gpa.gpa1 + gpa.gpa2 + gpa.gpa3;
        // double avgGpa = totalGPa/3;
        //System.out.println("Average gpa for this semester is "+ avgGpa);
         gpa.displaycalculateGpa();
    }
}
