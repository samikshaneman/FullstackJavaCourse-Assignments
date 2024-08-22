public class swapWithVarible{
	public static void main(String[] args) {
		int x = 25;
		int y = 30;
		
		//create a temporary variable to store the value of x
		int temp= x;
		// assign the value of x to y
		x = y;
		// assign the value of y to temp
		y= temp;
		// print the values of x and y after swapping
		System.out.println( "After swapping : x =" +x);
		System.out.println("After swapping : y =" +y);
			}
}