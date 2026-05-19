import java.util.Scanner;

public class TaskFour{

    public static void main(String [] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter your a number: ");

    int firstNumber = inputCollector.nextInt();

    System.out.print("Enter your a number: ");

    int secondNumber = inputCollector.nextInt();

    if (firstNumber > secondNumber)
    
    System.out.printf("%d",firstNumber);
    
    else
    
    System.out.printf("%d",secondNumber);

    System.out.println();

    }
}
