
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyArrayListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyArrayListTest
{
    /**
     * Default constructor for test class MyArrayListTest
     */
    public MyArrayListTest()
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
    public void quickSortTest(){
        MyArrayList a1 = new MyArrayList();
        for(int i =0; i<5; i++){
            a1.add(new Pair(new Integer(i), new Integer(5-i)));
        }
        boolean a = true;
        a1.quicksort(a1);
        for(int i =0; i<5; i++){
            if(new Integer(i+1).compareTo((Integer)a1.get(i).valueGetter())!=0){
                a=false;
                break;
            }
        }
        assertEquals(true, a);
    }
    
    @Test
    public void quickSortTest_1(){
        MyArrayList a1 = new MyArrayList();
        for(int i =0; i<5; i++){
            a1.add(new Pair(new Integer(i), new Integer(5-i)));
        }
        a1.add(new Pair(new Integer(5), new Integer(5)));
        boolean a = true;
        a1.quicksort(a1);
        for(int i =0; i<5; i++){
            if(new Integer(i+1).compareTo((Integer)a1.get(i).valueGetter())!=0){
                a=false;
                break;
            }
        }
        a=(new Integer(5).compareTo((Integer)a1.get(5).valueGetter())==0);
        assertEquals(true, a);
    }
    
    @Test
    public void quickSortTest_null(){
        MyArrayList a1 = new MyArrayList();
        a1.quicksort(a1);
        assertEquals("[  ]", a1.toString());
    }
    
    @Test
    public void stableQuickSortTest(){
        MyArrayList a1 = new MyArrayList();
        for(int i =0; i<5; i++){
            a1.add(new Pair(new Integer(i), new Integer(5-i)));
        }
        boolean a = true;
        a1.quicksort(a1);
        for(int i =0; i<5; i++){
            if(new Integer(i+1).compareTo((Integer)a1.get(i).valueGetter())!=0){
                if(new Integer(4-i).compareTo((Integer)a1.get(i).valueGetter())!=0){
                a=false;
                break;
            }
            }
        }
        assertEquals(true, a);
    }
    
    @Test
    public void stableQuickSortTest_1(){
        MyArrayList a1 = new MyArrayList();
        for(int i =0; i<5; i++){
            a1.add(new Pair(new Integer(i), new Integer(5-i)));
        }
        a1.add(new Pair(new Integer(5), new Integer(5)));
        boolean a = true;
        a1.quicksort(a1);
        for(int i =0; i<5; i++){
            if(new Integer(i+1).compareTo((Integer)a1.get(i).valueGetter())!=0){
                if(new Integer(4-i).compareTo((Integer)a1.get(i).valueGetter())!=0){
                a=false;
                break;
            }
            }
        }
        a=(new Integer(5).compareTo((Integer)a1.get(5).valueGetter())==0);
        a=(new Integer(5).compareTo((Integer)a1.get(5).keyGetter())==0);
        assertEquals(true, a);
    }
    
    @Test
    public void stableQuickSortTest_null(){
        MyArrayList a1 = new MyArrayList();
        a1.quicksort(a1);
        assertEquals("[  ]", a1.toString());
    }
    
    @Test
    public void binarySearchTest(){
        MyArrayList a1 = new MyArrayList();
        for(int i =0; i<5; i++){
            a1.add(new Pair(new Integer(i), new Integer(5-i)));
        }
        a1.add(new Pair(new Integer(5), new Integer(5)));
        Pair a = a1.binarySearch(a1,new Integer(5));
        assertEquals(new Pair(new Integer(0),new Integer(5)).toString(),a.toString());
    }
    
    @Test
    public void binarySearchTest_1(){
        MyArrayList a1 = new MyArrayList();
        for(int i =0; i<5; i++){
            a1.add(new Pair(new Integer(i), new Integer(5-i)));
        }
        a1.add(0,new Pair(new Integer(0), new Integer(4)));
        Pair a = a1.binarySearch(a1,new Integer(4));
        assertEquals(new Pair(new Integer(0),new Integer(4)).toString(),a.toString());
    }
    @Test
    public void binarySearchTest_Null(){
        MyArrayList a1 = new MyArrayList();
        for(int i =0; i<5; i++){
            a1.add(new Pair(new Integer(i), new Integer(5-i)));
        }
        a1.add(0,new Pair(new Integer(0), new Integer(4)));
        Pair a = a1.binarySearch(a1,new Integer(6));
        assertEquals(null,a);
    }
    
    @Test
    public void binarySearchTest_NullList(){
        MyArrayList a1 = new MyArrayList();
        for(int i =0; i<5; i++){
            a1.add(new Pair(new Integer(i), new Integer(5-i)));
        }
        a1.add(0,new Pair(new Integer(0), new Integer(4)));
        Pair a = a1.binarySearch(a1,new Integer(6));
        assertEquals(null,a);
    }
}
