import java.util.*;

class MultiplicationTable extends Thread{

    public void run() {
        
            int number = 5;
            
            System.out.println("Multiplication Table of " + number + ":");
            
            for (int i = 1; i <= 10; i++) {
            
                System.out.println(number + " x " + i + " = " + (number * i));
                
            }
    }
}

class PrimeNumber extends Thread{

    private int count;

    public PrimeNumber(int count) {
    
        this.count = count;
    }

    private boolean isPrime(int num) {
    
        if (num <= 1) {
        
            return false;
            
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
        
            if (num % i == 0) {
            
                return false;
                
            }
        }
        
        return true;
    }
    
    public void run() {
    
        
            System.out.println("First " + count + " Prime Numbers:");
            
            int num = 2;
            
            int primeCount = 0;
            
            while (primeCount < count) {
            
                if (isPrime(num)) {
                
                    System.out.print(num + " ");
                    
                    primeCount++;
                }
                num++;
            }
            System.out.println();
        }
    
}

public class thread1 {

    public static void main(String[] args) {
    
        int n = 5; 

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        
        PrimeNumber primeNumber = new PrimeNumber(n);

        Thread multiplicationThread = new Thread(multiplicationTable);
        
        Thread primeThread = new Thread(primeNumber);

        multiplicationThread.start();
        
        primeThread.start();
        try{
	
		Thread.sleep(12);

	}
	catch(InterruptedException ie)
	{
	       System.out.print(ie);
	}
   }
}
