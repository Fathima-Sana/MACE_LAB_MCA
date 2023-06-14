import java.util.*;
interface areaPerimeter
{

	double area();
	
	double perimeter();
	
}
class circle implements areaPerimeter
{

	Double r;
	Scanner sc=new Scanner(System.in);
	circle()
	{
		System.out.println("Enter radius:");
		r=sc.nextDouble();
	}
	public double area()
	{
		
		return 3.14*r*r;
		
		
	}
	public double perimeter()
	{
		return 2*3.14*r;
	}
}
class rectangle implements areaPerimeter
{

	Double a,b;
	Scanner sc=new Scanner(System.in);
	rectangle()
	{
		System.out.println("Enter length:");
		a=sc.nextDouble();
		System.out.println("Enter breadth:");
		b=sc.nextDouble();		
	}
	public double area()
	{
		
		return a*b;
		
		
	}
	public double perimeter()
	{
		return 2*(a+b);
	}
}
class shapesMain
{

	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
               int ch;

               do
               {
            		System.out.println("1. Calculate Circle");
            		System.out.println("2. Calculate Rectangle");
            		System.out.println("3. Exit");
                       System.out.print("Enter your choice: ");
                       ch= sc.nextInt();
                       switch (ch) {
                       	case 1:circle c=new circle();
                       	       System.out.println("Area of circle:"+c.area());
		                      System.out.println("Perimeter of circle:"+c.perimeter());
                                      break;
                
                               case 2:rectangle r=new rectangle();
		                       System.out.println("Area of rectangle:"+r.area());
		                       System.out.println("Perimeter of circle:"+r.perimeter());
                                       break;
                               case 3:
                                      System.out.println("Exit");
                                      break;
                               default:
                                      System.out.println("Invalid choice. Please try again.");
                       }
                       System.out.println();
              } while (ch!= 3);
}	}		
