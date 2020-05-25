

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
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
    public void hashTest()
    {
        Student student1 = new Student("A1");
        assertEquals(new String("A1").hashCode(), student1.hashCode());
    }
    
    @Test
    public void hashTest2()
    {
        Student student1 = new Student("2323114514");
        assertEquals(new String("2323114514").hashCode(), student1.hashCode());
    }
    
    @Test
    public void equalTest()
    {
        Student student1 = new Student("2323114514");
        assertEquals(student1.equals(new Student("Ah","Ah","2323114514"))
        , true);
    }
    @Test
    public void equalTest1()
    {
        Student student1 = new Student("Ah","Ah","2323114514");
        assertEquals(student1.equals(new Student("Ah","Ah","214514"))
        , false);
    }
}

