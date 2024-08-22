import java. util. Scanner;
public class Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//get the length and width from the user
		System.out.println ("Enter the length of rectangle :");
		int length = sc.nextInt();
		System.out.println("Enter the width of rectangle:");
		int width = sc.nextInt();
		
		//calculate the perimeter of the rectangle
		int area = (int) (length * width);
		int perimeter=(int) (2* (length + width));
		
		// Display the results
		System.out.println( "Area of rectangle is :" +area);
		System.out.println("Perimeter of the rectangle is : " +perimeter);
	}
}