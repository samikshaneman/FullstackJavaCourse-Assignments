import java. util. * ;
public class MatrixOperation {
	public static void main(String[] args) {
		int m,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the order of the matrix : ");
		m = sc.nextInt();
		n = sc.nextInt();
		int [] [] mat1=new int [m] [n];
		int [] [] mat2= new int [m] [n];
		
		int[] [] mat3= new int [m] [n];
		int[] [] mat4= new int [m] [n];
		int[] [] mat5= new int [m] [n];
	    
		
		
		
		System.out.print("\nEnter the matrix 1 elements : ");
		int i, j;
		for(i=0; i<m; i++)
		{
		    for(j=0; j<n; j++)
		    mat1 [i][j]= sc.nextInt();
		}
		System.out.print("\nEnter the matrix 2 elements :");
		for(i=0;i<m; i++)
		{
		    for (j=0; j<n; j++)
		    mat2[i][j]=sc.nextInt();
		}
		for( i=0; i<m; i++)
		{
		    for(j=0; j<n; j++)
		    {
		    mat3[i][j]= mat1[i][j] + mat2[i][j];
		    mat4[i][j]= mat1[i][j] - mat2[i][j];
		    mat5[i][j]= mat1[i][j] / mat2[i][j];
		    }
     	}
	
	System.out.println("Addition of the two matrices : " );
	for(i=0; i<m; i++)
		    {
		        for(j=0; j<n; j++)
		        System.out.println(mat3[i][j] + "  ");
		        System.out.println();
		    }
		    
		    System.out.println(" Subtraction of the two matrices : " );
	for(i=0; i<m; i++)
		    {
		        for(j=0; j<n; j++)
		        System.out.println(mat4[i][j] + "  ");
		        System.out.println();
		    }
		    
		   
		    
		     System.out.println("Division of the two matrices : " );
	for(i=0; i<m; i++)
		    {
		        for(j=0; j<n; j++)
		        System.out.println(mat5[i][j] + "  ");
		        System.out.println();
		    }
}
}