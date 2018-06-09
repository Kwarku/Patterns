package pl.narodzinyprogramisty.PrototypeV2;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
    private List<Employee> employees;

    public Employees() {
        employees = new ArrayList<>();
    }

    public Employees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employees=" + employees +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employees tempEmployees = new Employees();
        for (Employee employee : employees) {
            tempEmployees.employees.add((Employee) employee.clone());
        }
        return tempEmployees;
    }
}
