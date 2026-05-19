import java.util.Scanner;

public class TaskSeven{

    public static void main(String [] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter radius of a circle: ");

    double radius = inputCollector.nextDouble();

    double  circumferenceOfCircle = 2 * 3.142 * radius;

    System.out.printf("The Circumference of the circle is %.2f",circumferenceOfCircle);

    System.out.println();
    }
}
