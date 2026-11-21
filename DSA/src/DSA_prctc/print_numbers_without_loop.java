package DSA_prctc;

public class print_numbers_without_loop {
	static void print(int no) {
		if(no==0) {
			return;
		}
		 print(no-1);
		 System.out.println(no);
		
	}
	public static void main(String[] args) {
		print(5);
	}

}
