class CPU
{
	
	float price;
	
	CPU(float pr){
	
		price=pr;
		
	}	
	
	void display(){
		
		System.out.println("Price:"+price);
		
	}
	
	class Processor
	{
	
		int noc;
		
		String p_man;
		
		Processor(int n,String p){
		
			noc=n;
			
			p_man=p;
			
		}
		
		void display(){
		
			System.out.println("Number of cores:"+noc);
			
			System.out.println("Manufacturer:"+p_man);
		
		}
		
	}
	
	static class RAM
	{
		int mem;
		
		String m_man;
		
		RAM(int m,String s){
		
			mem=m;
			
			m_man=s;
			
		}
		
		void display(){
		
			System.out.println("Memory size:"+mem+"GB");
			
			System.out.println("Manufacturer:"+m_man);
			
		}
		
	}

}

class main5
{

	public static void main(String a[]){
	
		CPU c=new CPU(70000);
		
		c.display();
		
		CPU.Processor p=c.new Processor(4,"Intel");
		
		p.display();
		
		CPU.RAM r=new CPU.RAM(16,"Samsung");
		
		r.display();
		
	}

}
		
	
		
