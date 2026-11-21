package DSA_prctc;

class Emp2 {
    private int id;
    private String name;
    private double sal;

    public Emp2(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

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

    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
    }
}

public class TWO_D_PBJECT_ARR {
    public static void main(String[] args) {
        Emp2[][] e = {
            { new Emp2(134, "sharath", 55000.78), new Emp2(56, "pavan", 42000.54) },
            { new Emp2(198, "Chetan", 68000.21), new Emp2(200, "manoj", 49000.99) }
        };

       
 
        	for(int i=0;i<e.length;i++) {
        		for(int j=0;j<e.length-1-i;j++) {
        			 if (e[i][j].getId() > e[i][j + 1].getId()) {
                     Emp2 temp = e[i][j];
                       e[i][j] = e[i][j + 1];
                       e[i][j + 1] = temp;
        		}
        	}
        	}
       
        for (int j = 0; j < e.length; j++) {
            for (int j2 = 0; j2 < e[j].length; j2++) {
                System.out.print(e[j][j2] + " ");
            }
            System.out.println();
        }
    }
}