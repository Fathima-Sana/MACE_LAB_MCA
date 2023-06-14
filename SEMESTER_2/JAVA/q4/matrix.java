import java.util.Scanner;

class matrix
{
	public static void main(String a[]){
	
	    	int rsize1,colsize1,rsize2,colsize2,i,j;
	    	
	    	int mat1[][]=new int[5][5];
	    	
	    	int mat2[][]=new int[5][5];
	    	
	    	int mat3[][]=new int[5][5];
	    	
	    	Scanner s=new Scanner(System.in);
	
	   	System.out.println("\nMatrix 1:-\n");
	   	
		System.out.println("Enter row size:");
	
		rsize1=s.nextInt();
	
		System.out.println("Enter column size:");
	
		colsize1=s.nextInt();
	
		System.out.println("Enter elements to matrix:-\n");
	
		for(i=0;i<rsize1;i++)
	
			for(j=0;j<colsize1;j++)
	
				mat1[i][j]=s.nextInt();
		
		System.out.println("\nMatrix 2:-\n");
		
		System.out.println("Enter row size:");
	
		rsize2=s.nextInt();
	
		System.out.println("Enter column size:");
	
		colsize2=s.nextInt();
	
		System.out.println("Enter elements to matrix:-\n");
	
		for(i=0;i<rsize2;i++)
	
			for(j=0;j<colsize2;j++)
	
				mat2[i][j]=s.nextInt();
				
		System.out.println("\n Matrix1:\n");
	
		for(i=0;i<rsize1;i++)
	
		{	for(j=0;j<colsize1;j++)
	
				System.out.print(mat1[i][j]+" ");
	
			System.out.println();
	
		}
		
		System.out.println("\n Matrix2:\n");
		
		for(i=0;i<rsize2;i++)
	
		{	for(j=0;j<colsize2;j++)
	
				System.out.print(mat2[i][j]+" ");
	
			System.out.println();
	
		}
		
		if(rsize1==rsize2 && colsize1==colsize2)
		{
		
			System.out.println("\n Sum:\n");
			
			for(i=0;i<rsize2;i++)
 			{
 				for(j=0;j<colsize2;j++)
 				{
 				
 					mat3[i][j]=mat1[i][j]+mat2[i][j];
 				
 					System.out.print(mat3[i][j]+" ");
 		       	
 		       	}
 		       	
 		        System.out.println();
		
		        }
		}
		else
		
			System.out.println("Cannot find sum");
		
	}
}
	
	
	
