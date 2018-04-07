package pl.narodzinyprogramisty.builder;

import java.time.LocalDate;
import java.util.Objects;
/**
 *  Builder uzywany jest jako klasa moetoda konstrukcji skapiikowanych obietkow, z duzą iloscią pól.
 *  dodawany jest jako klasa wew do klasy ktora buduje.
 *  Daje przyjazny sposób budowania obiektów.
 *
 *  Mozna stworzyc interface builder ktory bedzie implemetnowany przez konkretne implementacje, w celu
 *  budowana roznego rodzaju podobnych do sibiei oiektów.
 *
 *  np.
 *  budowanie obiektu myszka komputerowa,
 *  kazda myszka sklada sie z tych samych rzeczy, pokretla przyciskow slizgaczy obudowy czujnika.
 *  Implementajca jedna moze byc mysz za 10 zl a inna jakies Roccaty Razery i inne.
 */

public class Person {
    private final String firstName;
    private final String secondName;
    private final String surname;
    private final String pesel;
    private final LocalDate birthdayData;
    private final String profession;


    public Person(String firstName,
                  String secondName,
                  String surname,
                  String pesel,
                  LocalDate birthdayData,
                  String profession) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.pesel = pesel;
        this.birthdayData = birthdayData;
        this.profession = profession;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(secondName, person.secondName) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(pesel, person.pesel) &&
                Objects.equals(birthdayData, person.birthdayData) &&
                Objects.equals(profession, person.profession);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, secondName, surname, pesel, birthdayData, profession);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", birthdayData=" + birthdayData +
                ", profession='" + profession + '\'' +
                '}';
    }

    public static class PersonBuilder{
        private String nestedFirstName;
        private String nestedsScondName;
        private String nestedSurname;
        private String nestedPesel;
        private LocalDate nestedBirthdayData;
        private String nestedProfession;


        public PersonBuilder firstName(String newFirstName) {
            this.nestedFirstName = newFirstName;
            return this;
        }

        public PersonBuilder secondName(String newSecondName) {
            this.nestedsScondName = newSecondName;
            return this;
        }

        public PersonBuilder surname(String newSurname) {
            this.nestedSurname = newSurname;
            return this;
        }

        public PersonBuilder pesel(String newPesel) {
            this.nestedPesel = newPesel;
            return this;
        }

        public PersonBuilder birthdayData(LocalDate newBirthdayData) {
            this.nestedBirthdayData = newBirthdayData;
            return this;
        }

        public PersonBuilder profession(String newProfession) {
            this.nestedProfession = newProfession;
            return this;
        }

        public Person createPerson(){
            return new Person(nestedFirstName,
                    nestedsScondName,
                    nestedSurname,
                    nestedPesel,
                    nestedBirthdayData,
                    nestedProfession);
        }
    }
}
