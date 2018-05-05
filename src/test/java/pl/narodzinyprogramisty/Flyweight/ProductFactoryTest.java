package pl.narodzinyprogramisty.Flyweight;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductFactoryTest {
    private ProductFactory productFactory;

    @Before
    public void setUp() {
        productFactory = new ProductFactory();
    }

    @Test
    public void produceTest() {
        for (int i = 0; i < 100; i++) {
            productFactory.produce("Bread", 2.99F);
        }
        int size = productFactory.getListSize();
        assertEquals(1, size);
    }
}