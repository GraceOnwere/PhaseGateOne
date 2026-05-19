import java.util.Scanner;

public class TaskEight{

    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a number or 0 to stop: ");

    int number = inputCollector.nextInt();

    int sum = 0;

    while(number != 0){

        sum += number;          

        System.out.print("Enter a number or zero to stop: ");

        number = inputCollector.nextInt();
          
    }

    System.out.printf("The sum of numbers is %d",sum);
    
    System.out.println();
    }
}
