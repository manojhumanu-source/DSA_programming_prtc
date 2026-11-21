package DSA_prctc;

public class Longest_palindrome {
 public static boolean ispal(String s) {
	 int i=0,j=s.length()-1;
	 while(i<j) {
		 if(s.charAt(i)!=s.charAt(j)) {
			 return false;
		 }
		 i++;j--;
	 }
	 return true;
 }
 public static void main(String[] args) {
	String s="sst",word="";
	int max=0;
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<=s.length();j++) {
			String temp=s.substring(i,j);
			
			if(ispal(temp)&&temp.length()>max) {
				max=temp.length();
				word=temp;
			}
		}
	}
	System.out.println(word+" "+max);
}
}
