import java.util.*; 

public class deQueue{ 

    public static void main(String[] args) { 

        Deque<String> deque = new LinkedList<String>(); 

        deque.add(" and Vegetable");  

        deque.addFirst("Fruit");      

        deque.addLast(" are "); 

	System.out.println("Initial Deque:");

        System.out.print(deque + " "); 


        deque.push("A");       

        deque.offer("Good");      

        deque.offerFirst("Daily");   

        deque.offerLast("for Health");  

        System.out.println(" \nDeque:");

        System.out.print(deque + " "); 
      
        System.out.println("\n\nDeque contents using Standard Iterator:"); 

        Iterator iterator = deque.iterator(); 

        while (iterator.hasNext()) 

            System.out.print(" " + iterator.next()); 

        Iterator reverse = deque.descendingIterator(); 

        System.out.println("\n\nDeque contents using Reverse Iterator:"); 

        while (reverse.hasNext()) 

            System.out.print(" " + reverse.next()); 
          
        System.out.println("\n\nDeque Peek:" + deque.peek()); 

        System.out.println("\nDeque,After peek:" + deque); 
        
        System.out.println("\nDeque Pop:" + deque.pop()); 

        System.out.println("\nDeque,After pop:" + deque); 

        System.out.println("\nDeque Contains Three: " +  deque.contains("Three")); 
   
        deque.removeFirst();     

        deque.removeLast();         

        System.out.println("\nDeque, after removing "  + "first and last elements: " + deque); 
   } 
}
