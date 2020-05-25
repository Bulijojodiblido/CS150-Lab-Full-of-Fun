

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RandomIntegerContainerTest.
 *
 * Yin Zheping
 * @version (a version number or a date)
 */
public class RandomIntegerContainerTest
{
    /**
     * Default constructor for test class RandomIntegerContainerTest
     */
    public RandomIntegerContainerTest()
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
    public void addToFrontTest_WithNoValue()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addToFront(1);
        assertArrayEquals(new int[] {1}, randomIn1.toArray());
    }
    @Test
    public void addToFrontTest_WithValues_1()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addToFront(1);
        randomIn1.addToFront(2);
        assertArrayEquals(new int[] {2,1}, randomIn1.toArray());
    }
    @Test
    public void addToFrontTest_WithValues_2()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addToFront(1);
        randomIn1.addToFront(2);
        randomIn1.addToFront(2);
        assertArrayEquals(new int[] {2,2,1}, randomIn1.toArray());
    }
    @Test
    public void addToBackTest_WithNoValue()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addToBack(1);
        assertArrayEquals(new int[] {1}, randomIn1.toArray());
    }
    @Test
    public void addToBackTest_WithValues_1()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addToBack(1);
        randomIn1.addToBack(2);
        assertArrayEquals(new int[] {1,2}, randomIn1.toArray());
    }
    @Test
    public void addToBackTest_WithValues_2()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addToBack(1);
        randomIn1.addToBack(2);
        randomIn1.addToBack(5);
        assertArrayEquals(new int[] {1,2,5}, randomIn1.toArray());
    }
    @Test
    public void addSortedTest_WithNoValue()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addSorted(1);
        assertArrayEquals(new int[] {1}, randomIn1.toArray());
    }
    @Test
    public void addSortedTest_WithOneValue_AddBigger()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addSorted(1);
        randomIn1.addSorted(2);
        assertArrayEquals(new int[] {1,2}, randomIn1.toArray());
    }
    @Test
    public void addSortedTest_WithOneValue_AddSmaller()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addSorted(1);
        randomIn1.addSorted(-1);
        assertArrayEquals(new int[] {-1,1}, randomIn1.toArray());
    }
    @Test
    public void addSortedTest_WithOneValue_AddSame()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addSorted(1);
        randomIn1.addSorted(1);
        assertArrayEquals(new int[] {1,1}, randomIn1.toArray());
    }
    @Test
    public void addSortedTest_WithValues_AtFront()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addSorted(1);
        randomIn1.addSorted(2);
        randomIn1.addSorted(5);
        randomIn1.addSorted(0);
        assertArrayEquals(new int[] {0,1,2,5}, randomIn1.toArray());
    }
    @Test
    public void addSortedTest_WithValues_AtBack()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addSorted(1);
        randomIn1.addSorted(2);
        randomIn1.addSorted(5);
        randomIn1.addSorted(6);
        assertArrayEquals(new int[] {1,2,5,6}, randomIn1.toArray());
    }
    @Test
    public void addSortedTest_WithValues_AtMiddle_1()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addSorted(1);
        randomIn1.addSorted(2);
        randomIn1.addSorted(5);
        randomIn1.addSorted(3);
        assertArrayEquals(new int[] {1,2,3,5}, randomIn1.toArray());
    }
    public void addSortedTest_WithValues_AtMiddle_2()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addSorted(1);
        randomIn1.addSorted(2);
        randomIn1.addSorted(5);
        randomIn1.addSorted(4);
        assertArrayEquals(new int[] {1,2,3,5}, randomIn1.toArray());
    }
    @Test
    public void productSortedTest_WithValues_AtBack()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addSorted(1);
        randomIn1.addSorted(2);
        randomIn1.addSorted(5);
        randomIn1.productSorted(6);
        assertArrayEquals(new int[] {2,5,6}, randomIn1.toArray());
    }
    @Test
    public void productSortedTest_WithValues_AtFront()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addSorted(1);
        randomIn1.addSorted(2);
        randomIn1.addSorted(5);
        randomIn1.productSorted(0);
        assertArrayEquals(new int[] {0,2,5}, randomIn1.toArray());
    }
    @Test
    public void productSortedTest_WithValues_AtMiddle_1()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addSorted(1);
        randomIn1.addSorted(2);
        randomIn1.addSorted(5);
        randomIn1.productSorted(3);
        assertArrayEquals(new int[] {2,3,5}, randomIn1.toArray());
    }
    @Test
    public void productSortedTest_WithValues_AtMiddle_2()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addSorted(1);
        randomIn1.addSorted(2);
        randomIn1.addSorted(5);
        randomIn1.productSorted(4);
        assertArrayEquals(new int[] {2,4,5}, randomIn1.toArray());
    }
    @Test
    public void productSortedTest_WithNoValue_ShouldStillBeEmpty()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.productSorted(3);
        assertArrayEquals(new int[] {}, randomIn1.toArray());
    }
    @Test
    public void productSortedTest_WithOneValue()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addToFront(2);
        randomIn1.productSorted(3);
        assertArrayEquals(new int[] {6}, randomIn1.toArray());
    }
    @Test
    public void selectionSort_WithNoValue()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.selectionSort();
        assertArrayEquals(new int[] {}, randomIn1.toArray());
    }
    @Test
    public void selectionSort_WithOneValue()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addToFront(1);
        randomIn1.selectionSort();
        assertArrayEquals(new int[] {1}, randomIn1.toArray());
    }
    @Test
    public void selectionSort_WithManyValue_1()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addToFront(1);
        randomIn1.addToFront(10);
        randomIn1.addToFront(5);
        randomIn1.addToFront(4);
        randomIn1.selectionSort();
        assertArrayEquals(new int[] {1,4,5,10}, randomIn1.toArray());
    }
    @Test
    public void selectionSort_WithManyValue_2()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addToFront(1);
        randomIn1.addToFront(10);
        randomIn1.addToFront(5);
        randomIn1.addToFront(6);
        randomIn1.addToFront(4);
        randomIn1.selectionSort();
        assertArrayEquals(new int[] {1,4,5,6,10}, randomIn1.toArray());
    }
    @Test
    public void selectionSort_WithSameValues()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addToFront(1);
        randomIn1.addToFront(1);
        randomIn1.addToFront(1);
        randomIn1.addToFront(1);
        randomIn1.addToFront(1);
        randomIn1.selectionSort();
        assertArrayEquals(new int[] {1,1,1,1,1}, randomIn1.toArray());
    }
    @Test
    public void selectionSort_SortedValues()
    {
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        randomIn1.addToFront(10000);
        randomIn1.addToFront(1000);
        randomIn1.addToFront(100);
        randomIn1.addToFront(10);
        randomIn1.addToFront(1);
        randomIn1.selectionSort();
        assertArrayEquals(new int[] {1,10,100,1000,10000}, randomIn1.toArray());
    }
}






