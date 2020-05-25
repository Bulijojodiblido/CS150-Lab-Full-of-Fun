import java.util.*;
/**
 * Experiments are done here
 *
 * @Yin Zheping
 * @0.114514
 */
public class ExperimentController
{

    public static void main(){
        ExperimentController a = new ExperimentController();
        long time =0;
        System.out.println("sToQ");
        for(int j = 10000; j<1000000;j+=90000){
            for(int i = 0; i<10; i++){
                time+=a.stackToQueue(j,114514);
            }
            System.out.println(time/10);
        }

        time = 0;
        System.out.println("qToS");
        for(int j = 10000; j<1000000;j+=90000){
            for(int i =0; i<10; i++)
                time+=a.queueToStack(j,114514);
            System.out.println(time/10); 
        }
    }

    /**
     * Calculte the time to add certain amount of data to a stack
     * and then into a queue
     *
     * @param  dataSize  size of data to add
     * @param  seed  the seed to generate random data
     * @return  time  the time to add all the data to stack and then to queue
     */
    private long stackToQueue(int dataSize, int seed){
        MyStack<Integer> a=new MyStack<Integer>();
        Random r = new Random(seed);
        MyQueue<Integer> b = new MyQueue<Integer>();
        long start = System.currentTimeMillis();
        for(int i =0; i<dataSize;i++){
            a.push(r.nextInt());
        }
        while(a.peek()!=null){
            b.add(a.pop());
        }
        long end = System.currentTimeMillis();
        return end-start;
    }

    /**
     * Calculte the time to add certain amount of data to a queue
     * and then into a stack
     *
     * @param  dataSize  size of data to add
     * @param  seed  the seed to generate random data
     * @return  time  the time to add all the data to queue and then to stack
     */
    private long queueToStack(int dataSize, int seed){
        MyStack<Integer> b=new MyStack<Integer>();
        Random r = new Random(seed);
        MyQueue<Integer> a = new MyQueue<Integer>();
        long start = System.currentTimeMillis();
        for(int i =0; i<dataSize;i++){
            a.add(r.nextInt());
        }
        while(a.peek()!=null){
            b.push(a.remove());
        }
        long end = System.currentTimeMillis();
        return end-start;
    }
}
