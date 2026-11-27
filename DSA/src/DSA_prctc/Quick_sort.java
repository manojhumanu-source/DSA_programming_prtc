package DSA_prctc;

import java.util.Arrays;

public class Quick_sort {
public static int getpivot(int[] arr,int low,int high) {
	int pivot=high;
	int j=low-1;
	for(int i=low;i<=high;i++) {
		if(arr[i]<=arr[pivot]) {
			j++;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
	}
	return j;
}
public static void divide(int[] arr,int low,int high) {
	if(low<high) {
		int pivotLoc=getpivot(arr,low,high);
		divide(arr,low,pivotLoc-1);
		divide(arr,pivotLoc+1,high);
	}
}

public static void main(String[] args) {
	int[] arr= {6,3,5,7,2,1,4};
	System.out.println("before quick sort:\n"+Arrays.toString(arr));
	divide(arr,0,arr.length-1);
	System.out.println("after quick sort:\n"+Arrays.toString(arr));
}

}
