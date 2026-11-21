package DSA_prctc;

public class SDA_STR {
String[] s;
SDA_STR(int size){
	
	s=new String[size];
	
	}
	
	public void insert(int index,String val) {
		try {
			if(s[index] == null) {
				s[index]=val;
				
			}
			System.out.println("value inserted");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
}
	public void traversal() {
		for(int i=0;i<s.length;i++) {
			if(s[i]!=null) {
				System.out.println(s[i]);
			}
		}
	}
	
	public void search(String val) {
		for(int i=0;i<s.length;i++) {
			if(s[i].equals(val)) {
				System.out.println("the value found at"+ i+ "position");
				return;
			}
		}
		System.out.println("value not found");
	}
	public void serachbyindex(int index) {
		try {
			if(s[index]!=null) {
				System.out.println(s[index]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
	}
	public void deleteByIndex(int index) {
		try {
			if(s[index]!=null) {
				s[index]=null;
				System.out.println("value deleted");
				return;
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
	}
	public void deletebyval(String val) {
		for(int i=0;i<s.length;i++) {
			if(s[i].equals(val)) {
				s[i]=null;
				System.out.println("deleted");
				return;
				
			}
		}
		System.out.println("value not found");
	}
	public void delete() {
		s=null;
		System.out.println("array deleted");
	}
	public static void main(String[] args) {
		SDA_STR s= new SDA_STR(5);
		s.insert(0, "manoj");
		s.insert(1, "krish");
		s.insert(2, "cheths");
		s.insert(3, "raj");
		s.insert(4, "tewww");
		s.traversal();
		s.search("manoj");
		s.serachbyindex(2);
		s.deletebyval("raj");
		s.deleteByIndex(4);
		s.traversal();
		s.delete();
	}
}
