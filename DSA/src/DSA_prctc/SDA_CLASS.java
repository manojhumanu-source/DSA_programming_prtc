
package DSA_prctc;

public class SDA_CLASS {

    Student_Array[] s;

    SDA_CLASS(int size) {
        s = new Student_Array[size];
    }

    public void insert(int index, Student_Array val) {
        try {
            if (s[index] == null) {
                s[index] = val;
                System.out.println("Value inserted");
            } else {
                System.out.println("Position already occupied");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        } 
    }


    public void traversal() {
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                System.out.println(s[i]);
            }
        }
    }

   
    public void search(int id) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null && s[i].id == id) {
                System.out.println("Student found at " + i + " position");
                System.out.println(s[i]);
                return;
            }
        }
        System.out.println("Student not found");
    }

   
    public void searchByIndex(int index) {
        try {
            if (s[index] != null) {
                System.out.println(s[index]);
            } else {
                System.out.println("Position is empty");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }

   
    public void deleteByIndex(int index) {
        try {
            if (s[index] != null) {
                s[index] = null;
                System.out.println("Student deleted");
            } else {
                System.out.println("Position is empty");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }

    
    public void deleteById(int id) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null && s[i].id == id) {
                s[i] = null;
                System.out.println("Student deleted");
                return;
            }
        }
        System.out.println("Student not found");
    }

    
    public void delete() {
        s = null;
        System.out.println("Array deleted");
    }

    public static void main(String[] args) {

        SDA_CLASS obj = new SDA_CLASS(5);

        obj.insert(0, new Student_Array(101, "Manoj", "Java"));
        obj.insert(1, new Student_Array(102, "Krish", "Python"));
        obj.insert(2, new Student_Array(103, "Chethan", "React"));
        obj.insert(3, new Student_Array(104, "Raj", "SQL"));

        
        obj.traversal();

        
        obj.search(102);

        
        obj.searchByIndex(2);

       
        obj.deleteById(103);

       
        obj.deleteByIndex(3);

        
        obj.traversal();

        obj.delete();
    }
}
