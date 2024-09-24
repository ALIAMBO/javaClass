
public class differentScopes { 
    
    int instanceVariable = 10;
    double instanceVariableDouble = 10.09;
    String instanceVariableString = "This is a string";

    // add static is just for this once meaning can't be use by another instance anymore.
    static int instanceVariableStatic = 20;

    public void showLocalVariable(){
        String localVariable = "Finish";
        int lovalVariable = 30;
        System.out.println("The local variable is "+ lovalVariable + " "+ localVariable);
    }

    public void showNAme(){
        String name1 = "Tamola Tamola";
        String name2 = "this is me and I am me";
        String name3 ="Ahmad Temola";
        System.out.println(name1 +" "+ name2 + " "+ name3);
        
    }

    public void calculate(){
        int k=5;
        int i=7;
        double q=9.99;

        if (k>3) {
            System.out.println(i + q);
        }else {
            System.out.println(k);
        }
    }

    public static void main(String []args){
        // varaibleScopeExample example = new varaibleScopeExample();
        differentScopes example = new differentScopes();
       
        example.showNAme();
        example.calculate();
        System.out.println("This is an examole of " + example.instanceVariable + " and " + example.instanceVariableDouble);
        example.showLocalVariable();
    }
}
