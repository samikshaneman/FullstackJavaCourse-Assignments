import java. util. Scanner;
public class CircleDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// get the radius of the circle from the user
		System.out.println("Enter the radius of the circle: ");
		float radius = input.nextFloat();
		
		// calculate the area and circumference of the circle
		float area = (float) (Math.PI * radius * radius);	    float circumference = (float) (2 * Math.PI * radius);
		// display the results
		System.out.println("The area of the circle =" +area);
		System.out.println( "The circumference of the circle is =" +circumference);
			}
}