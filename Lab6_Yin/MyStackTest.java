

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyStackTest.
 *
 * @Yin Zheping
 * @0.114514
 */
public class MyStackTest
{
    /**
     * Default constructor for test class MyStackTest
     */
    public MyStackTest()
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
    public void popTest_Empty()
    {
        MyStack<Integer> myStack1 = new MyStack<Integer>();
        assertEquals(null, myStack1.pop());
    }
    
    @Test
    public void popTest_1()
    {
        MyStack<Integer> myStack1 = new MyStack<Integer>();
        myStack1.push(12);
        myStack1.push(13);
        assertEquals(new Integer(13), myStack1.pop());
    }
    
    @Test
    public void popTest_2()
    {
        MyStack<Integer> myStack1 = new MyStack<Integer>();
        myStack1.push(12);
        myStack1.push(13);
        myStack1.push(14);
        assertEquals(new Integer(14), myStack1.pop());
    }

    @Test
    public void pushTest_Empty()
    {
        MyStack<Integer> myStack1 = new MyStack<Integer>();
        assertEquals(new Integer(12), myStack1.push(12));
    }

    @Test
    public void pushTest_1()
    {
        MyStack<Integer> myStack1 = new MyStack<Integer>();
        myStack1.push(12);
        myStack1.push(13);
        assertEquals(0, myStack1.search(13));
    }
    
    @Test
    public void pushTest_2()
    {
        MyStack<Integer> myStack1 = new MyStack<Integer>();
        myStack1.push(12);
        myStack1.push(13);
        myStack1.push(14);
        assertEquals(0, myStack1.search(14));
    }

    @Test
    public void emptyTest_1()
    {
        MyStack<Integer> myStack1 = new MyStack<Integer>();
        assertEquals(true, myStack1.empty());
    }

    @Test
    public void emptyTest_2()
    {
        MyStack<Integer> myStack1 = new MyStack<Integer>();
        myStack1.push(12);
        assertEquals(false, myStack1.empty());
    }
    
    @Test
    public void searchTest_1()
    {
        MyStack<Integer> myStack1 = new MyStack<Integer>();
        myStack1.push(12);
        myStack1.push(13);
        assertEquals(0, myStack1.search(13));
    }
    
    @Test
    public void searchTest_2()
    {
        MyStack<Integer> myStack1 = new MyStack<Integer>();
        myStack1.push(12);
        myStack1.push(13);
        myStack1.push(14);
        assertEquals(0, myStack1.search(14));
    }
}





