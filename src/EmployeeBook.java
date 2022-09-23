import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    private Map<String, Employee> employees = new HashMap<>();
    private final String ERR_EMPL_NOT_FOUND = "Employee not found";

    public void addEmployee(String firstName, String lastName, String passport, int department, double salary) {
        employees.put(passport, new Employee(firstName, lastName, passport, department, salary));
    }

    public void deleteEmployee(String passport) {
        if (employees.containsKey(passport)) {
            employees.remove(passport);
        } else {
            throw new RuntimeException(ERR_EMPL_NOT_FOUND);
        }
    }

    public Employee findEmployee(String passport) {
        if (employees.containsKey(passport)) {
            return employees.get(passport);
        } else {
            throw new RuntimeException(ERR_EMPL_NOT_FOUND);
        }
    }

    public void printEmployees() {
        for (Map.Entry<String, Employee> employee : employees.entrySet()) {
            System.out.println(employee.toString());
        }
    }

    public void printEmployeesByDep(int department) {
        for (Map.Entry<String, Employee> employee : employees.entrySet()) {
            if (employee.getValue().getDepartment() == department) {
                System.out.println(employee.toString());
            }
        }
    }

    public void changeSalary(String passport, double newSalary) {
        if (employees.containsKey(passport)) {
            employees.get(passport).setSalary(newSalary);
        } else {
            throw new RuntimeException(ERR_EMPL_NOT_FOUND);
        }
    }

    public int getEmployeesCount() {
        return employees.size();
    }
}
