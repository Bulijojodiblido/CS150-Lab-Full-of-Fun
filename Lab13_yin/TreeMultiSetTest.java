

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TreeMultiSetTest.
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class TreeMultiSetTest
{
    /**
     * Default constructor for test class TreeMultiSetTest
     */
    public TreeMultiSetTest()
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
    public void addTest_1()
    {
        TreeMultiSet<String> treeMult1 = new TreeMultiSet<String>();
        treeMult1.add("a");
        treeMult1.add("a");
        String[] a=new String[2];
        String[] b ={"a","a"};
        treeMult1.toArray(a);
        assertEquals(a,b);
    }
    
    @Test
    public void addTest_2()
    {
        TreeMultiSet<String> treeMult1 = new TreeMultiSet<String>();
        treeMult1.add("b");
        treeMult1.add("a");
        treeMult1.add("a");
        String[] a=new String[3];
        String[] b ={"a","a","b"};
        treeMult1.toArray(a);
        assertEquals(a,b);
    }
    
    @Test
    public void containTest_1()
    {
        TreeMultiSet<String> treeMult1 = new TreeMultiSet<String>();
        treeMult1.add("a");
        treeMult1.add("a");
        assertEquals(true,treeMult1.contains("a"));
    }
    
    @Test
    public void containTest_2()
    {
        TreeMultiSet<String> treeMult1 = new TreeMultiSet<String>();
        treeMult1.add("a");
        treeMult1.add("a");
        assertEquals(false,treeMult1.contains("b"));
    }
    
    @Test
    public void remove1Test_1()
    {
        TreeMultiSet<String> treeMult1 = new TreeMultiSet<String>();
        treeMult1.add("a");
        treeMult1.add("a");
        treeMult1.removeOne("a");
        String[] a=new String[1];
        String[] b ={"a"};
        treeMult1.toArray(a);
        assertEquals(a,b);
    }
    
    @Test
    public void remove1Test_2()
    {
        TreeMultiSet<String> treeMult1 = new TreeMultiSet<String>();
        treeMult1.add("b");
        treeMult1.add("a");
        treeMult1.add("a");
        treeMult1.removeOne("b");
        String[] a=new String[2];
        String[] b ={"a","a"};
        treeMult1.toArray(a);
        assertEquals(a,b);
    }
    @Test
    public void remove1Test_empty()
    {
        TreeMultiSet<String> treeMult1 = new TreeMultiSet<String>();
        treeMult1.add("a");
        treeMult1.add("a");
        assertEquals(false,treeMult1.removeOne("b"));
    }
    @Test
    public void removeAllTest_1()
    {
        TreeMultiSet<String> treeMult1 = new TreeMultiSet<String>();
        treeMult1.add("a");
        treeMult1.add("a");
        treeMult1.removeAll("a");
        String[] a=new String[0];
        String[] b ={};
        treeMult1.toArray(a);
        assertEquals(a,b);
    }
    
    @Test
    public void removeAllTest_2()
    {
        TreeMultiSet<String> treeMult1 = new TreeMultiSet<String>();
        treeMult1.add("b");
        treeMult1.add("b");
        treeMult1.add("a");
        treeMult1.add("a");
        treeMult1.removeAll("b");
        String[] a=new String[2];
        String[] b ={"a","a"};
        treeMult1.toArray(a);
        assertEquals(a,b);
    }
    @Test
    public void removeAllTest_empty()
    {
        TreeMultiSet<String> treeMult1 = new TreeMultiSet<String>();
        treeMult1.add("a");
        treeMult1.add("a");
        assertEquals(false,treeMult1.removeAll("b"));
    }
}

