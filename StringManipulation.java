public class StringManipulation {

    public static void main(String[] args) {
        String str = "Hello";
        String newStr = str.concat(" World");
        String upperStr = newStr.toLowerCase();
        String spaceStr = newStr.substring(1,10);
        String replaceString = newStr.replace("Hello", "Java");
        String allStr =  replaceString.toUpperCase();

        System.out.println(newStr);
        System.out.println(upperStr);
        System.out.println(spaceStr);
        System.out.println(replaceString);
        System.out.println(allStr);

    }
    
}
