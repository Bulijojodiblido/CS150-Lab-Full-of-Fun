

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PairTest.
 *
 * @author  Yin Zheping
 * @version 0.114514
 */
public class PairTest
{
    /**
     * Default constructor for test class PairTest
     */
    public PairTest()
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
    public void constructorTest()
    {
        Pair<Integer,Integer> pair1 = new Pair<Integer,Integer>(0, 1);
        assertEquals("key: 0     value: 1", pair1.toString());
    }
    
    @Test
    public void constructorTest_1()
    {
        Pair<Integer,Integer> pair1 = new Pair<Integer,Integer>(0, 2);
        assertEquals("key: 0     value: 2", pair1.toString());
    } 
    @Test
    public void valueSetterTest()
    {
        Pair<Integer,Integer> pair1 = new Pair<Integer,Integer>(1, 1);
        pair1.valueSetter(33);
        assertEquals("key: 1     value: 33", pair1.toString());
    }
    
    @Test
    public void valueSetterTest_1()
    {
        Pair<Integer,Integer> pair1 = new Pair<Integer,Integer>(0, 4);
        pair1.valueSetter(3);
        assertEquals("key: 0     value: 3", pair1.toString());
    }
    @Test
    public void keySetterTest()
    {
        Pair<Integer,Integer> pair1 = new Pair<Integer,Integer>(0, 1);
        pair1.keySetter(3);
        assertEquals("key: 3     value: 1", pair1.toString());
    }
    @Test
    public void keySetterTest_1()
    {
        Pair<Integer,Integer> pair1 = new Pair<Integer,Integer>(23, 1);
        pair1.keySetter(53);
        assertEquals("key: 53     value: 1", pair1.toString());
    }

    @Test
    public void keyGetterTest()
    {
        Pair<Integer,Integer> pair1 = new Pair<Integer,Integer>(0, 1);
         assertEquals(new Integer(0), pair1.keyGetter());
    }
    
    @Test
    public void keyGetterTest_1()
    {
        Pair<Integer,Integer> pair1 = new Pair<Integer,Integer>(234, 1);
         assertEquals(new Integer(234), pair1.keyGetter());
    }
    
    @Test
    public void valueGetterTest()
    {
        Pair<Integer,Integer> pair1 = new Pair<Integer,Integer>(0, 1);
         assertEquals(new Integer(1), pair1.valueGetter());
    }
    
    @Test
    public void valueGetterTest_1()
    {
        Pair<Integer,Integer> pair1 = new Pair<Integer,Integer>(5, 11);
         assertEquals(new Integer(11), pair1.valueGetter());
    }
}


