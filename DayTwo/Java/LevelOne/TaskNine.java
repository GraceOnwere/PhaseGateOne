import java.util.Scanner;

public class TaskNine{

    public static void main(String [] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter the price of the item: ");

    double priceOfItem = inputCollector.nextDouble();

    double  tenPercentTax = (priceOfItem * 0.1) + priceOfItem;

    System.out.printf("The ten percent tax on your price is %.2f",tenPercentTax);

    System.out.println();
    }
}
