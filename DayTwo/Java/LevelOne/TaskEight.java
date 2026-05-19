import java.util.Scanner;

public class TaskEight{

    public static void main(String [] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter your a number: ");

    int number = inputCollector.nextInt();

    int squareOfNumber = number * number;

    System.out.printf("The Square of the two numbers is %d",squareOfNumber);

    System.out.println();
    }
}
