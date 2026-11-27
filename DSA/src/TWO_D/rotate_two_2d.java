 package TWO_D;

import java.util.Arrays;

public class rotate_two_2d 
{
public static void main(String[] args)
{
	int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
//	
//	for(int r=0;r<a.length;r++) {
//		for(int c=a[r].length-1;c>=0;c--) {
//			System.out.print(a[c][r]+ " ");
//		}
//		System.out.println();
//	}
	
	for(int r = 0; r < a.length; r++) {
        for(int c = r + 1; c < a[r].length; c++) {

            int t = a[r][c];
            a[r][c] = a[c][r];
            a[c][r] = t;
        }
    }
	
	 for(int r = 0; r < a.length; r++) {

         int i = 0;
         int j = a[r].length - 1;

         while(i < j) {

             int t = a[r][i];
             a[r][i] = a[r][j];
             a[r][j] = t;

             i++;
             j--;
         }
     }

	 for(int r=0;r<a.length;r++) {
			for(int c=0;c<a[r].length;c++) {
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
 }
	
}

