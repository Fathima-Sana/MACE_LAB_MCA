package arithmetic;
class division implements calculation
{
	int a;
	int b;
	public division(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void calculate()
	{
		System.out.println("Sum="+(a/b));
	}
}
	
