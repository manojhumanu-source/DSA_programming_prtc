package DSA_prctc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

class employ{
	private int id;
	private String name;
	private double sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public employ(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "eid=" + id + ", ename=" + name + ", sal=" + sal ;
	}
}







public class class_bubble_sort {
public static void main(String[] args) {
	List<employ> l2= new ArrayList<employ>(Arrays.asList(new employ(103,"krish",45.43),
			new employ(103,"krish",45.43),
			new employ(101,"arsh",89.9),
			new employ(102,"krish",425.0),
			new employ(107,"harsh",43.13)));
	
//	for(int i=0;i<l2.size()-1;i++) {
//		for(int j=0;j<l2.size()-1-i;j++) {
//			if(l2.get(j).getName().compareTo(l2.get(j+1).getName())>0) {
//				employ t=l2.get(j);
//				l2.set(j, l2.get(j+1));
//				l2.set(j+1, t);
//			}
//		}
//	}
//	System.out.println(l2);
//	
//	for(int i=0;i<l2.size()-1;i++) {
//		for(int j=0;j<l2.size()-1-i;j++) {
//			if(l2.get(j).getId()>l2.get(j+1).getId()) {
//				employ t=l2.get(j);
//				l2.set(j, l2.get(j+1));
//				l2.set(j+1, t);
//			}
//		}
//	}
//	System.out.println(l2);
	
	 List<employ> sor = l2.stream()
             .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
             .toList();
sor.forEach(System.out::println);





}
}
