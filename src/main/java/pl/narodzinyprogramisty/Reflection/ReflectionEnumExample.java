package pl.narodzinyprogramisty.Reflection;

public class ReflectionEnumExample {
    public static void main(String[] args) {
        Class c;
        c = Day.SUNDAY.getClass();
        System.out.println(c.getName());

        boolean isMen = false;

        System.out.println(int.class);
    }
}

enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
