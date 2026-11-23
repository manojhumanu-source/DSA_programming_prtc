package DSA_prctc;



public class Stack_operation {
int[] stack;
int top;
Stack_operation(int size){
	stack=new int[size];
	top=-1;
}

public boolean isEmpty() {
	return top==-1;
}

public boolean isFull() {
	return top==stack.length-1;
}

public void push (int val) {
	if(isFull()) {
		System.out.println("stack is full");
	}else {
		stack[++top]=val;
		System.out.println("the value is inserted");
	}
}

public void pop() {
	if(isEmpty()) {
		System.out.println("stack is empty");
	}else {
		int val=stack[top];
		System.out.println("the value "+val+" is popped");
		top--;
	}
}
public void peek() {
	if(isEmpty()) {
		System.out.println("stack is empty");
	}else {
		System.out.println("the value is  "+stack[top]);
	}
}

public void delete() {
	stack=null;
	System.out.println("stack is deleted");
}
public static void main(String[] args) {
	Stack_operation st= new Stack_operation(5);
	st.push(10);st.push(30);st.push(20);
	st.push(12);st.push(45);st.push(87);
	st.peek();
	st.pop();
	st.peek();
	st.pop();
	st.delete();
			
}
}
