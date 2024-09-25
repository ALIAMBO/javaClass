import java.util.Scanner;

public class Exercise2Week2 {
    private String studentName;
    private int[] scores = new int[3];
    private static double avgScores;

    public Exercise2Week2(String studentName, int math, int science, int english) {
        this.studentName = studentName;
        this.scores[0] = math;
        this.scores[1]= science;
        this.scores[2] = english;
        this.avgScores = calculateAverage();
    }

    public String getName() {
        return studentName;
    }

    public void setName(String studentName) {
        this.studentName = studentName;
    }

    public int[] getScore() {
        return scores;
    }

    public void setScore(int[] scores) {
        this.scores = scores;
    }

    public double getAvgScores() {
        return avgScores;
    }

    public void setAvgScores(double avgScores) {
        this.avgScores = avgScores;
    }

    public double calculateAverage() {
        double totalScores = 0;
        int numSubjects = 3; // Assuming 3 subjects per student

        for (int i = 0; i < numSubjects; i++) {
            
                totalScores += scores[i]; // Summing all scores
           
        }

        // Average of total scores divided by number of subjects for a single student
        avgScores = totalScores / numSubjects;
        return avgScores;
        //System.out.println("Average Score: " + avgScores);
    }

    public String assignedGrade() {
        String grade = "";

        if (avgScores >= 90) {
            grade = "A";
        } else if (avgScores >= 80) {
            grade = "B";
        } else if (avgScores >= 70) {
            grade = "C";
        } else if (avgScores >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        return grade ;
        // System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Exercise2Week2 student = new Exercise2Week2(null,0, 0, 0);
        //Scanner scanner = new Scanner(System.in);
      

        try { 

            String [ ] name = {"Abuya", "Abiya", "Mira", "Miro", "Maru"};

            int[] scores= new int[10];
            
            for(int row=0; row<scores.length; row++){
                student.setAvgScores(scores[row]);
                student.setName(name[row]);
                //String subject = " ";
    
                System.out.println("Name " + student.getName());
    
                // for(int col=0; col<scores.length; col++){
                //     int[] s = student.getScore();
    
                //     if(col == 0){
                //         subject = "Math ";
                //     }else if(col == 1){
                //         subject = "Science ";
                //     }
                //     else if(col == 2){
                //         subject = "English ";
                //     }                
                // }
                
            //    System.out.println(subject);
               
                System.out.print("Average Score: ");
                student.calculateAverage();
                System.out.print("Grade: ");
                student.assignedGrade();
                System.out.println("-------------------------------");
            }            
                
            } catch (ArrayIndexOutOfBoundsException e) {
    
                System.out.println("Bad catch 404 : " + e.getMessage());
            }finally{
                System.out.println("Proceed for another try.");
            }

            System.out.println("The programme will continue.");

        // for (int i = 0; i < 3; i++) {
        //     System.out.println("Please enter student's details:");

        //     // Get student name
        //     System.out.println("Name: ");
        //     String name = scanner.nextLine(); 

        //     // Get scores for each subject
        //     System.out.println("Math's score: ");
        //     int math = scanner.nextInt(); 
            
        //     System.out.println("Science's score: ");
        //      int science= scanner.nextInt();
            
        //     System.out.println("English's score: ");
        //     int english= scanner.nextInt(); 
            
        //     //scanner.nextLine(); 

        //      student = new Exercise2Week2(name, math, science, english);

        //      // Display student's details
        //  System.out.println("Name: " + student.getName() + " "+ student.calculateAverage()+ " " + student.assignedGrade());
      
        // }
         

        //scanner.close();
    }
}
