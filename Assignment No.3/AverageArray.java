import java.util.Scanner;
public class AverageArray {
	public static void main(String[] args) {
		int n, sum=0;
		float average;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of an Array");
		n= input.nextInt();
		int a[]= new int [n];
		System.out.println("Enter the all elements in Array:");
		for(int i=0; i<n; i++)
		{
		    a[i]=input.nextInt();
		    sum=sum+ a[i];
		}
		    average = (float) sum/n;
		
		System.out.println("Average of an Array is: " +average);
	}
}