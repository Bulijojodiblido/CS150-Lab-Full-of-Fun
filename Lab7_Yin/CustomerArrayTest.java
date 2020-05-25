

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CustomerArrayTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CustomerArrayTest
{
    /**
     * Default constructor for test class CustomerArrayTest
     */
    public CustomerArrayTest()
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
    public void addTest_1()
    {
        CustomerArray customer1 = new CustomerArray(25);
        assertEquals(true, customer1.add(new Customer(1,2,3)));
    }
    
    @Test
    public void addTest_2()
    {
        CustomerArray customer1 = new CustomerArray(25);
        customer1.add(new Customer(1,2,3));
        assertEquals(customer1.pop().compareTo((new Customer(1,2,3))),0 );
    }
    @Test
    public void addTest_SameLoc()
    {
        CustomerArray customer1 = new CustomerArray(25);
        customer1.add(new Customer(1,2,3));
        customer1.add(new Customer(1,2,2));
        customer1.pop();
        assertEquals(customer1.pop().compareTo((new Customer(1,2,2))),0 );
    }
    
    @Test
    public void addTest_Null()
    {
        CustomerArray customer1 = new CustomerArray(25);
        assertEquals(customer1.add(null),false );
    }
    
    @Test
    public void addTest_3()
    {
        CustomerArray customer1 = new CustomerArray(25);
        customer1.add(new Customer(1,2,3));
        customer1.add(new Customer(0,2,3));
        assertEquals(customer1.pop().compareTo((new Customer(0,2,3))),0 );
    }

    @Test
    public void emptyTest_1()
    {
        CustomerArray customer1 = new CustomerArray(23);
        assertEquals(true, customer1.isEmpty());
    }
    
    @Test
    public void emptyTest_2()
    {
        CustomerArray customer1 = new CustomerArray(23);
        customer1.add(new Customer(1,2,3));
        assertEquals(false, customer1.isEmpty());
    }

    @Test
    public void popTest_null()
    {
        CustomerArray customer1 = new CustomerArray(12);
        assertEquals(null, customer1.pop());
    }
    
    @Test
    public void popTest_1()
    {
        CustomerArray customer1 = new CustomerArray(12);
        customer1.add(new Customer(1,2,3));
        assertEquals(customer1.pop().compareTo((new Customer(1,2,3))),0 );
    }
    @Test
    public void popTest_2()
    {
        CustomerArray customer1 = new CustomerArray(12);
        customer1.add(new Customer(1,2,3));
        customer1.add(new Customer(0,2,3));
        assertEquals(customer1.pop().compareTo((new Customer(0,2,3))),0 );
    }
    
    @Test
    public void popTest_Entire()
    {
        CustomerArray customer1 = new CustomerArray(12);
        customer1.add(new Customer(1,2,3));
        customer1.add(new Customer(1,2,3));
        customer1.add(new Customer(0,2,3));
        customer1.pop();
        customer1.pop();
        customer1.pop();
        assertEquals(customer1.pop(),null );
    }
}



