import java.util.Scanner;

public class TaskThree{

    public static void main(String [] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter your a number: ");

    int firstNumber = inputCollector.nextInt();

    System.out.print("Enter your a number: ");

    int secondNumber = inputCollector.nextInt();

    int sumOfTwoNumbers = firstNumber + secondNumber;

    System.out.printf("The Sum of the two numbers is %d",sumOfTwoNumbers);

    System.out.println();
    }
}
