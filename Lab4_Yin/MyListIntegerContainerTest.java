import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyListIntegerContainerTest.
 *
 * @author  Yin Zheping
 * @version 0.114514
 */
public class MyListIntegerContainerTest
{
    /**
     * Default constructor for test class MyListIntegerContainerTest
     */
    public MyListIntegerContainerTest()
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
    public void addToBack_NullRoot()
    {
        MyListIntegerContainer myListIn1 = new MyListIntegerContainer();
        myListIn1.addToBack(1);
        assertEquals("1", myListIn1.toString());
    }
    
    @Test
    public void addToBack_1()
    {
        MyListIntegerContainer myListIn1 = new MyListIntegerContainer();
        myListIn1.addToBack(1);
        myListIn1.addToBack(112);
        myListIn1.addToBack(123);
        myListIn1.addToBack(233);
        myListIn1.addToBack(2);
        assertEquals("11121232332", myListIn1.toString());
    }
    
    @Test
    public void addToBack_2()
    {
        MyListIntegerContainer myListIn1 = new MyListIntegerContainer();
        myListIn1.addToBack(23);
        myListIn1.addToBack(456);
        myListIn1.addToBack(11);
        myListIn1.addToBack(22);
        assertEquals("234561122", myListIn1.toString());
    }
    @Test
    public void addToFront_NullRoot()
    {
        MyListIntegerContainer myListIn1 = new MyListIntegerContainer();
        myListIn1.addToFront(1);
        assertEquals("1", myListIn1.toString());
    }
    
    @Test
    public void addToFront_1()
    {
        MyListIntegerContainer myListIn1 = new MyListIntegerContainer();
        myListIn1.addToFront(1);
        myListIn1.addToFront(123);
        myListIn1.addToFront(1343);
        myListIn1.addToFront(145);
        assertEquals("14513431231", myListIn1.toString());
    }
    
    @Test
    public void addToFront_2()
    {
        MyListIntegerContainer myListIn1 = new MyListIntegerContainer();
        myListIn1.addToFront(1);
        myListIn1.addToFront(123);
        myListIn1.addToFront(1343);
        myListIn1.addToFront(145);
        myListIn1.addToFront(2);
        assertEquals("214513431231", myListIn1.toString());
    }
    
    @Test
    public void mixedAdd_1()
    {
        MyListIntegerContainer myListIn1 = new MyListIntegerContainer();
        myListIn1.addToFront(1);
        myListIn1.addToBack(456);
        myListIn1.addToBack(11);
        myListIn1.addToFront(123);
        myListIn1.addToBack(22);
        assertEquals("12314561122", myListIn1.toString());
    }
    @Test
    public void mixedAdd_2()
    {
        MyListIntegerContainer myListIn1 = new MyListIntegerContainer();
        myListIn1.addToFront(1);
        myListIn1.addToBack(11);
        myListIn1.addToFront(123);
        myListIn1.addToBack(22);
        assertEquals("12311122", myListIn1.toString());
    }
    @Test
    public void searchWithIteratorTest_NullRoot()
    {
        MyListIntegerContainer myListIn1 = new MyListIntegerContainer();
        assertEquals(-1, myListIn1.searchWithIterator(1));
    }
    @Test
    public void searchWithoutIteratorTest_NullRoot()
    {
        MyListIntegerContainer myListIn1 = new MyListIntegerContainer();
        assertEquals(-1, myListIn1.searchWithoutIterator(1));
    }
    @Test
    public void searchWithIteratorTest_1()
    {
        MyListIntegerContainer myListIn1 = new MyListIntegerContainer();
        myListIn1.addToFront(1);
        myListIn1.addToBack(11);
        myListIn1.addToFront(123);
        myListIn1.addToBack(22);
        assertEquals(1, myListIn1.searchWithIterator(1));
    }
    @Test
    public void searchWithIteratorTest_2()
    {
        MyListIntegerContainer myListIn1 = new MyListIntegerContainer();
        myListIn1.addToFront(12);
        myListIn1.addToBack(14);
        myListIn1.addToFront(123);
        myListIn1.addToBack(22);
        myListIn1.addToBack(3434);
        assertEquals(-1, myListIn1.searchWithIterator(10));
    }
    public void searchWithoutIteratorTest_1()
    {
        MyListIntegerContainer myListIn1 = new MyListIntegerContainer();
        myListIn1.addToBack(112);
        myListIn1.addToFront(2323);
        myListIn1.addToBack(233);
        myListIn1.addToBack(12);
        assertEquals(3, myListIn1.searchWithoutIterator(12));
    }
    
    public void searchWithoutIteratorTest_2()
    {
        MyListIntegerContainer myListIn1 = new MyListIntegerContainer();
        myListIn1.addToBack(112);
        myListIn1.addToFront(2323);
        myListIn1.addToBack(233);
        myListIn1.addToBack(12);
        assertEquals(0, myListIn1.searchWithoutIterator(2323));
    }
}



