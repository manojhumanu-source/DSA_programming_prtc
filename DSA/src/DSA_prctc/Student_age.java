package DSA_prctc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student_age {
String name;
int age;
int marks;
double cgpa;
public Student_age(String name, int age, int marks, double cgpa) {
	super();
	this.name = name;
	this.age = age;
	this.marks = marks;
	this.cgpa = cgpa;
}
@Override
public String toString() {
	return "Student_age [name=" + name + ", age=" + age + ", marks=" + marks + ", cgpa=" + cgpa + "]";
}
	public static void main(String[] args) {
		
		Student_age x=new Student_age("abc",22,89,9.3);
		Student_age x1=new Student_age("def",21,23,7.3);
		Student_age x2=new Student_age("wer",28,39,7.8);
		
		Comparator <Student_age> c1=(Student_age a, Student_age b)->a.cgpa>b.cgpa ? 1 : -1;
		
		List<Student_age> l1= new ArrayList<Student_age>(Arrays.asList(x,x1,x2));
		
		Collections.sort(l1,c1.reversed());
		
		l1.forEach((no)->System.out.println(no));
	}
	
}
