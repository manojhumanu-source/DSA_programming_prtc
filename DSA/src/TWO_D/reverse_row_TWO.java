package TWO_D;

import java.util.Arrays;

public class reverse_row_TWO 
{
	public static void main(String[] args) 
	{
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		
		
		//for loop reverse printing
//		for(int r=0;r<a.length;r++) {
//			for(int c=a[r].length-1;c>=0;c--) {
//				System.out.print(a[r][c]+ " ");
//			}
//			System.out.println();
//		}
		
		
		//reverse by swapping
		for(int i=0;i<a.length;i++) {
			int left=0,right=a[i].length-1;
			while(left<right) {
				int t=a[i][left];
				a[i][left]=a[i][right];
				a[i][right]=t;
				left++;right--;
			}
		}
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a[r].length;c++) {
				System.out.print(a[r][c]);
			}
			System.out.println();
		}
	}

}
