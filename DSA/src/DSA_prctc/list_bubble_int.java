package DSA_prctc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list_bubble_int {

	public static void main(String[] args) {
		List<Integer> la= new ArrayList(Arrays.asList(112,34,78,45,59,45));
		
		for(int i=0;i<la.size()-1;i++) {
			for(int j=0;j<la.size()-1-i;j++) {
				if(la.get(j)>la.get(j+1)) {
					int t=la.get(j);
					la.set(j,la.get(j+1));
					la.set(j+1, t);
				}
			}
		}
		System.out.println(la);
	}
	
}
