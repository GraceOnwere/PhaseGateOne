import java.util.Scanner;

public class TaskSeven{

    public static void main(String [] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter password: ");

    String password = inputCollector.nextLine();

    String correctPassword = "admin123";

    if (password.equals(correctPassword))

    System.out.println("match!!");
    
    else
    
    System.out.println("Not Match");


    }
}
