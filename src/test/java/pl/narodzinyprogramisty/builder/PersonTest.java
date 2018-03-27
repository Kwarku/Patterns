package pl.narodzinyprogramisty.builder;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {
    private Person person;
    private Person.PersonBuilder personBuilder;
    private String firstName;
    private String secondName;
    private String surname;
    private String pesel;
    private LocalDate birthdayData;
    private String profession;



    @Before
    public void setUp() {
        firstName = "Jan";
        secondName = "Maria";
        surname = "Rokita";
        pesel = "1234";
        birthdayData = LocalDate.now();
        profession = "Political";

        person = new Person(firstName, secondName, surname, pesel, birthdayData, profession);

        personBuilder = new Person.PersonBuilder();
    }

    @Test
    public void buildPersonTest() {
        personBuilder.firstName(firstName);
        personBuilder.secondName(secondName);
        personBuilder.surname(surname);
        personBuilder.pesel(pesel);
        personBuilder.birthdayData(birthdayData);
        personBuilder.profession(profession);

        Person testPerson = personBuilder.createPerson();

        assertThat(testPerson).isEqualTo(person).isNotNull();

    }
}