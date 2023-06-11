import java.util.*; 
class searcharray
{
    int arr[]=new int[10];
    int n;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        n=sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
    void search(int item)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==item)
            {
                System.out.println("\n Item found");
                return;
            }
        }
        System.out.println("\n Item not found");
    }
}
class search
{
    public static void main(String [] a){
        int i;
        searcharray s=new searcharray();
        s.read();
        System.out.println("\n Enter elements to search:");
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        s.search(i);
    }
}