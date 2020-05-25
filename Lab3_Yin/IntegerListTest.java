

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class IntegerListTest.
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class IntegerListTest
{
    /**
     * Default constructor for test class IntegerListTest
     */
    public IntegerListTest()
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
    public void appendTestWithNullRoot()
    {
        IntegerList integerL1 = new IntegerList();
        integerL1.append(1);
        assertEquals("1", integerL1.toString());
    }
    @Test
    public void appendTest_1()
    {
        IntegerList integerL1 = new IntegerList();
        integerL1.append(1);
        integerL1.append(15);
        integerL1.append(23);
        assertEquals("11523", integerL1.toString());
    }
    @Test
    public void appendTest_2()
    {
        IntegerList integerL1 = new IntegerList();
        integerL1.append(12);
        integerL1.append(15);
        integerL1.append(23);
        integerL1.append(233);
        assertEquals("121523233", integerL1.toString());
    }
    @Test
    public void toStringTestWithNullRoot()
    {
        IntegerList integerL1 = new IntegerList();
        assertEquals("", integerL1.toString());
    }
    @Test
    public void toStringTes_1()
    {
        IntegerList integerL1 = new IntegerList();
        integerL1.append(12);
        integerL1.append(15);
        integerL1.append(23);
        integerL1.append(233);
        assertEquals("121523233", integerL1.toString());
    }
    @Test
    public void toStringTes_2()
    {
        IntegerList integerL1 = new IntegerList();
        integerL1.append(1);
        integerL1.append(15);
        integerL1.append(23);
        assertEquals("11523", integerL1.toString());
    }
    @Test
    public void isEmptyTestWithNullRoot(){
        IntegerList integerL1 = new IntegerList();
        assertEquals(true, integerL1.isEmpty());
    }
    @Test
    public void isEmptyTestWithNotNullRoot(){
        IntegerList integerL1 = new IntegerList();
        integerL1.append(1);
        integerL1.append(15);
        integerL1.append(23);
        assertEquals(false, integerL1.isEmpty());
    }
}

