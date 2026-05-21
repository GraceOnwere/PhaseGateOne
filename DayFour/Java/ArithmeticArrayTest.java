import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticArrayTest{

    @Test
    public void TestThatIhaveAnArrayAndANumberReturnsAnyElementInTheArrayThatGivesTheNumber(){

    int [] array = {8,6,12,4,-2};

    int number = 6;

    String actual = ArithmeticArray.performOperation(array,number);

    String expected = "[8, -2]";

    assertEquals(actual,expected);

    

    }


}
