import com.tnsif.Assignment_1.employees.Developer;
import com.tnsif.Assignment_1.employees.Manager;
import com.tnsif.Assignment_1.utilities.EmployeeUtilities;

/**
 * Main class to test Employee, Manager, Developer, and EmployeeUtilities
 */
public class AssignmentMain {
    public static void main(String[] args) {
        Manager m = new Manager("Ravi", 101, 50000, "IT");
        Developer d = new Developer("Sita", 102, 40000, "Java");

        System.out.println("--- Manager Details ---");
        EmployeeUtilities.displayEmployeeInfo(m);
        System.out.println("Department: " + m.getDepartment());

        System.out.println("\n--- Developer Details ---");
        EmployeeUtilities.displayEmployeeInfo(d);
        System.out.println("Programming Language: " + d.getProgrammingLanguage());

        // Increase salary
        EmployeeUtilities.increaseSalary(m, 10);
        EmployeeUtilities.increaseSalary(d, 15);

        System.out.println("\n--- After Salary Hike ---");
        EmployeeUtilities.displayEmployeeInfo(m);
        EmployeeUtilities.displayEmployeeInfo(d);
    }
}
