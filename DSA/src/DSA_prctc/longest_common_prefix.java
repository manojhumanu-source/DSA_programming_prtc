package DSA_prctc;

public class longest_common_prefix {
	public static void main(String[] args) {
		
	
String [] st= {"flower","flow","flight","flix"};
String prefix =st [0];
for(int i=1;i<st.length;i++) {
	while(!st[i].startsWith(prefix)) {
		prefix=prefix.substring(0,prefix.length()-1);
		
		if(prefix.isEmpty()) {
			System.out.println(" ");
			return;
		}
	}
	
}
System.out.println(prefix);
}
}