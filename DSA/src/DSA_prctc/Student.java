package DSA_prctc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
String name;
int age;
int marks;
double cgpa;
public Student(String name, int age, int marks, double cgpa) {
	this.name = name;
	this.age = age;
	this.marks = marks;
	this.cgpa = cgpa;
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", marks=" + marks + ", cgpa=" + cgpa + "]";
}
public static void main(String[] args) {
	Student s1= new Student("abc",22,89,56.33);
	Student s2= new Student("xyz",21,78,26.43);
	Student s3= new Student("ayz",25,38,16.53);
	Student s4= new Student("oyz",99,28,46.93);
	
	Comparator<Student> com = ( Student a, Student b)->a.marks>b.marks ? 1 : -1;
	
	
	List<Student> x=new ArrayList(Arrays.asList(s1,s2,s3,s4));
	
	Collections.sort(x,com.reversed());
	x.forEach((no)->System.out.println(no));
	
}
}
