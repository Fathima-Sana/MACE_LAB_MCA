import java.util.*;
class manipulation
{
    String str;
    manipulation(String str)
    {
        this.str=str;
    }
    void operations()
    {
        String s=this.str;
        System.out.println("string length="+s.length());
        System.out.println("string concatenation="+s.concat(",Welcome to MACE"));
        System.out.println("Index of character 'a'="+s.indexOf('a'));
        System.out.println("Lowercase:"+s.toLowerCase());
        System.out.println("Uppercase:"+s.toUpperCase());
        System.out.println("Replacement:"+s.replace("Hi","Hello"));
        System.out.println("Character at position 3="+s.charAt(3));
    }
    public static void main(String []a){
        manipulation m=new manipulation("Hi Sana");
        m.operations();
    }
}