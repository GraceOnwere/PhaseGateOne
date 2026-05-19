import java.util.Scanner;

public class TaskTwo{

    public static void main(String [] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter your age: ");

    int age = inputCollector.nextInt();

    int ageInFiveYears = age + 5;

    System.out.printf("You would %d in 5 years time",ageInFiveYears);

    System.out.println();
    }
}
