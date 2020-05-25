

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CellTest.
 *
 * @author  Yin Zheping
 * @version 0.114514
 */
public class CellTest
{
    /**
     * Default constructor for test class CellTest
     */
    public CellTest()
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
    public void appendTest_1()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        Cell<Integer> cell1 = new Cell<Integer>(12323);
        cell1.append(23232);
        assertEquals("1232323232", cell1.toString());
    }
    
    @Test
    public void appendTest_2()
    {
        MyLinkedList<Integer> myLinked1 = new MyLinkedList<Integer>();
        Cell<Integer> cell1 = new Cell<Integer>(12323);
        cell1.append(23232);
        cell1.append(445566);
        cell1.append(10);
        assertEquals("123232323244556610", cell1.toString());
    }
}

