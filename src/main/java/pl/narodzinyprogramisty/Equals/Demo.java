package pl.narodzinyprogramisty.Equals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Alex");
        Student s2 = new Student(1, "Alex");
        HashSet<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println("Hashset size = " + students.size());
        System.out.println("HashSet contains s1 = " + students.contains(new Student(1, "Alex")));

//        Student alex = new Student(1, "Alex");
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(alex);
//        System.out.println("Arraylist size = " + studentList.size());
//        System.out.println("Arraylist contains s1 = " + studentList.contains(new Student(1, "Alex")));

//        Student s1 = new Student(1, "Alex");
//        Student s2 = new Student(1, "Alex");
//
//        System.out.println("s1 hash code " + s1.hashCode());
//        System.out.println("s2 hash code " + s2.hashCode());
//        System.out.println("Checking equality between alex1 and alex2 = " + s1.equals(s2));
    }
}
