import java.util.function.Predicate;

public class LambdaExamples {
    public static void main(String[] args) {
        Predicate<Integer>isGreaterThanThen = (num) -> num >10;
        int number = 15;
        int newNum = 9;

        if (isGreaterThanThen.test(number)) {
            System.out.println(number + " is greater than 10");
        } else {
            System.out.println(number + "is lesser than 10");
        }

        if (isGreaterThanThen.test(newNum)) {
            System.out.println(newNum + " is greater than 10");
        }else {
            System.out.println(newNum + " is lesser than 10");
        }

    }
}
