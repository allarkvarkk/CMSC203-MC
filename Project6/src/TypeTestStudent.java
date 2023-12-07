import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TypeTestStudent {
    private Type[] testTypes;
    @Before
    public void setUp() throws Exception {
        testTypes = new Type[]{Type.COFFEE, Type.SMOOTHIE, Type.ALCOHOL};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void values() {
       assertArrayEquals(testTypes, Type.values());

    }

    @Test
    public void valueOf() {
        assertEquals("COFFEE", Type.COFFEE.name());
        assertEquals("SMOOTHIE", Type.SMOOTHIE.name());
        assertEquals("ALCOHOL", Type.ALCOHOL.name());
    }
}