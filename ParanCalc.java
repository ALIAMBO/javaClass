package controllers;

public class ParanCalc {
    public static void main(String[] args) {
        // int result1 = 5+2*4;
        // int result2 = (5+2)*4;

        // System.out.println(result1);
        // System.out.println(result2);

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        // .equals will return true even if it wrong
        System.out.println(str1.equals(str3));
    }    
}
