package DSA_prctc;

public class TWO_D_A {
	
	int[][] a;

	public TWO_D_A(int r, int c) {
		
		a=new int[r][c];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=Integer.MIN_VALUE;
			}
		}
	}
	
	public void insert(int r,int c,int val) {
		try {
			if(a[r][c]==Integer.MIN_VALUE) {
				a[r][c]=val;
				System.out.println("value inserted");
			}else {
				System.out.println("invalid index");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid");
		}
	}
	
	public void traverse() {
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a.length;c++) {
				if(a[r][c]!=Integer.MIN_VALUE)
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	public void serachbyval(int val) {
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a.length;c++) {
				if(a[r][c]==val) {
					System.out.println("value found is "+r +c);
					return;
				}
				else {
					System.out.println("value not found");
				}
			}
		}
		System.out.println("invalid");
	}
	public void searchbyindex(int r,int c) {
		try {
			if(a[r][c]!=Integer.MIN_VALUE) {
				System.out.println("value found is "+a[r][c]);
			}else {
				System.out.println("element not found");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid");
		}
		
	}
	
	
	public void deletebyval(int val) {
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a.length;c++) {
				if(a[r][c]==val) {
					a[r][c]=Integer.MIN_VALUE;
					System.out.println("value deleted");
					return;
				}else {
					System.out.println("element not deleted");
				}
			}
		}
		System.out.println("invalid");
	}
	
	
	public void deletebyindex(int r,int c) {
		try {
			if(a[r][c]!=Integer.MIN_VALUE) {
				a[r][c]=Integer.MIN_VALUE;
				System.out.println("value deleted");
			}else {
				System.out.println("value not deleted");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid");
		}
	}
	
	public static void main(String[] args) {
		TWO_D_A t= new TWO_D_A(3, 3);
		t.insert(0, 0, 11);t.insert(0, 1, 12);t.insert(0, 2, 13);
		t.insert(1, 0, 14);t.insert(1, 1, 15);t.insert(1, 2, 16);
		t.insert(2, 0, 17);t.insert(2, 1, 18);t.insert(2, 2, 19);
		t.traverse();
		t.searchbyindex(1, 1);
		t.serachbyval(19);
		t.deletebyindex(0, 2);
		t.deletebyval(11);
		t.traverse();
		t.serachbyval(12);
	}
	}
