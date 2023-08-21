package arithmetic;
class arithMain
{
	public static void main(String a[])
	{
		addition a=new addition(3,4);
		subtraction s=new subtraction(3,1);
		multiplication m=new multiplication(5,3);
		division d=new division(10,2);
		a.sum();
    s.diff();
    m.mul();
    d.div();
	}
}
