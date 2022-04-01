package homework_week_7;
import java.util.Scanner;

public class Programme_1_OddEvenTernaryoperator {
    public static void main(String[] args) {
        //Scanner declaration for reading input from consol
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter the number :");
        int number=scanner .nextInt();
        isItOddOrEvenNumber(number);
        //closing the scanner object
        scanner.close();
    }
    //Checking the number is even or Odd
    public static void isItOddOrEvenNumber(int number){
        //ternary operator is used
        String evenOrOdd =(number %2 ==0) ? "Even" :  "Odd ";
        System.out.println("The "+number +evenOrOdd + "number");
    }
}



