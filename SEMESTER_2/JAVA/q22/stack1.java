import java.util.Stack;

public class stack1
{
	
	public static void main(String a[])
	{

		Stack<Integer> stk=new Stack<>();
			
               int x;
               
		boolean res=stk.empty();
				
		System.out.println("Is Stack empty= "+ res);
			
		stk.push(45);

		stk.push(56);

		System.out.println("Elements of stack= "+stk);
			
		res=stk.empty();

		System.out.println("Is Stack empty= "+ res);

		
		x=stk.pop();

		System.out.println("The value poped from stack is= "+ x);

		stk.push(90);
		
		 stk.push(100);
		 
		 System.out.println("Elements of stack= "+stk);
		 
		 System.out.println("Peak element:"+stk.peek());

		System.out.println("Elements of stack= "+stk);

		System.out.println("The value popped from stack is= "+ stk.pop());
			
		x=stk.pop();
		

		System.out.println("The value poped from stack is= "+ x);

		res=stk.empty();
			
		System.out.println("Is Stack empty= "+ res);

	        }
}
