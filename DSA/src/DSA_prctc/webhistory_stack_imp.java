package DSA_prctc;

import java.util.Stack;

public class webhistory_stack_imp {
private Stack<String> backward_stack;
private Stack<String> forward_stack;
private String current_page;

public webhistory_stack_imp(){
	backward_stack=new Stack<String>();
	forward_stack=new Stack<String>();
	 current_page = "home page";
	System.out.println("You are in"+current_page);
}
public void visitpage(String page) {
	backward_stack.push(current_page);
	current_page=page;
	forward_stack.clear();
	System.out.println("the page is"+current_page);
}
	public void goback() {
		if(!backward_stack.isEmpty()) {
			forward_stack.push(current_page);
			current_page=backward_stack.pop();
			System.out.println("the previous page is"+current_page);
			
		}else {
			System.out.println("you reached home page");
		}
	}
	
	public void goforward() {
		if(!forward_stack.isEmpty()) {
			backward_stack.push(current_page);
			current_page=forward_stack.pop();
			System.out.println("the next page is"+current_page);
		}else {
			System.out.println("there is no more pages");
		}
	}
	
	public String getcurrentpage() {
		return current_page;
		
	}
	public void clear() {
		backward_stack.clear();
		forward_stack.clear();
		System.out.println("the history is deleted");
	}
	
	
	public static void main(String[] args) {
		webhistory_stack_imp w= new webhistory_stack_imp();
		w.visitpage("flipkart");
		w.visitpage("shoes");
		w.visitpage("details");
		w.visitpage("reviews");
		System.out.println(w.getcurrentpage());
		w.goback();
		w.goback();
		w.goback();
		w.goback();
		w.goforward();
		w.goforward();
		w.goforward();
		w.goforward();
		w.goforward();
	}
	
}
