import java.util.Scanner;
class complex
{

	float real;
       
	float imag;
        
        complex(float r,float i){
        
        	real=r;
        	
        	imag=i;
        }
        
        complex(){
        
        	real=0;
        	
        	imag=0;
        
        }
        void dispComplex(){	
        
        	System.out.println(real+"+"+imag+"i");
        }
        
        void sum(complex c1,complex c2){
        
        real=c1.real+c2.real;
        
        imag=c1.imag+c2.imag;
        
        }
       
}

class main3
{

	public static void main(String a[]){
	
		Scanner s=new Scanner(System.in);
		
		System.out.println("\n Enter first complex number:");
		
		System.out.println("\n Real part:");
		
		float r1=s.nextFloat();
		
		System.out.println("\n Imaginary part:");
		
		float i1=s.nextFloat();
		
		complex c1=new complex(r1,i1);
		
		System.out.println("\n Enter second complex number:");
		
		System.out.println("\n Real part:");
		
		float r2=s.nextFloat();
		
		System.out.println("\n Imaginary part:");
		
		float i2=s.nextFloat();
		
		complex c2=new complex(r2,i2);
		
		System.out.println("\n Complex numbers are:\n");
		
		c1.dispComplex();
		
		c2.dispComplex();
		
		complex c3=new complex();
		
		c3.sum(c1,c2);
		
		System.out.println("\n Sum\n");
		
		c3.dispComplex();
		
	}
}

		
		
