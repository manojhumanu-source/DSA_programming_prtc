package TWO_D;

public class two_d_rotate_anticlock 
{
	public static void main(String[] args) 
	{
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		for(int r=0;r<a.length;r++) {
			for(int c=r+1;c<a[r].length;c++) {
				int t=a[r][c];
				a[r][c]=a[c][r];
				a[c][r]=t;
			}
		}
		
		for(int c=0;c<a.length;c++) {
			int top=0,end=a.length-1;
			while(top<end) {
				int t=a[top][c];
				a[top][c]=a[end][c];
				a[end][c]=t;
				top++;end--;
			}
		}
		
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a.length;c++) {
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
	}

}
