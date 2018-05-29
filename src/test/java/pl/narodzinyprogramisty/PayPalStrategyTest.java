package pl.narodzinyprogramisty;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import pl.narodzinyprogramisty.Strategy.PayPalStrategy;

import static org.assertj.core.api.Assertions.assertThat;

public class PayPalStrategyTest {
    private PayPalStrategy payPalStrategy;
    private boolean result;


    @Before
    public void setUp() {
        payPalStrategy = new PayPalStrategy("test@test.com", "test", 150.0);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void paymentTest(){
        result = payPalStrategy.payment(10, "123");

        assertThat(result).isTrue();

        result = payPalStrategy.payment(150, "123");
        assertThat(result).isTrue();
    }

    @Test
    public void paymentWrongPriceTest(){
        result = payPalStrategy.payment(0, "123");
        assertThat(result).isFalse();

        result = payPalStrategy.payment(-100, "123");
        assertThat(result).isFalse();
    }

    @Test
    public void paymentNullValueTest(){
        thrown.expect(NullPointerException.class);

        payPalStrategy.payment(new Double(null), "123");
        payPalStrategy.payment(10, null);

    }

}