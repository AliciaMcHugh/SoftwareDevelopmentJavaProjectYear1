import java.util.Scanner;

public class NameAge{
  public static void main(String[] args){

	 String name = "";
	 int age = 0;
	 int counter = 1;

     Scanner input = new Scanner(System.in);

     System.out.println("Enter your name: ");
     name = input.nextLine();

     System.out.println("Enter your age: ");
     age = input.nextInt();

     while(counter <= age){
		 System.out.println(counter+". "+name);
		 counter = counter +1;
		}
  }
}