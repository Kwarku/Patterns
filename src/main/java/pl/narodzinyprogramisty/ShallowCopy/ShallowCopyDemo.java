package pl.narodzinyprogramisty.ShallowCopy;
/**
 * #Shallow Copy
 *
 * kopiowanie płytkie. Kopiuje tylko pola pryitywne danego obiektu, obiekty wewnentrzne nie sa kopiowane.
 * Te obiekty wew są przekazywane są przez referencje.
 *
 * */
public class ShallowCopyDemo {
    public static void main(String[] args) {
        Course course = new Course("1", "2", "3");
        Student s1 = new Student(1, "test1", course);
        Student s2 = null;

        try {
            s2 = (Student) s1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        s2.setCourse(new Course("w1", "w2", "w3"));
        System.out.println(s2.toString());
    }
}
