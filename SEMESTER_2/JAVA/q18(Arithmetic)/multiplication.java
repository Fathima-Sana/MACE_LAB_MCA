package arithmetic;
class multiplication implements calculation
{
	int a;
	int b;
	public multiplication(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void calculate()
	{
		System.out.println("Sum="+(a*b));
	}
}
	
