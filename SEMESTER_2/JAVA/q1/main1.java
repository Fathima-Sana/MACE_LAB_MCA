class main1

{

    public static void main(String a[])
    
    {
    
         show();
    
         main1 p=new main1();
    
         p.disp();
    
    }
    
    static void show(){
    
        System.out.println("This is a static method");
    
    }
    
    void disp()
    {
    
         System.out.println("This is a non static method invoked using an object");
    
    }
    
 }
