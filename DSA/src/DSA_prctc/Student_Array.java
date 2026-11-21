
package DSA_prctc;

public class Student_Array {

    int id;
    String name;
    String course;

    Student_Array(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public String toString() {
        return id + " " + name + " " + course;
    }
}
