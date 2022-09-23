public class Employee {
    private final String firstName;
    private final String lastName;
    private final String passport;
    private int department;
    private double salary;
    private String sortId;

    public Employee(String firstName, String lastName, String passport, int department, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passport = passport;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    private String getSortId() {
        return sortId;
    }

    public String getFIO() {
        return lastName + " " + firstName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private void setSortId(String sortId) {
        this.sortId = sortId;
    }

    public static int compareTo(Employee a, Employee b) {
        if (a != null && b != null) {
            a.sortId = String.valueOf(a.department) + a.lastName;
            b.sortId = String.valueOf(b.department) + b.lastName;
            return a.sortId.compareTo(b.sortId);
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "id: " + passport + ", FIO: " + lastName + " " + firstName + ", passport: " + passport + ", dep: " + department + ", salary: " + salary;
    }
}
