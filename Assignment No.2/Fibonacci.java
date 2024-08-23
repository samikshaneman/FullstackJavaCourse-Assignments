import java.util.Scanner ;
public class Fibonacci
{
    public static void main (String[ ] arg){
        Scanner input= new Scanner (System.in);
        System.out.println("Enter how many terms to display in the fibonacci series :");
        int n= input.nextInt();
        
        int count=0;
        int a=0, b=1, c=0;
        System.out.println("Fibonacci series is:");
        
        if(n==1)
        {
            System.out.println("0");
        }
        else if (n==2)
        {
            System.out.println("0 1");
        }
        else
        {
            System.out.println("0 1 ");
            count = 3;
            while (count<=n)
            {
                c=a+b;
                a=b;
                b=c;
                
                System.out.println(c + " ");
                count ++;
            }
        }
        input.close();
    }
}