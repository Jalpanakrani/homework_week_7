package homework_week_7;
import java.util.*;
public class Programme_6_OddEven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number you want to check :");
        int number=scanner.nextInt();
        Programme_6_OddEven oddEven=new Programme_6_OddEven();
        System.out.println(number + "is "+ oddEven.isItEvenOroddnumber(number) +" number ");
      //closing the scanner object
        scanner.close();
    }

   //Checking the odd or even
   public String isItEvenOroddnumber(int number){
        if(number %2==0) {
            return "Even";
        }else {
            return "odd";
        }
   }
}
