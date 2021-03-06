import java.util.Random;
/**
 * This class tests the array list
 */
public class ExperimentController
{
    public static void main(){
        ExperimentController demo = new ExperimentController();
        Random r = new Random();
        double temp;
        //Run the methods with different data size and calculte the average
        //output
        System.out.println("front");
        for(int i = 1 ; i<=20; i++){
            temp = 0;
            for(int j = 0; j<=20; j++){
                temp+= demo.timeAddToFront(i*i*i*10,r.nextInt(),0, 1300);
            }
            temp/=20.0;
            System.out.println(temp);
        }
        
        System.out.println("back");
        for(int i = 1 ; i<=20; i++){
            temp = 0;
            for(int j = 0; j<=20; j++){
                temp+= demo.timeAddToBack(i*i*i*10,r.nextInt(),0, 1300);
            }
            temp/=20.0;
            System.out.println(temp);
        }
        
        System.out.println("AddSorted");
        for(int i = 1 ; i<=20; i++){
            temp = 0;
            for(int j = 0; j<=20; j++){
                temp+= demo.timeAddSorted(i*i*i*10,r.nextInt(),0, 1300);
            }
            temp/=20.0;
            System.out.println(temp);
        }
        
        System.out.println("product");
        for(int i = 1 ; i<=20; i++){
            temp = 0;
            for(int j = 0; j<=20; j++){
                temp+= demo.timeProductSorted(i*i*i*10,r.nextInt(),0, 1300);
            }
            temp/=20.0;
            System.out.println(temp);
        }
        
        System.out.println("unsorted");
        for(int i = 1 ; i<=20; i++){
            temp = 0;
            for(int j = 0; j<=20; j++){
                temp+= demo.timeSortofUnsortedList (i*i*i*10,r.nextInt(),0, 1300);
            }
            temp/=20.0;
            System.out.println(temp);
        }
        
        System.out.println("sorted");
        for(int i = 1 ; i<=20; i++){
            temp = 0;
            for(int j = 0; j<=20; j++){
                temp+= demo.timeSortofSortedList (i*i*i*10,r.nextInt(),0, 1300);
            }
            temp/=20.0;
            System.out.println(temp);
        }
    }

    /**
     * This method calculate the time to add random even numbers to the front
     */
    public double timeAddToFront(int numberOfItems, int seed, int min, int max)
    {
        RandomIntegerContainer a = new RandomIntegerContainer();
        Random r = new Random(seed);       
        double startTime = System.currentTimeMillis();
        int temp = 1;
        for(int i = 0; i<numberOfItems; i++){
            temp =1;
            while(temp%2!=0){
                temp = r.nextInt(max+1-min)+min;
            }
            a.addToFront(temp);
        }
        double stopTime = System.currentTimeMillis();
        return(stopTime-startTime);
    }
    /**
     * This method calculate the time to add random even numbers to the back
     */
    public long timeAddToBack(int numberOfItems, int seed, int min, int max){
        RandomIntegerContainer a = new RandomIntegerContainer();
        Random r = new Random(seed);       
        long startTime = System.currentTimeMillis();
        int temp = 1;
        for(int i = 0; i<numberOfItems; i++){
            temp =1;
            while(temp%2!=0){
                temp = r.nextInt(max+1-min)+min;
            }
            a.addToBack(temp);
        }
        long stopTime = System.currentTimeMillis();
        return(stopTime-startTime);
    }
    /**
     * This method calculate the time to add random even numbers 
     * to an sorted array and still keep it sorted
     */
    public double timeAddSorted(int numberOfItems, int seed, int min, int max){
        RandomIntegerContainer a = new RandomIntegerContainer();
        Random r = new Random(seed);
        double startTime = System.currentTimeMillis();
        int temp = 1;
        for(int i = 0; i<numberOfItems; i++){
            temp =1;
            while(temp%2!=0){
                temp = r.nextInt(max+1-min)+min;
            }
            a.addSorted(temp);
        }
        double stopTime = System.currentTimeMillis();
        return(stopTime-startTime);
    }
    /**
     * This method calculate the time to product the first element with
     * random even numbers 
     * and still keep the array list sorted
     */
    public double timeProductSorted(int numberOfItems, int seed, int min, int max){
        RandomIntegerContainer a = new RandomIntegerContainer();
        Random r = new Random(seed);
        a.addToFront(9);
        a.addToFront(8);
        a.addToFront(7);
        double startTime = System.currentTimeMillis();
        int temp = 1;
        for(int i = 0; i<numberOfItems; i++){
            temp =1;
            while(temp%2!=0){
                temp = r.nextInt(max+1-min)+min;
            }
            a.productSorted(temp);
        }
        double stopTime = System.currentTimeMillis();
        return(stopTime-startTime);
    }
    /**
     * This method calculate the time to sort an array(change one line to also calculate time to add elements)
     */
    public double timeSortofUnsortedList(int numberOfItems, int seed, int min, int max){
        RandomIntegerContainer a = new RandomIntegerContainer();
        Random r = new Random(seed); 
        double startTime = System.currentTimeMillis();
        int temp = 1;
        for(int i = 0; i<numberOfItems; i++){
            temp =1;
            while(temp%2!=0){
                temp = r.nextInt(max+1-min)+min;
            }
            a.addToBack(temp);
        }     
        
        a.selectionSort();
        double stopTime = System.currentTimeMillis();
        return(stopTime-startTime);
    }
    /**
     * This method calculate the time to sort a sorted array
     */
    public double timeSortofSortedList(int numberOfItems, int seed, int min, int max){
        RandomIntegerContainer a = new RandomIntegerContainer();
        Random r = new Random(seed); 
        int temp = 1;
        for(int i = 0; i<numberOfItems; i++){
            temp =1;
            while(temp%2!=0){
                temp = r.nextInt(max+1-min)+min;
            }
            a.addToBack(temp);
        }      
        a.selectionSort();
        double startTime = System.currentTimeMillis();
        a.selectionSort();
        double stopTime = System.currentTimeMillis();
        return(stopTime-startTime);
    }

}
