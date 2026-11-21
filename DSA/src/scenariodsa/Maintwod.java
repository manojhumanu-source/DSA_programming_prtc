package scenariodsa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

import Streamsapi.main;

class Emp{
	private int ID;
	private String NAME;
	private long SALARY;
	private String DESIGNATION;
	private int EXP;
	private  String LOCATION;
	private String GENDER;
	public Emp(int iD, String name, long sALARY, String dESIGNATION, int eXP, String lOCATION, String gENDER) {
		
		ID = iD;
		NAME = name;
		SALARY = sALARY;
		DESIGNATION = dESIGNATION;
		EXP = eXP;
		LOCATION = lOCATION;
		GENDER = gENDER;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return NAME;
	}
	public void setName(String name) {
		NAME = name;
	}
	public long getSALARY() {
		return SALARY;
	}
	public void setSALARY(long sALARY) {
		SALARY = sALARY;
	}
	public String getDESIGNATION() {
		return DESIGNATION;
	}
	public void setDESIGNATION(String dESIGNATION) {
		DESIGNATION = dESIGNATION;
	}
	public int getEXP() {
		return EXP;
	}
	public void setEXP(int eXP) {
		EXP = eXP;
	}
	public String getLOCATION() {
		return LOCATION;
	}
	public void setLOCATION(String lOCATION) {
		LOCATION = lOCATION;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	@Override
	public String toString() {
		return "Emp [ID=" + ID + ", Name=" + NAME + ", SALARY=" + SALARY + ", DESIGNATION=" + DESIGNATION + ", EXP="
				+ EXP + ", LOCATION=" + LOCATION + ", GENDER=" + GENDER + "]";
	}
}

public class Maintwod {
	
	private static final  int ID =0;
	private static final  int NAME=1;
	private static final  int SALARY=2;
	private static final  int DESIGNATION=3;
	private static final  int EXP=4;
	private static final  int LOCATION =5;
	private static final  int GENDER =6;
	
	private static String[][] Emp=  { { "101", "Asha", "85000", "Java Full Stack Developer", "5", "Hyderabad", "Female" },
			{ "102", "Rahul", "92000", "Backend Developer", "7", "Bengaluru", "Male" },
			{ "103", "Sneha", "98000", "Java Full Stack Developer", "6", "Hyderabad", "Female" },
			{ "104", "Kiran", "76000", "Java Full Stack Developer", "4", "Hyderabad", "Male" },
			{ "105", "Divya", "88000", "QA Engineer", "8", "Chennai", "Female" },
			{ "106", "Arjun", "105000", "Technical Lead", "10", "Pune", "Male" },
			{ "107", "Priya", "91000", "Java Full Stack Developer", "9", "Hyderabad", "Female" }, };
	
	public void highestSalary() {

	    int max = 0;
	    int index = 0;

	    for (int i = 0; i < Emp.length; i++) {
	        int sal = Integer.parseInt(Emp[i][2]);

	        if (sal > max) {
	            max = sal;
	            index = i;
	        }
	    }

	    System.out.println("Employee Details:");

	    for (int i = 0; i < Emp[index].length; i++) {
	        System.out.print(Emp[index][i] + " ");
	    }
	}	public static void main(String[] args) {
		
		Maintwod t1= new Maintwod();
//		t1.highestSalary();
		Optional<String[]> maxSalary = Arrays.stream(Emp)
				.max(Comparator.comparingDouble(c -> Double.parseDouble(c[SALARY])));
		maxSalary.ifPresent(Maintwod::displayCustomerDetails);
	}
	static void displayCustomerDetails(String[] emp) {
		System.out.println("Id: " + emp[ID] + "\t" + "Name: " + emp[NAME] + "\t" + "Salary: " + emp[SALARY] + "\t"
				+ "Designation: " + emp[DESIGNATION] + "\t" + "Exp: " + emp[EXP] + "\t" + "Location: "
				+ emp[LOCATION] + "\t" + "Gender: " + emp[GENDER]);
	}

		
	}


