package DSA_prctc;

public class SDA {
int [] a;
SDA(int size){
	a=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=Integer.MIN_VALUE;
	}}
	public void insert (int index,int val) {
		try {
			if(a[index]==Integer.MIN_VALUE) {
				a[index]=val;
				System.out.println("values inserted");
			}
			else {
				System.out.println("value not inserted");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
	}
	public void traversal() {
		for(int i=0;i<a.length;i++) {
			if(a[i]!=Integer.MIN_VALUE)
			System.out.println(a[i]);
		}
	}
	public void search(int val) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==val) {
				System.out.println("the value found at"+i+"position");
				return;
			}
		}
		
		System.out.println("values not found");
	}
	public void serachbyindex(int index) {
		try {
			if(a[index]!=Integer.MIN_VALUE) {
				System.out.println(a[index]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
	}
	public void deleteByIndex(int index) {
		try {
			if(a[index]!=Integer.MIN_VALUE) {
				a[index]=Integer.MIN_VALUE;
				System.out.println("value deleted");
				return;
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
	}
	public void deletebyval(int val) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==val) {
				a[i]=Integer.MIN_VALUE;
				System.out.println("deleted");
				return;
				
			}
		}
		System.out.println("value not found");
	}
	public static void main(String[] args) {
		SDA s=new SDA(5);
		s.insert(0, 10);
		s.insert(1, 20);
		s.insert(2, 30);
		s.insert(3, 40);
		s.insert(4, 50);
		s.traversal();
		s.search(40);
		s.serachbyindex(1);
		s.deletebyval(10);
		s.deletebyval(10);
		s.deleteByIndex(2);
		s.traversal();
	}
}

