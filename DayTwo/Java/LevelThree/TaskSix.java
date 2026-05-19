import java.util.Scanner;

public class TaskSix{

    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a number: ");

    int number = inputCollector.nextInt();

    int sum = 0;

    for (int count = 1; count <= number; count++){

        sum += count;    
    }

    System.out.printf("The sum of numbers from 1 to %d is %d",number,sum);
    
    System.out.println();
    }
}
