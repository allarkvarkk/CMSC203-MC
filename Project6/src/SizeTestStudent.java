import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SizeTestStudent {
    Size[] testSize;

    @Before
    public void setUp() throws Exception {
        testSize = new Size[]{Size.LARGE, Size.MEDIUM, Size.SMALL};
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void values() {
        assertArrayEquals(testSize, Size.values());
    }

    @Test
    public void valueOf() {
        assertEquals("LARGE", Size.LARGE.name());
        assertEquals("MEDIUM", Size.MEDIUM.name());
        assertEquals("SMALL", Size.SMALL.name());
    }
}