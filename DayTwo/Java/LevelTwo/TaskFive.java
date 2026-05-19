import java.util.Scanner;

public class TaskFive{

    public static void main(String [] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter your a number: ");

    int firstNumber = inputCollector.nextInt();

    System.out.print("Enter your a number: ");

    int secondNumber = inputCollector.nextInt();

    System.out.print("Enter your a number: ");

    int thirdNumber = inputCollector.nextInt();

    int largest = firstNumber;

    if (secondNumber > largest )
    
    largest = secondNumber;

    else if (thirdNumber > largest)

    largest = thirdNumber;
    
    System.out.printf("%d",largest);

    System.out.println();

    }
}
