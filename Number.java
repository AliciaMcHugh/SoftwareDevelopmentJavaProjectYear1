
import java.util.Scanner;

public class Number{

  public static void main(String[] args) {

   Scanner input = new Scanner (System.in) ;
   int number = 0;

   System.out.print("Enter a number: ");
   number = input.nextInt();

        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println("The number is 0");
        }
    }
}