import java.util.Scanner;

public class TaskNine{

    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a number: ");

    String number = inputCollector.nextLine();

    int digitCount = number.length();

    System.out.println(digitCount);    
    }

 
}
