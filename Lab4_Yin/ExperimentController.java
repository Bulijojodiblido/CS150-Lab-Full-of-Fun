import java.util.*;
/**
 * This class compares the run-time of the two search methods of MyIntegerContainer
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class ExperimentController
{
    // instance variables
    MyListIntegerContainer m = new MyListIntegerContainer();
    /**
     * Where all the tests are run
     */
    public static void ExperimentController()
    {
        ExperimentController e = new ExperimentController();
        e.add(10000000);
        System.out.println("With Iterator");
        for(int i =50000; i<10000000; i+=800000){
            long time =0;
            for(int a =0; a<10;a++){
                time +=e.timeSearchWithIte(i);
            }
            //the index and time to search the element
            System.out.println(e.m.searchWithIterator(e.m.getNum(i)));
            System.out.println(time/10.0);
        }
        
        System.out.println("Without Iterator");
        for(int i =5000; i<100000; i+=5000){
            long time =0;
            for(int a =0; a<10;a++){
                time +=e.timeSearchWithoutIte(i);
            }
            //the index and time to search the element
            System.out.println(e.m.searchWithoutIterator(e.m.getNum(i)));
            System.out.println(time/10.0);
        }
    }

    /**
     * A method that shows the run-time of search methods with iterator
     * It uses a chosen set of data with chosen data size
     * * @param the index of the element to search
     * @return    the run time for the search
     */
    public long timeSearchWithIte(int index)
    {
        int temp = m.getNum(index);
        //Measure time
        long startTime = java.lang.System.currentTimeMillis();
        m.searchWithIterator((Integer)temp);
        long endTime = java.lang.System.currentTimeMillis();
        return endTime-startTime;
    }

    /**
     * A method that shows the run-time of search methods without iterator
     * It uses a chosen set of data with chosen data size
     * @param the index of the element to search
     * @return    the run time for the search
     */
    public long timeSearchWithoutIte(int index)
    {
        int temp = m.getNum(index);
        //Measure time
        long startTime = java.lang.System.currentTimeMillis();
        m.searchWithoutIterator((Integer)temp);
        long endTime = java.lang.System.currentTimeMillis();
        return endTime-startTime;
    }
    /**
     * A method adds random numbers to a linked list
     * @param dataSize data size of the test data
     * @return    the run time for the search
     */
    public void add(int dataSize)
    {
        Random r = new Random(114514);
        
        for(int i = 0; i < dataSize; i++){
            m.addToBack(r.nextInt(100000));
        }
    }
}
