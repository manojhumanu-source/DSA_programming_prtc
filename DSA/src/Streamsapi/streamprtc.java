package Streamsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class streamprtc {
	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(22,12,90,45,67,4);
		
//		nums.stream().sorted()
//		.filter(n->n%2==1)
//		.map(n->n*1)
//		.forEach(n->System.out.println(n));
		
//    int sum = nums.stream().reduce(0,(a,b)->a+b);
//    System.out.println(sum);
    
   long count= nums.stream().count();
   System.out.println(count);
	
	
	
	}

}
