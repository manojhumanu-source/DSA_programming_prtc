package DSA_prctc;

import java.util.LinkedList;
import java.util.Queue;

class Order{
	int oid;
	String item;
	
	Order(int oid,String item){
		this.oid=oid;
		this.item=item;
	}
}
class Restaurant{
	Queue<Order> q = new LinkedList();
	void placeorder(Order o) {
		q.add(o);
		System.out.println("the order"+o.oid+"is placed");
	}
	
	void display() {
		System.out.println("displayboard");
		for(Order order:q) {
			System.out.println(order.oid+" "+order.item);
		}
		System.out.println("----------------");
	}
	
	
	int preparetime(String item) {
		switch (item.toLowerCase()){
		case "dessert" : return 10;
		case "burger" : return 8;	
		case "fries" :return 5;
		case "pizza":return 9;
		default : return 5;
		}
	}
	void prepareorder() throws InterruptedException {
		while(!q.isEmpty()) {
			Order current = q.peek();
			System.out.println("the current order is "+current.oid);
			int time=preparetime(current.item);
			for(int i=time;i>1;i--) {
				System.out.println("preparing==== in "+i+" min ");
				Thread.sleep(1000);
			}
			System.out.println("the order "+current.oid+" is ready");
			q.poll();
			display();
			
		}
	}
}


public class Billing {
	public static void main(String[] args) throws InterruptedException {
		Restaurant r= new Restaurant();
		r.placeorder(new Order(1002,"burger"));
		r.placeorder(new Order(1002,"pizza"));
		r.placeorder(new Order(1003,"fries"));
		r.placeorder(new Order(1004, "dessert"));
		r.display();
		r.prepareorder();
		
	}

}
