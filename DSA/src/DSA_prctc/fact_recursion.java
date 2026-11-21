package DSA_prctc;

public class fact_recursion {
static int fact(int no) {
	if(no==0) {
		return 1;
	}
	return no*fact(no-1);
}
public static void main(String[] args) {
	System.out.println(fact(5));
}
}
