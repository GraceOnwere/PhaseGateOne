import java.util.Scanner;

public class TaskFour{

    public static void main(String [] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter your a number: ");

    int firstNumber = inputCollector.nextInt();

    System.out.print("Enter your a number: ");

    int secondNumber = inputCollector.nextInt();

    int productOfTwoNumbers = firstNumber * secondNumber;

    System.out.printf("The Product of the two numbers is %d",productOfTwoNumbers);

    System.out.println();
    }
}
