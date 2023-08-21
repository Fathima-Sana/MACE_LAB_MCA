import java.util.*;

public class priorQueue{

	public static void main(String[] a)

	{
		
		PriorityQueue<Student> pq=new PriorityQueue<Student>(5,new StudentComp());
		
		Student st1=new Student("Sana",3.0);
		
		pq.add(st1);
		
		Student st2=new Student("Femy",5.4);
		
		pq.add(st2);
	 
	 	Student st3=new Student("Mirza",4.9);
		
		pq.add(st3);
		
		Student st4=new Student("Greeshma",6.0);
		
		pq.add(st4);
		
		Student st5=new Student("Grees",7.0);
		
		pq.add(st5);
		
		Student st6=new Student("Greeshm",3.0);
		
		pq.add(st6);	

		System.out.println("Students served in priority order");
		
		while(!pq.isEmpty())
		
		{
		
			System.out.println(pq.poll());
		
		}
		
	}
	
}

class StudentComp implements Comparator<Student>
{

	public int compare(Student s1,Student s2)
	{
	
		if(s1.cgpa < s2.cgpa)
		
			return 1;
			
		else if(s1.cgpa > s2.cgpa)
			
			return -1;
			
		return 0;
	}

}
class Student
{

	public String name;
	
	public double cgpa;
	
	public Student(String name,double cgpa)
	{
	
		this.name=name;
		
		this.cgpa=cgpa;
	}


	
	public String toString()
	{
	
		return this.name +" "+this.cgpa;
	}
}
