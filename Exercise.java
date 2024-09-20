package controllers;

public class Exercise {

    private String car; 
    private double petrol; 

    public String getCarBrand(){
        return car;
    }

    public void setCarBrand(String car){
        this.car = car; 
    }

    public double getPetrolUsage(){
        return petrol;
    }

    public void setPetrolUsage(double petrol){
        this.petrol = petrol; 
    }
    
    public static void main(String[] args) {
        Exercise carUsage = new Exercise();

        //getting data from the matrix 2x2
        //gas usage of car
        //1. car model , 2. how much gas used in 100km
        //switch and loop , get and set to print the amount of petrol usage of a car
         double  [][] petrol = new double[3][3];
         String  [][] car    = new String[3][3];
        
        car [0][0] = "mercedes";car [0][1] = "proton";car [0][2] = "myvi";
        car [1][0] = "persona" ;car [1][1] = "gtr"   ;car [1][2] = "saga";
        car [2][0] = "alphard" ;car [2][1] = "BMW"   ;car [2][2] = "Axia";

        petrol [0][0] = 20 ;petrol [0][1] = 40 ;petrol [0][2] = 68;
        petrol [1][0] = 10 ;petrol [1][1] = 50 ;petrol [1][2] = 40;
        petrol [2][0] = 30 ;petrol [2][1] = 49 ;petrol [2][2] = 17; 

        for(int row =0; row<car.length;row ++){
           
            for (int col =0; col < car[row].length;col++){
                
                carUsage.setCarBrand(car[row][col]);
                carUsage.setPetrolUsage(petrol[row][col]);
         
                System.out.println(carUsage.getCarBrand()+" has used "+ carUsage.getPetrolUsage() + " litres");
               

            }
        }


    }
}
