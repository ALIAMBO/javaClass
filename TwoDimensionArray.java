package controllers;
public class TwoDimensionArray {
    public static void main(String[] args) {


            // method number 1
            int [][] matrix = new int [3][4];

        matrix [0][0] = 3;matrix [1][0]= 1;matrix [2][0]= 1;
        matrix [0][1] = 2;matrix [1][1]= 4;matrix [2][1]= 2;
        matrix [0][2] = 2;matrix [1][2]= 1;matrix [2][2]= 2;
        matrix [0][3] = 5;matrix [1][3]= 5;matrix [2][3]= 5;

        for(int row =0; row<matrix.length;row ++){
            for (int col =0; col < matrix[row].length;col++){
                System.out.println(matrix[row][col]);
            }
        }
//------------------------------------------------------------------------------------------------------------------

            // method number 2
            int [][ ] numbers = {
                {1,2,3},
                {2,2,4},
                {3,4,5}
            };

            for(int[]number : numbers){
                for(int value : number ){
                    System.out.println("The value is "+ value);
                }

            }
        
    }
}
