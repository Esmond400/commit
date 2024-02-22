package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.Before;




public class MathUtilsTest {
	 @Before
	    public void setUp() {
	        new MathUtils();
	    }

	    @After
	    public void tearDown() {
	    }
	    

    @Test
    public void testAdd() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(15, mathUtils.add(12, 3));
        assertEquals(1, mathUtils.add(-4, 5));
        assertEquals(16, mathUtils.add(8, 8));
    }

    @Test
    public void testSubtract() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(3, mathUtils.subtract(6, 3));
        assertEquals(4, mathUtils.subtract(5, 1));
        assertEquals(0, mathUtils.subtract(8, -8));
    }

    @Test
    public void testMultiply() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(16, mathUtils.multiply(4, 4));
        assertEquals(-9, mathUtils.multiply(-3, 3));
        assertEquals(0, mathUtils.multiply(9, 0));
    }

    @Test
    public void testDivide() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(2.0, mathUtils.divide(4, 2), 0.0001);
        assertEquals(-2.0, mathUtils.divide(6, -3), 0.0001);
        assertEquals(0.0, mathUtils.divide(0, 6), 0.0001);
        assertEquals(-1.0, mathUtils.divide(6, 0), 0.0001); // Division by zero
    }
}