package DSA_prctc;

import java.util.Arrays;

public class Selection_sort {
public static void main(String[] args) {
	int[] arr= {5,6,7,2,1,3,4};
	for(int j=0;j<arr.length;j++) {
		int min=j;
		for(int i=j+1;i<arr.length;i++) {
			if(arr[i]<=arr[min]) {
				min=i;
			}
		}
		int temp=arr[j];
		arr[j]=arr[min];
		arr[min]=temp;
	}
	System.out.println(Arrays.toString(arr));
}
}
