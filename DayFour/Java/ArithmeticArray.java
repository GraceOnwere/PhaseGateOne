import java.util.Arrays;

public class ArithmeticArray{


    public static void main (String [] args){

    int [] array = {14,9,6,5,8,10};

//    int number = 6;
//
    System.out.println(maxArray(array)); 
    }
    public static String performOperation(int [] array, int number){

    int [] newArray = new int [2];

    
    for (int count = 1; count < array.length ; count++){
    

    if (array[0] + array[count] == number){

        newArray [0] = array[0];

        newArray [1] = array[count]; 
                }
            }
    
    return Arrays.toString(newArray);

    }


    public static String removeDuplicateNumers(int [] array){

    int [] newArray = new int[array.length];

    int counter = 1;

    for (int count = 0; count < array.length; count++){

         if (array[count] == array[counter]){

                continue;
                
                }
            else

             newArray[count] = array[count];

              
            }
        counter++;  
        
    return Arrays.toString(newArray);
    }

    public static String maxArray(int [] array){

    
    int max = array[0];

    int min = array[0];

    int indexes = 0;

    for(int count = 1; count < array.length; count++){

    if (array[count] > max)

     max = array[count];
    }

    for (int counter = 1; counter < array.length;counter++){
    
    if (array[count] < min){
        
        min = array[counter];
        }
    }

    int newArray = new int[max];

    for (int index = min; index < newArray.length; index++ ){

    newArray[indexes] = min;    
    }
    indexes++;
    min++;
    return Arrays.toString (newArray);
    }

}
