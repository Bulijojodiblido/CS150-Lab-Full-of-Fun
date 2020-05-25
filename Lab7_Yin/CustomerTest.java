

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CustomerTest.
 *
 * @author  Zeppelin
 * @version 0.114514
 */
public class CustomerTest
{
    /**
     * Default constructor for test class CustomerTest
     */
    public CustomerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void compareTest_1()
    {
        Customer customer1 = new Customer(1, 2, 3);
        assertEquals(-1, customer1.compareTo(new Customer(2,3,4)));
    }
    
    @Test
    public void compareTest_2()
    {
        Customer customer1 = new Customer(6, 2, 3);
        assertEquals(1, customer1.compareTo(new Customer(5,3,4)));
    }
    
    @Test
    public void compareTest_same()
    {
        Customer customer1 = new Customer(6, 2, 3);
        assertEquals(0, customer1.compareTo(new Customer(6,3,4)));
    }
    
}

