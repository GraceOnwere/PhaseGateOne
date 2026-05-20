import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//import ParkingLotSystem;

public class ParkingLotSystemTest{

    @Test
    public void TestThatTheParkingSystemHas20Slot(){

    int [] slot = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    int actual = ParkingLotSystem.checkSlot(slot);

    int expected = 20;

    assertEquals(actual,expected);
    }

    @Test
    public void TestThatACarCanPark(){

    int [] slot = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    slot[0] = 1;

    int actual = ParkingLotSystem.checkSlot(slot);

    int [] expected = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

    assertEquals(actual,expected);


    }



}
