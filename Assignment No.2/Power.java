import java.util.Scanner;

public class Power {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of A:");
		int A= sc.nextInt();
		
		System.out.println("Ente the value of b");
		int exponent= sc.nextInt();

		int result = 1;
		for (int i = 0; i <exponent; i++) {
			result *=A;
		}
		
		System.out.println(" The value of  " +  A  +    " raised to "   + exponent +  " is "  +result);
	}
}