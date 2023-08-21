import java.io.*;

class Read_Key_Write_File{
public static void main(String Ar[]) {
try{
InputStreamReader r=new InputStreamReader(System.in);
 	BufferedReader br =new BufferedReader(r);
System.out.println("Enter the string ");
String str = br.readLine(); 
FileWriter f=new FileWriter("/home/user/Desktop/sana/java/lab/naruto.txt");
          
	BufferedWriter wr=new BufferedWriter(f);
        wr.write(str);
	wr.append(" ........RASENGAN!!!!!!......RASEN SHURIKAN!!!!.......");
	wr.close();
System.out.println("Sucessfully written to the file ");
}catch(IOException w){System.out.println(w);}
}
}
