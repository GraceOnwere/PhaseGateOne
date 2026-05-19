import java.util.Scanner;

public class TaskFour{

    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a number: ");

    int number = inputCollector.nextInt();

    int multiplication;

    for (int count = 1; count <= 12; count++){

        multiplication = number * count;

        System.out.printf("%d x %d = %d\n",number,count, multiplication);
    }
    }
}
