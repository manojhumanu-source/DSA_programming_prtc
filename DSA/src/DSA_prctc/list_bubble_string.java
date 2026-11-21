package DSA_prctc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list_bubble_string {
public static void main(String[] args) {
	List<String> l1=new ArrayList<String>(Arrays.asList("jkl","abc","a","xcv","lkjhg"));
	for(int i=0;i<l1.size()-1;i++) {
		for(int j=0;j<l1.size()-1-i;j++) {
			if(l1.get(j).compareTo(l1.get(j+1))>0) {
				String t=l1.get(j);
				l1.set(j, l1.get(j+1));
				l1.set(j+1, t);
				
				
			}
		}
	}
	System.out.println(l1);
}
}
