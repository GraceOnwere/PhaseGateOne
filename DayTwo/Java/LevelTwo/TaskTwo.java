import java.util.Scanner;

public class TaskTwo{

    public static void main(String [] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter your a number: ");

    int number = inputCollector.nextInt();

    if (number < 0)
    
    System.out.println("Negative");
    
    else
    
    System.out.println("Positive");

    }
}
