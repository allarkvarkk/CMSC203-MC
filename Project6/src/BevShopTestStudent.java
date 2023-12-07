import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BevShopTestStudent {
    private BevShop bevShop;

    @Before
    public void setUp() {
        bevShop = new BevShop();
    }

    @Test
    public void testIsValidTime() {
        assertTrue(bevShop.isValidTime(9));
        assertTrue(bevShop.isValidTime(22));
        assertFalse(bevShop.isValidTime(7));
        assertFalse(bevShop.isValidTime(23));
    }

    @Test
    public void testGetMaxNumOfFruits() {
        assertEquals(5, bevShop.getMaxNumOfFruits());
    }

    @Test
    public void testGetMinAgeForAlcohol() {
        assertEquals(21, bevShop.getMinAgeForAlcohol());
    }

    @Test
    public void testIsMaxFruit() {
        assertTrue(bevShop.isMaxFruit(6));
        assertFalse(bevShop.isMaxFruit(3));
    }

    @Test
    public void testGetMaxOrderForAlcohol() {
        assertEquals(3, bevShop.getMaxOrderForAlcohol());
    }


    @Test
    public void testTotalMonthlySale() {
        assertEquals(0, bevShop.totalMonthlySale(), 0.001);

    }
}