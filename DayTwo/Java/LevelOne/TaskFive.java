import java.util.Scanner;

public class TaskFive{

    public static void main(String [] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter Temperature in Celsius: ");

    double temperature = inputCollector.nextDouble();

    int temperatureInFahrenheit = (temperature * (9/5) + 32);

    System.out.printf("The Temperture in Fahrenhit is ",temperatureInFahrenheit);

    System.out.println();
    }
}
