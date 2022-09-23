public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();

        book.addEmployee("Daniil","Sergeyevich","123456",2,60_000);
        book.addEmployee("William", "Henry", "112233", 1, 10_000);
        book.addEmployee("Melinda", "French", "654321", 1, 8_000);
        book.addEmployee("Jeffrey", "Preston", "333444", 1, 12_000);
        book.addEmployee("Rafael","Nadal", "555678", 2,50_000);
        book.addEmployee("Novak","Djokovic","999932",2,45_000);

        System.out.println(book.findEmployee("123456"));
        book.deleteEmployee("123111");
        book.printEmployees();
        book.printEmployeesByDep(2);
        book.changeSalary("333444", 999000);
        System.out.println(book.getEmployeesCount());
    }
}