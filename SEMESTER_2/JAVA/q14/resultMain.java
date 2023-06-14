import java.util.*;	
class Student {
    String sName;
    int sId;
    
    Student( int sId,String sName) {
        this.sName = sName;
        this.sId = sId;
    }
    
    public void displayStudent() {
        System.out.println("Student Name: " + sName);
        System.out.println("Student ID: " + sId);
    }
}
class Sports {
    String spName;
    
    Sports(String spName) {
        this.spName = spName;
    }
    
    void displaySport() {
        System.out.println("Sport: " + spName);
    }
    
}

class Result {
    Sports sports;
    Student student;
    String res;	
    public Result(int sId,String sName, String spName, String r) {
         this.sports = new Sports(spName);
        this.student = new Student(sId,sName);
        res=r;
    }
    
    void displayResult() {
        
        student.displayStudent();
        sports.displaySport();
        System.out.println("Result:"+res);
    }
}

class resultMain
{

	public static void main(String args[])
	{
	
		int rno;
		
		String sName,spName,r;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Roll no:");
		
		rno=s.nextInt();
		
		System.out.println("Enter Name:");
		
		sName=s.next();
		
		System.out.println("Enter sports item:");
		
		spName=s.next();
		
		System.out.println("Enter result:");
		
		r=s.next();
		
		Result res=new Result(rno,sName,spName,r);
		
		res.displayResult();
	}
	
}
	
		
