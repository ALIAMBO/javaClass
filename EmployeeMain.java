import java.util.Scanner;
public class EmployeeMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Employee[] employee = new Employee[3];
        

        for(int i =0 ; i <employee.length; i++){
            

            System.out.println("Please insert employee's name");
            String name = scanner.next();

            System.out.println("Please insert base salary");
            double baseSalary = scanner.nextDouble();

            System.out.println("Please insert Health Allowance");
            double healthAllowance = scanner.nextDouble();

            System.out.println("Please insert Transport Allowance");
            double transportAllowance = scanner.nextDouble();

            employee[i] = new Employee(name, baseSalary, healthAllowance, transportAllowance);

        }

        for(int j=0; j< employee.length; j++){
            // employee[j].getName();
            // employee[j].getSalary();
            // employee[j].getHealthAllowance();
            // employee[j].getTransportAllowance();
        

            employee[j].display();
        }

        scanner.close();
        
    }
    
}
