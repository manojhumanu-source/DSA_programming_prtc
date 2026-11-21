package DSA_prctc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student_name_sort {
String name;
int  age;
double cgpa;
int marks;
public Student_name_sort(String name, int age, double cgpa, int marks) {
	super();
	this.name = name;
	this.age = age;
	this.cgpa = cgpa;
	this.marks = marks;
}
@Override
public String toString() {
	return "Student_name_sort [name=" + name + ", age=" + age + ", cgpa=" + cgpa + ", marks=" + marks + "]";
}
public static void main(String[] args) {
	
	Student_name_sort s1 = new Student_name_sort("abc",22,8.56,90);
	Student_name_sort s2 = new Student_name_sort("def",23,5.56,30);
	Student_name_sort s3 = new Student_name_sort("ghi",9,9.26,20);
	
	Comparator<Student_name_sort> c1=(Student_name_sort a,Student_name_sort b)->a.name.compareTo(b.name);
	
	List<Student_name_sort> lis=new ArrayList<Student_name_sort>(Arrays.asList(s1,s2,s3));
	
	Collections.sort(lis,c1);
	lis.forEach((no)->System.out.println(no));
}
}
