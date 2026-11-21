package DSA_prctc;

public class reverse_order_number_withoutloop {

	static void print(int no) {
		if(no==0)
			return;
		
		System.out.println(no);
		print(no-1);
	}
	public static void main(String[] args) {
		print(5);
	}
	
}
