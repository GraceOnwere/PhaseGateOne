import java.util.Scanner;

public class TaskThree{

    public static void main(String [] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter your a number: ");

    int firstNumber = inputCollector.nextInt();

    System.out.print("Enter your a number: ");

    int secondNumber = inputCollector.nextInt();

    System.out.print("Enter your a number: ");

    int thirdNumber = inputCollector.nextInt();

    double average = (firstNumber + secondNumber + thirdNumber) / 3;

    System.out.printf("The Average of the three numbers is %.2f",average);

    System.out.println();
    }
}
