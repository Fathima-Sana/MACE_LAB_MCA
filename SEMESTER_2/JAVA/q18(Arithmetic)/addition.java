package arithmetic;
class addition implements calculation
{
	int a;
	int b;
	public addition(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void calculate()
	{
		System.out.println("Sum="+(a+b));
	}
}
	
