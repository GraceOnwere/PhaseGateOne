import java.util.Scanner;

public class TaskNine{

    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a number: ");

    int number = inputCollector.nextInt();


    for (int count = 0; count < number; count++){

        for (int counter = 0; counter <= count; counter++){
        System.out.print("*");
        }
    System.out.println();    
    }

    }
}
