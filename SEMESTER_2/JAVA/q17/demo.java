package graphics;
class demo
{
	public static void main(String a[])
	{
		rectangle r=new rectangle(3,4);
		circle c=new circle(3);
		square s=new square(5);
		triangle t=new triangle(4,5,6);
		r.area();
		r.perimeter();
		c.area();
		c.perimeter();
		s.area();
		s.perimeter();
		t.area();
		t.perimeter();
	}
}
		
