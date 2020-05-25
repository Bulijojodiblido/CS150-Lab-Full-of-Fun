

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CellTest.
 *
 * @author Yin Zheping
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
    public void appendTestWithNullNext()
    {
        Cell cell1 = new Cell(1);
        cell1.append(2);
        assertEquals("12", cell1.toString());
    }
    @Test
    public void appendTestWithNotNullNext_1()
    {
        Cell cell1 = new Cell(1);
        cell1.append(2);
        cell1.append(3);
        assertEquals("123", cell1.toString());
    }
    @Test
    public void appendTestWithNotNullNext_2()
    {
        Cell cell1 = new Cell(1);
        cell1.append(2);
        cell1.append(3);
        cell1.append(53);
        cell1.append(37);
        assertEquals("1235337", cell1.toString());
    }
    @Test
    public void constructorTest()
    {
        Cell cell1 = new Cell(1);
        assertEquals("1", cell1.toString());
    }
    @Test
    public void toStringWithNullNext()
    {
        Cell cell1 = new Cell(1);
        assertEquals("1", cell1.toString());
    }
    @Test
    public void toStringWithNotNullNext_1()
    {
        Cell cell1 = new Cell(1);
        cell1.append(2);
        assertEquals("12", cell1.toString());
    }
    @Test
    public void toStringWithNotNullNext_2()
    {
        Cell cell1 = new Cell(1);
        cell1.append(2);
        cell1.append(3);
        cell1.append(23);
        cell1.append(23);
        cell1.append(26);
        assertEquals("123232326", cell1.toString());
    }
    
}

