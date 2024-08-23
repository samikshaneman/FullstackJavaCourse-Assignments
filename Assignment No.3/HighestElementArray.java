import java.util.Scanner;
public class HighestElementArray {
	public static void main(String[] args) {
		int n, high;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many no.of elements you want in array : ");
		n = sc.nextInt();
		int a[ ] = new int [n];
		
		System.out.println("Enter elements of an array : ");
		for( int i=0; i<n; i++)
		{
		    a[i]= sc.nextInt();
		}
		high = a[0];
		for (int i=0; i<n; i++)
		{
		    if (high < a[i])
		    {
		        high = a[i];
		    }
		}
		System.out.println("Highest Element in this array is: " +high );
	}
}