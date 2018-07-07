package pl.narodzinyprogramisty.DeepCopy;
/**
* #DeepCopy
 *
 * Klonowanie wsystkich obiektów i pół z obiektu kopionwanego
 * jeżeli obiekt zawiera inne obiekty, te również są klonowane.
 * Zjada dużo pamięci.
* */
public class DeepCopyDemo {
    public static void main(String[] args) {
        Course course = new Course("q1", "q2", "q3");
        Student student1 = new Student(1, "Adam", course);
        Student student2 = null;

        try {
            student2 = (Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("studnet1\n"+ student1 + "\n");
        System.out.println("student2\n" + student2 + "\n");

        student2.getCourse().setSub1("TEST");
        System.out.println("stundet2 z innym kursem \n" + student2 );
    }
}
