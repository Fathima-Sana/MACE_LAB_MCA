import java.util.Scanner;

class negativeException extends Exception
{
	public negativeException(String m)
	{
		super(m);
	}
}

public class avgcal
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
	
		System.out.print("Enter the value of N:");
		int N = sc.nextInt();
	
		int sum=0;
		int count=0;
		int n;
		for (int i=1;i<=N;i++)
		{
		 	try
		 	{
		 		System.out.print("Enter a positive no.:");
		 		n=sc.nextInt();
		 		
		 		if (n < 0)
		 		{
		 		 	throw new negativeException("Negative number not allowed."); 
		 		}
	
        	        	sum += n;
        	        	count++;
        	    	}
        	    	catch (negativeException e) 
        	    	{
        	       	 System.out.println("Error: " + e.getMessage());
        	       	 i--; 
        	    	}
        	}
	
        	if (count > 0)
        	{
        	 	double average = (double) sum / count;
        	 	System.out.println("Average: " + average);
        	} 
        	else
        	{
        	 	System.out.println("No positive numbers entered.");
        	}
    	}	
}
