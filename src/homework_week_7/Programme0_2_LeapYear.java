package homework_week_7;



import java.util.Scanner;

public class Programme0_2_LeapYear {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the year");
        int year = scanner.nextInt();
        Programme0_2_LeapYear leapYear = new Programme0_2_LeapYear();
        leapYear.isItLeapYear(year);
        //closing the scanner object
        scanner.close();
    }
    //checking is it Leap year or not
    public void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(" The year " + year + "is leep year ");
            return;
        }
        System.out.println(" The year " + year + "is  not leep year ");
    }
}
