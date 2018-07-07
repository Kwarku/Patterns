package pl.narodzinyprogramisty;

public class Employee implements Cloneable{
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return  super.clone();
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Abhi");

        try {
            Employee emp2 = (Employee) emp.clone();
            System.out.println(emp2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
