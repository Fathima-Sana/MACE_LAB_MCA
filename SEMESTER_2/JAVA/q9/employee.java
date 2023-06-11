import java.util.*;
class employee
{
    int eNo;
    String eName;
    int eSalary;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        eNo=sc.nextInt();
        System.out.println("Enter name:");
        eName=sc.next();
        System.out.println("Enter salary:");
        eSalary=sc.nextInt();
    }
    void display()
    {
        System.out.println("employee:"+eName);
    }
    public static void main(String a[]){
        int id,n;
        System.out.println("Enter number of employees:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        employee e[]=new employee[n];
        for(int i=0;i<n;i++)
        {
            e[i]=new employee();
            e[i].read();
        }
        System.out.println("Enter employee id to search:");
        id=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(e[i].eNo==id)
            {
                e[i].display();
                break;
            }
        }
        System.out.println("No employee with this number");
    }
}