package pl.narodzinyprogramisty.PrototypeV2;

public class Employee implements Cloneable {
    private float salary;
    private String jobPosition;
    private Human human;

    public Employee(){}

    public Employee(float salary, String jobPossition, Human human) {
        this.salary = salary;
        this.jobPosition = jobPossition;
        this.human = human;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", jobPosition='" + jobPosition + '\'' +
                ", human=" + human +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee tempEmployee = new Employee();
        tempEmployee.salary = this.salary;
        tempEmployee.jobPosition = this.jobPosition;
        tempEmployee.human = (Human) this.human.clone();
        return tempEmployee;

    }


}
