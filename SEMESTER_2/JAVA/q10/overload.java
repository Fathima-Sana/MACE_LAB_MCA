class Shapes
{
    void area(int x){
        System.out.println("Area of square:"+x*x);
    }
    void area(int a,int b){
        System.out.println("Area of rectangle:"+a*b);
    }
    void area(double r){
        System.out.println("Area of circle:"+3.14*r*r);
    }
}
class overload
{
    public static void main(String a[]){
        Shapes s=new Shapes();
        s.area(5);
        s.area(6,10);
        s.area(4.0);
    }
}