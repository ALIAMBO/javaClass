import  java.io.File;
import java.io.FileReader;
public class JavaIo {
    public static void main(String[] args) {

        int [] numbers = {2,4,2,6,8};

        try{
                  
            System.out.println(numbers[6]+1);

        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Caugh an error " + e.getMessage());

        }finally{

            System.out.println("The program continue");

        }

        System.out.println("This is new path");
        
    }
}
