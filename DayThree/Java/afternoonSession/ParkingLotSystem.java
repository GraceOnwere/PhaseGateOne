import java.util.Arrays;

public class ParkingLotSystem{

    public static String  checkSlot (int [] array){

      int [] newArray = new int [array.length];

      for (int count = 0; count < array.length; count++){

        if (array[count] == 0){

        array[count] = 1;
        }
    }

    return Arrays.toString(newArray);
     
    }

}
