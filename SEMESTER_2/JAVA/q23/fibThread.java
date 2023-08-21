class FibonacciGenerator implements Runnable {

    private int n;

    public FibonacciGenerator(int n) {
    
        this.n = n;
        
    }

    public void run() {
    
        int prev = 0;
        
        int curr = 1;
        
        System.out.println("Fibonacci series:");
        
        for (int i = 0; i < n; i++) {
        
            System.out.print(prev + " ");
            
            int next = prev + curr;
            
            prev = curr;
            
            curr = next;
            
        }
        
        System.out.println();
        
    }
    
}

class EvenNumberPrinter implements Runnable {

    private int start;
    
    private int end;

    public EvenNumberPrinter(int start, int end) {
    
        this.start = start;
        
        this.end = end;
    }

    public void run() {
    
        System.out.println("Even numbers between " + start + " and " + end + ":");
        
        for (int i = start; i <= end; i++) {
        
            if (i % 2 == 0) {
            
                System.out.print(i + " ");
                
            }
            
        }
        System.out.println();
        
    }
}

public class fibThread {

    public static void main(String[] args) {
    
        int fibonacciCount = 10;
        
        int evenStart = 5;
        
        int evenEnd = 25;

        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(fibonacciCount);
        
        EvenNumberPrinter evenNumberPrinter = new EvenNumberPrinter(evenStart, evenEnd);

        Thread fibonacciThread = new Thread(fibonacciGenerator);
        
        Thread evenThread = new Thread(evenNumberPrinter);

        fibonacciThread.start();
        
        evenThread.start();

        try {
        
            fibonacciThread.join();
            
            evenThread.join();
            
        } catch (InterruptedException e) {
        
            e.printStackTrace();
        }
    }
}
