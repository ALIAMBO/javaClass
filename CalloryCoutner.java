package controllers;

public class CalloryCoutner {
    public static void main(String[] args) {
        int calloryCounter = 1700;
        int calloryAdd = 0;
        int callorySum =0;
        String day = ""; 
        
        // int dayCounter =1;
      
        for( int dayCounter = 1; dayCounter < 8; dayCounter ++){
         
            if (dayCounter < 3) {
                
                switch (dayCounter) {
                    case 1:
                        day = "Monday " + calloryCounter;
                        break;
                    case 2:
                        day = "Tuesday " + calloryCounter;
                        break;
                    default:
                    System.out.println("Day not avalaible");
                        break;
                }
                System.out.println(day);
            }
           else{
            calloryCounter = calloryCounter + 100;
            switch (dayCounter) {
                    
            case 1:  
                day = "Monday " +calloryCounter ;         
                //System.out.println("Monday callory : "  + calloryAdd);
                //calloryAdd = calloryCounter ;
                // dayCounter ++;
                break;
            case 2:
                day = "Tuesday " + calloryCounter; 
                //calloryAdd + 200;
                //System.out.println("Tuesday callory : "  +calloryAdd);
                //calloryAdd = calloryAdd + 100;
                // dayCounter ++;
                break;
            case 3:
                day = "Wednesday " + calloryCounter; 
                //calloryAdd + 100;
                //System.out.println("Wednesday callory : "  +calloryAdd);
               //calloryAdd =calloryAdd + 100;
                // dayCounter ++;
                break;
            case 4:
                day = "Thursday " +calloryCounter; 
                //System.out.println("Thursday callory : "  +calloryAdd);
               // calloryAdd = calloryAdd + 100;
                //dayCounter ++;
                break;
            case 5:
                day = "Friday " + calloryCounter; 
                //System.out.println("Friday callory : "  +calloryAdd);
               // calloryAdd = calloryAdd + 100;
                //dayCounter ++;
                break;
            case 6:
                day = "Satuday " + calloryCounter; 
                //System.out.println("Saturday callory : "  +calloryAdd);
               // calloryAdd = calloryAdd + 100;
                //dayCounter ++;
                break;
            case 7:
                day = "Sunday " + calloryCounter; 
                //System.out.println("Sunday callory : "  +calloryAdd);
                //dayCounter ++;
                break;
            default:
            System.out.println("Day not avalaible");
                break;
        
             }
    
            System.out.println(day);
            
           }
                
           
        }

       
        
       
       
    }
    
}
