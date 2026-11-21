package DSA_prctc;

public class reverse_string_recursion {
static String reverse(String s) {
	
	if(s.isEmpty()) {
		return "";
	}
	return reverse(s.substring(1))+s.charAt(0);
	
}
public static void main(String[] args) {
	System.out.println(reverse("louder"));
}
}
