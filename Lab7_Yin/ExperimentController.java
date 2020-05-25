import java.util.*;

import java.io.*;
/**
 * ExperimentController
 *
 * @author Zeppelin
 * @version 0.114514
 */
public class ExperimentController
{
    public static void main() throws IOException{
        openTimeTest(0);
        openTimeTest(60);
    }

    /**
     * Display the time to consturct certain Customer by increasing order of time
     */
    private static void customersTest(){
        System.out.println("cQa");
        for(int i =1000000; i<=10000000;i+=1000000){
            timeToConstruct(114514,0,i);
        }
        System.out.println("cQ");
        for(int i =1000000; i<=10000000;i+=1000000){
            timeToConstruct(114514,1,i);
        }
        System.out.println("cA");
        for(int i =1000000; i<=10000000;i+=1000000){
            timeToConstruct(114514,2,i);
        }
    }

    /**
     * Generate two csv files of the customers served according to the open time
     */
    private static void openTimeTest(int start) throws IOException{
        Random r = new Random();
        PrintWriter fW = new PrintWriter(new File("result"+start+".csv"));
        for(int j =0;j<100;j++){
            int seed = r.nextInt();
            ArrayList<Customer> a = new ArrayList<Customer>();
            arrayListGene(a,100,seed,0);
            Customers c = new CustomerQueue(a);
            Shop s = new Shop(c,start);
            fW.append(s.run());
            fW.append("\n");
        }
        fW.close();
    }

    /**
     * Display the time to shop with certain Customer by increasing order of time
     */
    private static void shopTest(){
        System.out.println("cQa");
        for(int i =100000; i<=1000000;i+=100000){
            timeToShop(114514,0,i);
        }
        System.out.println("cQ");
        for(int i =100000; i<=1000000;i+=100000){
            timeToShop(114514,1,i);
        }
        System.out.println("cA");
        for(int i =100000; i<=1000000;i+=100000){
            timeToShop(114514,2,i);
        }
    }

    /**
     * test how long it takes for a certain structure of Customers to fill the data
     *
     * @param  seed  the seed for random
     * @param  kind  the data structure to use
     * @param  size the dataSize to generate
     * @return  the time taken to construct Customers
     */
    private static long timeToConstruct(int seed, int kind, int size){
        long start = 0;
        long end =0;
        long time =0;
        for(int j =0; j<10; j++){
            //Construct the Customer According to the chosen kind
            //Each Experiment is run for ten times and it returns the average run time
            if(kind == 0){
                ArrayList<Customer> a = new ArrayList<Customer>();
                arrayListGene(a,size,seed,0);
                start = System.currentTimeMillis();
                Customers c = new CustomerQueue(a);
                end = System.currentTimeMillis();
                time += end-start;
            }

            if(kind == 1){
                ArrayList<Customer> a = new ArrayList<Customer>();
                arrayListGene(a,size,seed,0);
                start = System.currentTimeMillis();
                Customers c = new CustomerQueue();
                for(int i =0; i<a.size();i++){
                    c.add(a.get(i));
                }
                end = System.currentTimeMillis();
                time += end-start;
            }

            if(kind == 2){
                ArrayList<Customer> a = new ArrayList<Customer>();
                arrayListGene(a,size,seed,0);
                start = System.currentTimeMillis();
                Customers c = new CustomerArray(180);
                for(int i =0; i<a.size();i++){
                    c.add(a.get(i));
                }
                end = System.currentTimeMillis();
                time += end-start;
            }
        }
        System.out.println(time/10);
        return time/10;
    }

    /**
     * test how long it takes for certain amount of customers to do shopping
     *
     * @param  seed  the seed for random
     * @param  kind  the data structure to use
     * @param  size the dataSize to generate
     * @return  the time taken to shop
     */
    private static long timeToShop(int seed, int kind, int size){
        long start = 0;
        long end =0;
        long time =0;
        for(int j =0; j<10; j++){
            //Shop According to the chosen kind
            //Each Experiment is run for ten times and it return the average runtime
            if(kind == 0){
                ArrayList<Customer> a = new ArrayList<Customer>();
                arrayListGene(a,size,seed,0);
                Customers c = new CustomerQueue(a);
                Shop s = new Shop(c,0);
                start = System.currentTimeMillis();
                s.run();
                end = System.currentTimeMillis();
                time += end-start;
            }

            if(kind == 1){
                ArrayList<Customer> a = new ArrayList<Customer>();
                arrayListGene(a,size,seed,0);
                Customers c = new CustomerQueue();
                for(int i =0; i<a.size();i++){
                    c.add(a.get(i));
                }
                Shop s = new Shop(c,0);
                start = System.currentTimeMillis();
                s.run();
                end = System.currentTimeMillis();
                time += end-start;
            }

            if(kind == 2){
                ArrayList<Customer> a = new ArrayList<Customer>();
                arrayListGene(a,size,seed,0);
                Customers c = new CustomerArray(180);
                for(int i =0; i<a.size();i++){
                    c.add(a.get(i));
                }
                Shop s = new Shop(c,0);
                start = System.currentTimeMillis();
                s.run();
                end = System.currentTimeMillis();
                time += end-start;
            }
        }
        System.out.println(time/10);
        return time/10;
    }

    /**
     * generate the array list of random customers to be Customers
     *
     * @param  a  the ArrayList to modify
     * @param  dataSize the dataSize to generate
     * @param  seed  the seed for random
     * @param  start  time to start
     */
    private static void arrayListGene(ArrayList a,int dataSize,int seed,int start)
    {
        Random r = new Random(seed);
        for(int i=0;i<dataSize;i++){
            a.add(new Customer(r.nextInt(180-start)+start,r.nextInt(4)+2,5+r.nextInt(26)));
        }
    }

}
