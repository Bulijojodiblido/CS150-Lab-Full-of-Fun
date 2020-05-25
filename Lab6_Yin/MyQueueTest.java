

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyQueueTest.
 *
 * @Yin Zheping
 * @0.114514
 */
public class MyQueueTest
{
    /**
     * Default constructor for test class MyQueueTest
     */
    public MyQueueTest()
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
    public void addTest_Empty()
    {
        MyQueue<Integer> myQueue1 = new MyQueue<Integer>();
        assertEquals(new Integer(12), myQueue1.add(12));
    }
    
    @Test
    public void addTest_1()
    {
        MyQueue<Integer> myQueue1 = new MyQueue<Integer>();
        myQueue1.add(13);
        myQueue1.add(12);
        assertEquals(new Integer(13), myQueue1.peek());
    }
    
    @Test
    public void addTest_2()
    {
        MyQueue<Integer> myQueue1 = new MyQueue<Integer>();
        myQueue1.add(13);
        myQueue1.add(12);
        myQueue1.add(156);
        assertEquals(new Integer(13), myQueue1.peek());
    }
    
    @Test
    public void peekTest_Empty()
    {
        MyQueue<Integer> myQueue1 = new MyQueue<Integer>();
        assertEquals(null, myQueue1.peek());
    }
    
    @Test
    public void peekTest_1()
    {
        MyQueue<Integer> myQueue1 = new MyQueue<Integer>();
        myQueue1.add(13);
        myQueue1.add(12);
        assertEquals(new Integer(13), myQueue1.peek());
    }
    
    @Test
    public void peekTest_2()
    {
        MyQueue<Integer> myQueue1 = new MyQueue<Integer>();
        myQueue1.add(13);
        myQueue1.add(12);
        myQueue1.add(156);
        assertEquals(new Integer(13), myQueue1.peek());
    }
    
    @Test
    public void removeTest_Empty()
    {
        MyQueue<Integer> myQueue1 = new MyQueue<Integer>();
        assertEquals(null, myQueue1.remove());
    }
    
    @Test
    public void removeTest_1()
    {
        MyQueue<Integer> myQueue1 = new MyQueue<Integer>();
        myQueue1.add(13);
        myQueue1.add(12);
        assertEquals(new Integer(13), myQueue1.remove());
    }
    
    @Test
    public void removeTest_2()
    {
        MyQueue<Integer> myQueue1 = new MyQueue<Integer>();
        myQueue1.add(13);
        myQueue1.add(12);
        myQueue1.add(156);
        assertEquals(new Integer(13), myQueue1.remove());
    }
}

