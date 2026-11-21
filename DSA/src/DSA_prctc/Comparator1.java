package DSA_prctc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1 {
public static void main(String[] args) {
	
	Comparator<Integer> com = ( a, b)->(a % 10 > b % 10) ? 1 : -1;
		
	List<Integer> li= new ArrayList<Integer>(Arrays.asList(12,601,98,56,34,99));
	
	Collections.sort(li,com);
	
	li.forEach((no)->System.out.println(no));
	}
		
}

