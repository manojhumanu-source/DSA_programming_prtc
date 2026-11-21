
package DSA_prctc;

public class Employe_Array {

    Employee[] e;

    Employe_Array(int size) {
        e = new Employee[size];
    }

    public void insert(int index, Employee val) {
        try {
            if (e[index] == null) {
                e[index] = val;
                System.out.println("Inserted successfully");
            } else {
                System.out.println("Position already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid index");
        }
    }

    public void display() {
        for (Employee x : e) {
            if (x != null) {
                System.out.println(x);
            }
        }
    }

    public static void main(String[] args) {

        Employe_Array ea = new Employe_Array(5);

        ea.insert(0, new Employee(121, "abc", 897823896));
        ea.insert(1, new Employee(122, "def", 98123232));
        ea.insert(2, new Employee(123, "efg", 897456901));
        ea.insert(3, new Employee(124, "fef", 98233232));
        ea.insert(4, new Employee(125, "uig", 890745690));

        ea.display();
    }
}
