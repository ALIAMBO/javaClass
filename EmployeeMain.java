//import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class EmployeeMain {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        Employee[] employee = new Employee[3];
        LocalDateTime dateT = LocalDateTime.now();

        ArrayList<String>name = new ArrayList<>();

        name.add("Rashid");
        name.add("Abuya");
        name.add("Arif");
        
        ArrayList<Double>baseSalary = new ArrayList<>();

        baseSalary.add(2000.0);
        baseSalary.add(15000.0);
        baseSalary.add(11000.0);

        ArrayList<Double>healthAllowance = new ArrayList<>();

        healthAllowance.add(2500.0);
        healthAllowance.add(10000.0);
        healthAllowance.add(1030.0);

        ArrayList<Double>transportAllowance = new ArrayList<>();

        transportAllowance.add(200.0);
        transportAllowance.add(1500.0);
        transportAllowance.add(100.0);

        for(int i =0 ; i <employee.length; i++){
            employee[i] = new Employee(name.get(i), baseSalary.get(i), healthAllowance.get(i), transportAllowance.get(i));
        }

        for(int j=0; j< employee.length ; j++){

            employee[j].display();
        }

        System.out.println("----------------------------------------");

        // for(int i =0 ; i <employee.length; i++){
            

        //     System.out.println("Please insert employee's name");
        //     String name = scanner.next();

        //     System.out.println("Please insert base salary");
        //     double baseSalary = scanner.nextDouble();

        //     System.out.println("Please insert Health Allowance");
        //     double healthAllowance = scanner.nextDouble();

        //     System.out.println("Please insert Transport Allowance");
        //     double transportAllowance = scanner.nextDouble();

        //     employee[i] = new Employee(name, baseSalary, healthAllowance, transportAllowance);

        // }
        // try {
           
            
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println("Error 404 : "  + e.getMessage());
        // }

        //System.out.println("The programme will continue");

    
        //scanner.close();
        
    }
    
}
