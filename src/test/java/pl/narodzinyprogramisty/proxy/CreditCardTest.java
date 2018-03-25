package pl.narodzinyprogramisty.proxy;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.assertThat;

public class CreditCardTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    private CreditCard creditCard;

    @Before
    public void setUp() {
        creditCard = new CreditCard("PEKAO12345", "1234");
    }

    @Test
    public void transferTest() throws ErrorCardValidateException {
        int startSaldo = creditCard.getBankAccount().getSaldo();
        int ammount = 200;
        creditCard.transfer(ammount);

        int endSaldo = creditCard.getBankAccount().getSaldo();

        assertThat(startSaldo).isEqualTo(new BankAccount("").getSaldo());
        assertThat(endSaldo).isEqualTo(startSaldo - ammount);
    }

    @Test
    public void wrongCardIdTest() throws ErrorCardValidateException {
        creditCard = new CreditCard("MBANK12345", "1234");

        thrown.expect(ErrorCardValidateException.class);
        thrown.expectMessage("Credit card not valid!");

        creditCard.transfer(1234);
    }

    @Test
    public void toShortPinTest() throws ErrorCardValidateException {
        creditCard = new CreditCard("PEKAO12345", "123");

        thrown.expectMessage("Credit card not valid!");
        thrown.expect(ErrorCardValidateException.class);

        creditCard.transfer(120);
    }
}