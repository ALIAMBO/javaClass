package controllers;
public class OneDimensionArray {
    public static void main(String[] args) {
        int [ ] values ={ 60, 70, 80, 90 , 100};

        // ":" means getting something from something 
        for(int value : values){
            if (value==70) {
                System.out.println("The value is 70");
            }
        }
    }
}
