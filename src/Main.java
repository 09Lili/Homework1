import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long firstNumber, secondNumber;
        firstNumber = in.nextLong();
        secondNumber = in.nextLong();

        Summator mySummator = new Summator();
        mySummator.setFirstNumber(firstNumber);
        mySummator.setSecondNumber(secondNumber);
        System.out.println("sum = " + mySummator.sum());

    }
}
