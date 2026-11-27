package DSA_prctc;

public class QueneOper 
{
	int[] quene;
	int top,boq;
	QueneOper(int size){
		quene=new int[size];
		top=boq=-1;
		
	}
	
	public boolean isFull() {
		return top==quene.length-1;
	}
	
	public boolean IsEmpty() {
		return top==-1 || boq==quene.length;
	}
	
	public void enquene(int v) {
		if(isFull()) {
			System.out.println("the quene is full");
		}else if(boq==-1) {
			boq++;
			quene[++top]=v;
		}else {
			quene[++top]=v;
			System.out.println("value inserted");
		}
	}
	
	public void dequene() {
		if(IsEmpty()) {
			System.out.println("quene is empty");
		}else {
			int v= quene[boq];
			boq++;
			System.out.println("elemet deleted");
		}
		if(boq>top) {
			boq=top=-1;
		}
	}
	public void peek() {
		if(IsEmpty()) {
			System.out.println("quene is empty");
		}else {
			System.out.println("the first element is"+quene[boq]);
		}
	}
public void delete() {
	quene=null;
	System.out.println("quene is deleted");
}
public static void main(String[] args) {
	QueneOper p=new QueneOper(5);
	p.enquene(90);p.enquene(20);p.enquene(90);p.enquene(88);p.enquene(23);p.enquene(45);
	p.peek();
	p.dequene();p.peek();p.dequene();p.peek();
}
}
