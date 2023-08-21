package graphics;
class square implements properties
{
	int a;
	public square(int a)
	{
		this.a=a;
	}
	public void area()
	{
		System.out.println("Area of square:"+a*a);
	}
	public void perimeter()
	{
		System.out.println("Perimeter of square:"+4*a);
	}
}
	
