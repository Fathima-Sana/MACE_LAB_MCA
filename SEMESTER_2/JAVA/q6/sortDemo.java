import java.util.*;
class sortDemo
{
    String s[];
    int n;
    sortDemo(){}
    sortDemo(int n){
        Scanner sc=new Scanner(System.in);
        this.n=n;
        s=new String[n];
        System.out.println("\n Enter elements");
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }
    }
    void sort()
    {
        String temp="";
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(s[i].compareTo(s[j])>0)
                {
                    temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }     
    }
    void show()
    {
        System.out.println("\n Array\n");
        for(int i=0;i<n;i++){
            System.out.println("\n"+s[i]);
        }
    }
    public static void main(String a[]){
        sortDemo s=new sortDemo(6);
        s.sort();
        s.show();

    }
}