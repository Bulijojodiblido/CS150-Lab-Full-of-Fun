

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyLinkedListTest.
 *
 * @author  Yin Zheping
 * @version 0.114514
 */
public class MyLinkedListTest
{
    /**
     * Default constructor for test class MyLinkedListTest
     */
    public MyLinkedListTest()
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
    public void addFirstTest_NullRoot()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        myLinked1.addFirst(12);
        assertEquals("12", myLinked1.toString());
    }
    @Test
    public void addEndTest_NullRoot()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        myLinked1.addEnd(12);
        assertEquals("12", myLinked1.toString());
    }
    @Test
    public void addFirstTest_1()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        myLinked1.addFirst(12);
        myLinked1.addFirst(23);
        myLinked1.addFirst(45);
        myLinked1.addFirst(233);
        assertEquals("233452312", myLinked1.toString());
    }
    @Test
    public void addFirstTest_2()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        myLinked1.addFirst(67);
        myLinked1.addFirst(1234);
        myLinked1.addFirst(6565);
        assertEquals("6565123467", myLinked1.toString());
    }
    @Test
    public void addEndTest_1()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        myLinked1.addEnd(12);
        myLinked1.addEnd(23);
        myLinked1.addEnd(45);
        myLinked1.addEnd(233);
        assertEquals("122345233", myLinked1.toString());
    }
    @Test
    public void addEndTest_2()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        myLinked1.addEnd(67);
        myLinked1.addEnd(1234);
        myLinked1.addEnd(6565);
        assertEquals("6712346565", myLinked1.toString());
    }

    @Test
    public void getTest_1()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        myLinked1.addFirst(12);
        assertEquals(new Integer(12), (Integer)(myLinked1.get(0)));
    }
    @Test
    public void getTest_2()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        myLinked1.addFirst(12);
        myLinked1.addEnd(67);
        myLinked1.addEnd(1234);
        myLinked1.addEnd(6565);
        assertEquals(new Integer(6565), (Integer)(myLinked1.get(3)));
    }
    
    @Test
    public void getHeadTest_1()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        myLinked1.addFirst(12);
        assertEquals(new Integer(12), (Integer)(myLinked1.getHead().val));
    }
    @Test
    public void getHeadTest_2()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        myLinked1.addFirst(12);
        myLinked1.addEnd(67);
        myLinked1.addEnd(1234);
        myLinked1.addEnd(6565);
        assertEquals(new Integer(12), (Integer)(myLinked1.getHead().val));
    }
    @Test
    public void getTailTest_1()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        myLinked1.addFirst(12);
        assertEquals(new Integer(12), (Integer)(myLinked1.getTail().val));
    }
    @Test
    public void getTailTest_2()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        myLinked1.addFirst(12);
        myLinked1.addEnd(67);
        myLinked1.addEnd(1234);
        myLinked1.addEnd(6565);
        assertEquals(new Integer(6565), (Integer)(myLinked1.getTail().val));
    }
    
    @Test
    public void getSizeTest_1()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        myLinked1.addFirst(12);
        assertEquals(1, myLinked1.getSize());
    }
    @Test
    public void getSizeTest_2()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        myLinked1.addFirst(12);
        myLinked1.addEnd(67);
        myLinked1.addEnd(1234);
        myLinked1.addEnd(6565);
        assertEquals(4, myLinked1.getSize());
    }
    @Test
    public void isEmptyTest_1()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        myLinked1.addFirst(12);
        myLinked1.addEnd(67);
        myLinked1.addEnd(1234);
        myLinked1.addEnd(6565);
        assertEquals(false, myLinked1.isEmpty());
    }
    @Test
    public void isEmptyTest_2()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        assertEquals(true, myLinked1.isEmpty());
    }
}


