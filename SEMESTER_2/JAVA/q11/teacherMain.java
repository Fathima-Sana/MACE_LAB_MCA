import java.util.*;
class employee{
    int empId;
    String name;
    double sal;
    String address;
    employee(int id,String nm,double s,String add)
    {
        empId=id;
        name=nm;
        sal=s;
        address=add;
    }   
}
class teacher extends employee{
    String dept;
    String subTaught;
    teacher(int id,String nm,double s,String a,String d,String sub)
    {
            super(id,nm,s,a);
            dept=d;
            subTaught=sub;
    }
    void display()
    {
        System.out.println("\n\n");
        System.out.println("Employee ID:"+empId);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee salary:"+sal);
        System.out.println("Employee Address:"+address);
        System.out.println("Employee Department:"+dept);
        System.out.println("Subject Taught:"+subTaught);
    }
}
class teacherMain
{
    public static void main(String a[])
    {
        int n,id;
        String nm,dept,sub,add;
        double sal;
        Scanner s=new Scanner(System.in);
        System.out.println("Select number of teachers:");
        n=s.nextInt();
        teacher t[]=new teacher[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Employee ID:");
            id=s.nextInt();
            System.out.println("Employee name:");
            nm=s.next();
            System.out.println("Employee salary:");
            sal=s.nextDouble();
            System.out.println("Employee address:");
            add=s.next();
            System.out.println("Employee department:");
            dept=s.next();
            System.out.println("Subject taught:");
            sub=s.next();
            t[i]=new teacher(id,nm,sal,add,dept,sub); 
        }
        for(int i=0;i<n;i++)
        {
            t[i].display();
        }
    }
}