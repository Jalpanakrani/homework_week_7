package homework_week_7;
import java.util.*;
public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {

//Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();
        findNumberIsPositiveOrZero(number);
        //closing the scanner object
        scanner.close();
    }
    //Finding the number is Positive Negative or Zero
    public static void findNumberIsPositiveOrZero(int number){
        if (number >0){
            System.out.println(number + "is a POSITIVE number");
        }else if (number < 0) {
            System.out.println(number + "is a NEGATIVE number");
        }else {
            System.out.println(number + "is a Zero");

        }       }
}