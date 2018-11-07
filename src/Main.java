import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber, secondNumber;
        firstNumber = in.nextInt();
        secondNumber = in.nextInt();

        Summator mySummator = new Summator();
        mySummator.setFirstNumber(firstNumber);
        mySummator.setSecondNumber(secondNumber);
        System.out.println("sum = " + mySummator.sum());

    }
}
