package DSA_prctc;

import java.util.Stack;

public class PlatesStack 
{
public static void main(String[] args) 
{
Stack<String> s= new Stack();	
if(s.isEmpty()) {
	System.out.println("stack is empty");
}
s.push("plate 1");
s.push("plate 2");
s.push("plate 3");
s.push("plate 4");
System.out.println("stacking of plates"+s);
System.out.println("remove top plate"+s.pop());
System.out.println("stacking of plates"+s);
System.out.println(s.peek());
System.out.println("remove plates"+s.pop());
System.out.println(s.pop());
System.out.println("stacks"+s);
System.out.println(s.pop());
System.out.println("stacks"+s);


}
}
