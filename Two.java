
import java.util.Scanner;

public class Two{

  public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.print("Enter a number: ");
  int number1 = input.nextInt();
  System.out.print("Enter another number: ");
  int number2 = input.nextInt();

  if(number1 == 2 && number2 == 2)
  {
    System.out.println("Both numbers are 2"); //both
  }
  else if (number1==2)
  {
	System.out.println("The first number is 2"); //first
  }
  else if (number2==2)
  {
    System.out.println("The second number is 2"); //second
  }else
  {
    System.out.println("Neither number is 2"); //neither
  }

  }
}