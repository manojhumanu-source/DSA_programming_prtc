package TWO_D;

public class TWO_column_reverse 
{
	public static void main(String[] args) 
	{
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		
		// column reverse without swapping just printing
//		for(int r=a.length-1;r>=0;r--) {
//			for(int c=0;c<a[r].length;c++) {
//				System.out.print(a[r][c]+ " ");
//			}
//			System.out.println();
//		}
		
		
		
		//column reverse with swapping and original array disruption
		for(int c=0;c<a[0].length;c++) {
			int top=0,end=a[c].length-1;
			while(top<end) {
				int t=a[top][c];
				a[top][c]=a[end][c];
				a[end][c]=t;
				top++;end--;
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
