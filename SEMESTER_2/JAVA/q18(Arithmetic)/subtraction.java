package arithmetic;
class subtraction implements calculation
{
	int a;
	int b;
	public subtraction(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void calculate()
	{
		System.out.println("Difference="+(a-b));
	}
}
	
