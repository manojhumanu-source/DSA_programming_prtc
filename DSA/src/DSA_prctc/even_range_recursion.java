package DSA_prctc;

public class even_range_recursion {

	static int print(int no) {
		if(no==0) {
			return 0;
		}
		
		return no+print(no-2);
		
	}
	public static void main(String[] args) {
		System.out.println(print(6));
	}
}
