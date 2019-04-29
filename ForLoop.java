import java.util.Scanner;

public class ForLoop{
  public static void main(String[] args){

  Scanner console = new Scanner(System.in);

  int num;
  int i;
  int sum = 0;

  for (i = 1; i <= 10; i++)
  {
	  System.out.print("Enter number " + i + ": ");
	  num = console.nextInt();

	  if (num % 2 != 0)
	  {
		  sum = sum + num;
	  }
  }

  System.out.println("Sum of odd numbers is " + sum);


  }
 }