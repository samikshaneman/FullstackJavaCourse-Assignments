import java.util.Scanner ;
public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println( "Enter a number :");
		int number = input.nextInt();
		
		int factorial=1;
		for ( int i= 1; i<=number; i++)
		{
		    factorial = factorial * i;
		}
		System.out.println( "The factorial of the number is: " + factorial);
	}
}
