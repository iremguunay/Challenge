public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("İrem", 25, 15000, "Ankara");
        Employee employee2 = new Employee("Özge", 25, 20000, "Talin");

        employee1.raiseSalary();

        System.out.println(employee1.name + ": " + employee1.salary);
        System.out.println(employee2.name + ": " + employee2.salary);

    }
}
