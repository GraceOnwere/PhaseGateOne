public class LevelFour{

    public static void main (String [] args){

    System.out.println(reverseNumber("123"));

    System.out.println(addTwoNumbers(12,12));

    System.out.println(checkEven(12));

    System.out.println(calculateSquareOfNumber(12));

    System.out.println(celciusToFahrenhit(12));

    System.out.println(getLargestOfThreeNumbers(12,13,15));

    System.out.println(calculateSimpleInterest(5000,0.1,5));

    System.out.println(calculateAreaOfRectangle(6,9));

    }

    public static int addTwoNumbers(int firstNumber,int secondNumber){
    
    int sum = firstNumber + secondNumber;

    return sum;
    }

    public static String checkEven (int number){
    
    if (number % 2 == 0)
        return "Even";

    return "Odd";
    }

    public static int calculateSquareOfNumber(int number){

    int squareOfNumber = number * number;

    return squareOfNumber;
    }

    public static double celciusToFahrenhit(double temperature){

    double tempInFahrenhit = (temperature * (9/5)) + 32;

    return tempInFahrenhit;
    }

    public static int getLargestOfThreeNumbers(int numberOne, int numberTwo, int numberThree){
    
    int largest = numberOne;

    if (numberTwo > largest)
        largest = numberTwo;
       
    if (numberThree > largest)
        largest = numberThree;
        
    return largest;
    }

    public static double calculateSimpleInterest(double principal, double rate, int time){
    
    double simpleInterest = principal * rate * time;

    return simpleInterest;
    }

    public static double calculateAreaOfRectangle(double length, double width){
    
    double area = length * width;

    return area;
    }

    public static String reverseNumber (String number){
    
    String reversedNumber = "";

    for (int count = number.length(); count > 0; count++ ){
//    reversedNumber += charAt[count];
    }

    return reversedNumber;
    }

//    public static int checkOccurrences(String word){
//    
//    String specifiedCharacter = "a";
//    int counter = 0;
//    for (int count = 0; count < number.length; count++){
//    if charAt[]
//    }
//    }
}
