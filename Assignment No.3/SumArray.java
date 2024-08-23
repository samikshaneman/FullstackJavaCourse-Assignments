import java.util.Scanner;
public class SumArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		//get the size of an array
		System.out.println("Enter the row and columns in an array: ");
		int r =sc.nextInt();
		int c=sc.nextInt();
		
		//create the array
		int [][] array= new int [r][c];
		
		//get the elements of an array
		System.out.println("Enter the elements of the array: ");
		for (int i= 0; i<r; i++)
		{
		    for( int j=0; j<c; j++)
		    {
		        array[i][j]=sc.nextInt();
		    }
		}
		
		//calculation of sum
		int sum=0;
		for(int i=0; i<r; i++)
		{
		    for(int j=0; j<c;j++)
		    sum +=array[i][j];
		}
		
		//print the sum of the elements of the array
		System.out.println("Sum of the elements of an array is : " +sum);
	}
}