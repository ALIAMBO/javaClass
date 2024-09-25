
import java.util.function.Predicate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.LocalDate;
import java.time.LocalDate;

public class Employee {
    
    private String name = new String(); 
    private double baseSalary;
    private double healthAllowance =0 ; 
    private double transportAllowance =0;
    private double bonus;
    private double totalSalary ;

    public Employee (String name, double baseSalary, double healthAllowance, double transportAllowance){
        this.name = name;
        this.baseSalary = baseSalary;
        this.healthAllowance = healthAllowance;
        this.transportAllowance = transportAllowance;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return baseSalary;
    }

    public void setSalaray(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public double getHealthAllowance(){
        return healthAllowance;
    }

    public void setHealthAllowance(double healthAllowance){
        this.healthAllowance = healthAllowance;
    }

    public double getTransportAllowance(){
        return transportAllowance;
    }

    public void setTransportAllowance(double transportAllowance){
        this.transportAllowance = transportAllowance;
    }

    public double getBonus (){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double totalSalary(){

        totalSalary = baseSalary + healthAllowance + transportAllowance;

        return totalSalary;
    }

    public double assignBonus(){
       

        double bonus =0;

        if (baseSalary >=5000) {          
            bonus = baseSalary * 0.1 ;
        }
         else if (baseSalary >= 3000 && baseSalary <5000) {
            bonus = baseSalary * 0.05  ;
        }
        else {
            bonus =0;        
        }

        return bonus;
    }

    public void display(){
        Predicate<Double>isGreaterThanThen = (num) -> num >1000;
        
        //LocalDateTime dateT = LocalDateTime.now();
        LocalDate dateD = LocalDate.now();
        
        LocalDate dateBeginning = LocalDate.of(2024, 8, 1);
        LocalDate dateEnd = LocalDate.of(2024, 8, 31);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formateBeginning = format.format(dateBeginning);
        String formateEnding = format.format(dateEnd);

        Period period = Period.between(dateD, dateEnd);

        System.out.println("----------------------------------------");
        System.out.println("Date from " + formateBeginning + " to " + formateEnding);
        System.out.println("Period : " + period +"ay(s)");
        System.out.println("Name : "+ name);
        System.out.println("Total Salary is " + totalSalary());
        System.out.println("Bonus is " + assignBonus());

        if (isGreaterThanThen.test(assignBonus())) {
            System.out.println("Congratulations you got a bonus :)");
        }else{
            System.out.println("No bonus :(");
        }

        

    }

  
}
