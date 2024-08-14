public class Swapping {
	public static void main(String[] args) {
		int x = 20 ;
		int y = 15 ;
		
		//add the value of x and y and store it in x
		x = x+y ;
		//substract the y from x and store it in y
		y = x - y;
		//substracr the y from x and store it in x
		x = x - y ;
		//print the values o x and y after swapping
		System.out.println ("After swapping :x= " +x);
		System.out.println("After swapping :y="+y);
		}
}