
import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CustomerQueueTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CustomerQueueTest
{
    /**
     * Default constructor for test class CustomerQueueTest
     */
    public CustomerQueueTest()
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
    public void constructorTest(){
        ArrayList<Customer> a = new ArrayList<Customer>();
        a.add(new Customer(5,1,1));
        a.add(new Customer(1,1,1));
        a.add(new Customer(1,1,1));
        a.add(new Customer(1,1,1));
        CustomerQueue c=new CustomerQueue(a);
        c.pop();
        c.pop();
        c.pop();
        assertEquals(c.pop().compareTo((new Customer(5,1,1))),0 );
    }
    
    @Test
    public void addTest_Null()
    {
        CustomerQueue customer1 = new CustomerQueue();
        assertEquals(customer1.add(null),false );
    }
    
    @Test
    public void addTest_1()
    {
        CustomerQueue customer1 = new CustomerQueue();
        assertEquals(true, customer1.add(new Customer(1,2,3)));
    }
    
    @Test
    public void addTest_2()
    {
        CustomerQueue customer1 = new CustomerQueue();
        customer1.add(new Customer(1,2,3));
        assertEquals(customer1.pop().compareTo((new Customer(1,2,3))),0 );
    }
    
    
    @Test
    public void addTest_3()
    {
        CustomerQueue customer1 = new CustomerQueue();
        customer1.add(new Customer(1,2,3));
        customer1.add(new Customer(0,2,3));
        assertEquals(customer1.pop().compareTo((new Customer(0,2,3))),0 );
    }

    @Test
    public void emptyTest_1()
    {
        CustomerQueue customer1 = new CustomerQueue();
        assertEquals(true, customer1.isEmpty());
    }
    
    @Test
    public void emptyTest_2()
    {
        CustomerQueue customer1 = new CustomerQueue();
        customer1.add(new Customer(1,2,3));
        assertEquals(false, customer1.isEmpty());
    }

    @Test
    public void popTest_null()
    {
        CustomerQueue customer1 = new CustomerQueue();
        assertEquals(null, customer1.pop());
    }
    
    @Test
    public void popTest_1()
    {
        CustomerQueue customer1 = new CustomerQueue();
        customer1.add(new Customer(1,2,3));
        assertEquals(customer1.pop().compareTo((new Customer(1,2,3))),0 );
    }
    @Test
    public void popTest_2()
    {
        CustomerQueue customer1 = new CustomerQueue();
        customer1.add(new Customer(1,2,3));
        customer1.add(new Customer(0,2,3));
        assertEquals(customer1.pop().compareTo((new Customer(0,2,3))),0 );
    }
}
