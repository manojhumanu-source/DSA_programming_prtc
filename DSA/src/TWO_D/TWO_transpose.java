package TWO_D;

public class TWO_transpose {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		
		//transpose of matrix only printing
//		for(int r=0;r<a.length;r++) {
//			for(int c=0;c<a[r].length;c++) {
//				System.out.print(a[c][r]);
//			}
//			System.out.println();
//		}
		
		
		// inplace transpose of 2d matrix 
		
		for(int r=0;r<a.length;r++) {
			for(int c=r+1;c<a[r].length;c++) {
				int t=a[r][c];
				a[r][c]=a[c][r];
				a[c][r]=t;
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
