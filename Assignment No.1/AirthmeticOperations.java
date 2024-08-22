import java.util.Scanner;
public class airthmaticOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// get two numbers from the user
		System. out. println("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		int num2 = sc.nextInt();

		//calculate the airthmatic operations
		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;
		int quotient = num1 / num2;
		int modulo = num1 % num2;

		// print result ro console
		System.out.println("sum:" + sum);
		System.out.println("difference:" + difference);
		System.out.println("product:" + product);
		System.out.println("quotient:" + quotient);
		System.out.println("modulo:" + modulo);
	}
}