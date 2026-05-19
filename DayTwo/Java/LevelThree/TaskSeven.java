import java.util.Scanner;

public class TaskSeven{

    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a number: ");

    int firstNumber = inputCollector.nextInt();

    System.out.print("Enter a number: ");

    int secondNumber = inputCollector.nextInt();

    System.out.print("Enter a number: ");

    int thirdNumber = inputCollector.nextInt();

    System.out.print("Enter a number: ");

    int fourthNumber = inputCollector.nextInt();

    System.out.print("Enter a number: ");

    int fifthNumber = inputCollector.nextInt();

    int sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;

    System.out.println(sum);
    }
}
