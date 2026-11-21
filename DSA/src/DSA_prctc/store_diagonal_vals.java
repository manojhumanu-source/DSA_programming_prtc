package DSA_prctc;

public class store_diagonal_vals 
{
	
public static void main(String[] args) 
{
	int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
	
//	for(int r=0;r<a.length;r++) {
//		for(int c=0;c<a[r].length;c++) {
//			if(r==c)
//				System.out.print(a[r][c]+" ");
//		}
//		System.out.println();
//	}
	
//	for(int i=0;i<a.length;i++) {
//		System.out.println(a[i][i]);
//	}
	
	int i=0;
	for(int[] row:a) {
		System.out.println(row[i]);
		i++;
	}
}
}
