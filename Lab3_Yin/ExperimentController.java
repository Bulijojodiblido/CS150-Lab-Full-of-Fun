import java.util.Random;
/**
 * A test class of IntegerList
 * It calculate the time spent on each method with different data size
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class ExperimentController
{

    public static void main(String[] args){
        Random r = new Random();
        ExperimentController e = new ExperimentController();
        //time to append with different data size
        for(int i = 1; i< 80; i+=5){
            double t =0;
            for(int j =0; j<10; j++){
                t+=e.timeAppend(i*i,r.nextInt());
            }
            System.out.println(t/10);
        }
        System.out.println("---------------------------");
        //time to convert to string with different data size
        for(int i = 1; i< 80; i+=5){
            double t =0;
            for(int j =0; j<10; j++){
                t+=e.timeToString(i*i,r.nextInt());
            }
            System.out.println(t/10);
        }
    }

    /**
     * Constructor for objects of class ExperimentController
     */
    public ExperimentController()
    {
    }

    /**
     * This method calculates the time spent to append different
     * amount of numbers to a IntegerList object
     *
     * @param  numberOfItems the amount of numbers to append
     * @param seed the number for a specified series of random numbers
     * @return    the time spent
     */
    public double timeAppend(int numberOfItems, int seed){
        Random r = new Random(seed);
        IntegerList a = new IntegerList();
        double startT=System.currentTimeMillis();
        for(int i = 0; i < numberOfItems; i++){
            a.append(r.nextInt(201));
        }
        double endT=System.currentTimeMillis();
        return endT-startT;
    }

    /**
     * This method calculates the time spent to convert IntegerList
     * of different sizes to String
     *
     * @param  numberOfItems the amount of numbers to append
     * @param seed the number for a specified series of random numbers
     * @return    the time spent
     */
    public double timeToString(int numberOfItems, int seed){
        Random r = new Random(seed);
        IntegerList a = new IntegerList();
        for(int i = 0; i < numberOfItems; i++){
            a.append(r.nextInt(201));
        }
        double startT=System.currentTimeMillis();
        a.toString();
        double endT=System.currentTimeMillis();
        return endT-startT;
    }

}
