import java.util.Random;

import java.util.Scanner;

public class NumberGuessingApp{

    public static void main (String [] args){

    Scanner inputCollector = new Scanner(System.in);

    Random randomNumber = new Random();

    int number = randomNumber.nextInt(101);

    int count = 0;
    
        for (int attempts = 0; attempts < 5; attempts++){

            System.out.print("Enter a number: ");
        
            int userInput = inputCollector.nextInt();

            if (1 < userInput && userInput > 100)

            System.out.println("Doesn't count as an attempt\nTry again!'");

           else if (userInput == number){
        
           System.out.println("Correct\nYou're a genius!!!");

           count+=1;

           break;
           }
    
           else if  (userInput < number){

           System.out.println("Higher");
           count+=1;
           }
           else{ 

           System.out.println("lower");
           count+=1;
           }

        }
        
String rating = " ";
if (count == 1)
    rating = "Legendary";

else if (count == 2)
    rating = "Excellent";

else if (count == 3 || count == 4)
    rating = "Good";

else
    rating = "Close!\nBetter luck next time";


System.out.printf("\tFinal Summary\nThe Correct Number is %d attempts used %d %n %s ",number,count,rating);

System.out.println();
    
    }
    
}
