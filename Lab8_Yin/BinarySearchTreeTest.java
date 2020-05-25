

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BinarySearchTreeTest.
 * @author  Zeppelin
 * @version 0.114514
 */
public class BinarySearchTreeTest
{
    /**
     * Default constructor for test class BinarySearchTreeTest
     */
    public BinarySearchTreeTest()
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
    public void insert_null()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        assertEquals(false, binarySe1.insert(null));
    }

    @Test
    public void insert_1()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(1));
        assertEquals(true, binarySe1.insert(new Integer(2)));
    }
    @Test
    public void insert_2()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(1));
        binarySe1.insert(new Integer(3));
        assertEquals(true, binarySe1.insert(new Integer(2)));
    }
    
    @Test
    public void contains_null()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        assertEquals(false, binarySe1.contains(null));
    }

    @Test
    public void contains_1()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(1));
        assertEquals(true, binarySe1.contains(new Integer(1)));
    }
    @Test
    public void contains_2()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(1));
        binarySe1.insert(new Integer(3));
        assertEquals(true, binarySe1.contains(new Integer(3)));
    }
    @Test
    public void contains_notIn()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(1));
        binarySe1.insert(new Integer(3));
        assertEquals(false, binarySe1.contains(new Integer(2)));
    }
    //Duplicate cannot be tested because it throws an error
    
    @Test
    public void findMax_null()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        assertEquals(null, binarySe1.findMax());
    }

    @Test
    public void findMax_1()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(1));
        binarySe1.insert(new Integer(2));
        assertEquals(new Integer(2),binarySe1.findMax() );
    }
    @Test
    public void findMax_2()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(1));
        binarySe1.insert(new Integer(2));
        binarySe1.insert(new Integer(3));
        assertEquals(new Integer(3),binarySe1.findMax() );
    }
    @Test
    public void findMin_null()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        assertEquals(null, binarySe1.findMin());
    }

    @Test
    public void findMin_1()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(1));
        binarySe1.insert(new Integer(2));
        assertEquals(new Integer(1),binarySe1.findMin() );
    }
    @Test
    public void findMin_2()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(1));
        binarySe1.insert(new Integer(2));
        binarySe1.insert(new Integer(3));
        assertEquals(new Integer(1),binarySe1.findMin() );
    }
    @Test
    public void inOrder_null()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        assertEquals("", binarySe1.inOrderString());
    }

    @Test
    public void inOrder_1()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(1));
        binarySe1.insert(new Integer(2));
        assertEquals("12",binarySe1.inOrderString());
    }
    @Test
    public void inOrder_2()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(1));
        binarySe1.insert(new Integer(2));
        binarySe1.insert(new Integer(3));
        assertEquals("123",binarySe1.inOrderString());
    }
    
    @Test
    public void preOrder_null()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        assertEquals("", binarySe1.preOrderString());
    }

    @Test
    public void preOrder_1()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(1));
        binarySe1.insert(new Integer(2));
        assertEquals("12",binarySe1.preOrderString());
    }
    @Test
    public void preOrder_2()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(1));
        binarySe1.insert(new Integer(2));
        binarySe1.insert(new Integer(3));
        assertEquals("123",binarySe1.preOrderString());
    }
    @Test
    public void postOrder_null()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        assertEquals("", binarySe1.postOrderString());
    }

    @Test
    public void postOrder_1()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(1));
        binarySe1.insert(new Integer(2));
        assertEquals("21",binarySe1.postOrderString());
    }
    @Test
    public void postOrder_2()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(1));
        binarySe1.insert(new Integer(2));
        binarySe1.insert(new Integer(3));
        assertEquals("321",binarySe1.postOrderString());
    }
    
    @Test
    public void numOfElementsDepth_null()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        assertEquals(0, binarySe1.numOfElementsDepth(2));
    }

    @Test
    public void numOfElementsDepth_1()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(1));
        binarySe1.insert(new Integer(2));
        assertEquals(1,binarySe1.numOfElementsDepth(1));
    }
    @Test
    public void numOfElementsDepth_2()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(2));
        binarySe1.insert(new Integer(1));
        binarySe1.insert(new Integer(4));
        assertEquals(2,binarySe1.numOfElementsDepth(1));
    }
    
    @Test
    public void emptyTest()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(2));
        binarySe1.insert(new Integer(1));
        binarySe1.insert(new Integer(4));
        binarySe1.empty();
        assertEquals(true,binarySe1.isEmpty());
    }
    
    @Test
    public void emptyTest_null()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.empty();
        assertEquals(true,binarySe1.isEmpty());
    }
    
    @Test
    public void isEmptyTest_1()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        binarySe1.insert(new Integer(2));
        binarySe1.insert(new Integer(1));
        binarySe1.insert(new Integer(4));
        assertEquals(false,binarySe1.isEmpty());
    }
    
    @Test
    public void isemptyTest_null()
    {
        BinarySearchTree<Integer> binarySe1 = new BinarySearchTree<Integer>();
        assertEquals(true,binarySe1.isEmpty());
    }
}


