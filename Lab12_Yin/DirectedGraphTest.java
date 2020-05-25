

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DirectedGraphTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DirectedGraphTest
{
    /**
     * Default constructor for test class DirectedGraphTest
     */
    public DirectedGraphTest()
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
        DirectedGraph<Integer> directed1 = new DirectedGraph<Integer>();
        assertEquals(true, directed1.addNode(23));
    }
    
    @Test
    public void addTest_2()
    {
        DirectedGraph<Integer> directed1 = new DirectedGraph<Integer>();
        assertEquals(true, directed1.addNode(24));
    }
    
    @Test
    public void addTest_duplicate()
    {
        DirectedGraph<Integer> directed1 = new DirectedGraph<Integer>();
        directed1.addNode(24);
        assertEquals(false, directed1.addNode(24));
    }
    
    @Test
    public void edgeTest_1()
    {
        DirectedGraph<Integer> directed1 = new DirectedGraph<Integer>();
        directed1.addNode(23);
        directed1.addNode(24);
        directed1.addEdge(23,24,2);
        assertEquals(2, directed1.getWeight(23,0));
    }
    
    @Test
    public void edgeTest_2()
    {
        DirectedGraph<Integer> directed1 = new DirectedGraph<Integer>();
        directed1.addNode(23);
        directed1.addNode(24);
        directed1.addEdge(23,24,4);
        assertEquals(4, directed1.getWeight(23,0));
    }
    
    @Test
    public void edgeTest_sameEdge()
    {
        DirectedGraph<Integer> directed1 = new DirectedGraph<Integer>();
        directed1.addNode(23);
        directed1.addNode(24);
        directed1.addEdge(23,24,2);
        directed1.addEdge(23,24,4);
        assertEquals(4, directed1.getWeight(23,0));
    }
    
    @Test
    public void edgeTest_notThere()
    {
        DirectedGraph<Integer> directed1 = new DirectedGraph<Integer>();
        directed1.addNode(23);
        directed1.addEdge(23,24,2);
        directed1.addEdge(23,24,4);
        assertEquals(0, (directed1.getEdges(23).size()));
    }
    
    @Test
    public void neighborTest_notThere()
    {
        DirectedGraph<Integer> directed1 = new DirectedGraph<Integer>();
        assertEquals(null, (directed1.getEdges(23)));
    }
    
    @Test
    public void neighborTest_1()
    {
        DirectedGraph<Integer> directed1 = new DirectedGraph<Integer>();
        directed1.addNode(23);
        directed1.addNode(24);
        directed1.addEdge(23,24,2);
        directed1.addEdge(23,24,4);
        assertEquals(1, (directed1.getEdges(23).size()));
    }
    
    @Test
    public void neighborTest_2()
    {
        DirectedGraph<Integer> directed1 = new DirectedGraph<Integer>();
        directed1.addNode(23);
        directed1.addNode(25);
        directed1.addNode(24);
        directed1.addEdge(23,24,2);
        directed1.addEdge(23,25,4);
        assertEquals(2, (directed1.getEdges(23).size()));
    }
}

