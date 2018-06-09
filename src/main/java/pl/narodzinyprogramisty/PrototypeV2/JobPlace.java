package pl.narodzinyprogramisty.PrototypeV2;

import java.util.ArrayList;
import java.util.List;

public class JobPlace {
    public static void main(String[] args) throws CloneNotSupportedException {

        Human human = new Human("Paweł", "Kukiz", 45);
        Employee employee = new Employee(2400.40f, "director", human);

        Human human1 = new Human("Andzej", "Dusza", 60);
        Employee employee1 = new Employee(45000f, "hr", human1);

        Employee employee3 = (Employee) employee.clone();
        employee3.setSalary(100000f);

        System.out.println("Pracownicy");
        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee3);

        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee3);
        Employees employees = new Employees(list);

        System.out.println("Pierwsza lista");
        System.out.println(employees);

        System.out.println("Druga lista pzrez kopie");
        Employees employees1 = (Employees) employees.clone();
        System.out.println(employees1);
    }
}
