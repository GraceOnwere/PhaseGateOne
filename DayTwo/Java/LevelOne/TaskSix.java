import java.util.Scanner;

public class TaskSix{

    public static void main(String [] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter length of rectangle: ");

    double length = inputCollector.nextDouble();

    System.out.print("Enter width of rectangle: ");

    double width = inputCollector.nextDouble();

    double  areaOfRectangle = length * width;

    System.out.printf("The Area of the Rectangle is %.2f",areaOfRectangle);

    System.out.println();
    }
}
