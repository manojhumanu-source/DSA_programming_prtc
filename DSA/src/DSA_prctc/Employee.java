
package DSA_prctc;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {

    int e_id;
    String name;
    long e_phno;

    public Employee(int e_id, String name, long e_phno) {
        this.e_id = e_id;
        this.name = name;
        this.e_phno = e_phno;
    }

    @Override
    public String toString() {
        return "Employee [e_id=" + e_id +
               ", name=" + name +
               ", e_phno=" + e_phno + "]";
    }
}


