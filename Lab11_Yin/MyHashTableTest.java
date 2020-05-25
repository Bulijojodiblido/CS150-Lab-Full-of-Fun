

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyHashTableTest.
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class MyHashTableTest
{
    /**
     * Default constructor for test class MyHashTableTest
     */
    public MyHashTableTest()
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
    public void insertTest()
    {
        MyHashTable h = new MyHashTable(10);
        h.insert(new Student("233"));
        assertEquals(h.insert(new Student("233")), false);
    }
    @Test
    public void insertTest2()
    {
        MyHashTable h = new MyHashTable(10);
        h.insert(new Student("233"));
        assertEquals(h.insert(new Student("232")), true);
    }
    
    @Test
    public void getTest()
    {
        MyHashTable h = new MyHashTable(10);
        h.insert(new Student("233"));
        assertEquals(h.get("233").equals(new Student("233")), true);
    }
    @Test
    public void getTest2()
    {
        MyHashTable h = new MyHashTable(10);
        h.insert(new Student("233"));
        assertEquals(h.get("232"), null);
    }
    
    @Test
    public void pollTest()
    {
        MyHashTable h = new MyHashTable(10);
        h.insert(new Student("233"));
        assertEquals(h.poll("233").equals(new Student("233")), true);
    }
    @Test
    public void pollTest3()
    {
        MyHashTable h = new MyHashTable(10);
        h.insert(new Student("233"));
        h.poll("233");
        assertEquals(h.poll("233"),null);
    }
    @Test
    public void pollTest2()
    {
        MyHashTable h = new MyHashTable(10);
        h.insert(new Student("233"));
        assertEquals(h.poll("232"), null);
    }
}
