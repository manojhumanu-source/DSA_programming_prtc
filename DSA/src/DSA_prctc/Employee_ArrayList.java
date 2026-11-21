
package DSA_prctc;

import java.util.ArrayList;

public class Employee_ArrayList {

    ArrayList<Employee> al;

    Employee_ArrayList() {
        al = new ArrayList<Employee>();
    }

    public void insert(Employee val) {
        al.add(val);
        System.out.println("Inserted successfully");
    }

    public void searchById(int id) {

        for (Employee x : al) {

            if (x.e_id == id) {
                System.out.println(x);
                return;
            }
        }

        System.out.println("Employee not found");
    }

    public void deleteById(int id) {

        for (int i = 0; i < al.size(); i++) {

            if (al.get(i).e_id == id) {
                al.remove(i);
                System.out.println("Employee deleted successfully");
                return;
            }
        }

        System.out.println("Employee not found");
    }

    public void display() {

        for (Employee x : al) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        Employee_ArrayList ea = new Employee_ArrayList();

        ea.insert(new Employee(121, "abc", 897823896));
        ea.insert(new Employee(122, "def", 98123232));
        ea.insert(new Employee(123, "efg", 897456901));
        ea.insert(new Employee(124, "fef", 98233232));
        ea.insert(new Employee(125, "uig", 890745690));

        System.out.println("\nSearch by ID:");
        ea.searchById(123);

        System.out.println("\nDelete by ID:");
        ea.deleteById(123);

        System.out.println("\nDisplay:");
        ea.display();
    }
}
