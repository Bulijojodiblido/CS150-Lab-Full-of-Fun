import java.util.*;
/**
 * A child class of ArrayList that carries Pairs in each cell
 * Pair has two elements
 * The first element is the initial location of each element
 * The second element is the value within
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class MyArrayList extends ArrayList<Pair>
{
    //The method displaying the difference between the two methods
    public static void main(){
        MyArrayList a = new MyArrayList();
        Random r1 = new Random(114514);
        Random r2 = new Random(114514);
        System.out.println("Stable Sort");
        //Add pairs
        for(int i =0; i< 11; i++){
            a.add(new Pair(new Integer(i),new Integer(r1.nextInt(5))));
        }
        System.out.println("Before");
        for(int i =0; i< 11; i++){
            System.out.println(a.get(i).toString());
        }
        stableQuicksort(a);
        System.out.println("After");
        for(int i =0; i< 11; i++){
            System.out.println(a.get(i).toString());
        }
        System.out.println("Unstable Sort");
        //Add pairs
        MyArrayList b = new MyArrayList();
        for(int i =0; i< 11; i++){
            b.add(new Pair(new Integer(i),new Integer(r2.nextInt(5))));
        }
        System.out.println("Before");
        for(int i =0; i< 11; i++){
            System.out.println(b.get(i).toString());
        }
        quicksort(b);
        System.out.println("After");
        for(int i =0; i< 11; i++){
            System.out.println(b.get(i).toString());
        }
        Integer x =(Integer)b.get(10).valueGetter();
        System.out.println(binarySearch(b,x));

    }

    /**
     * return the MyArrayList in string
     *
     * @param  nothing
     * @return list in string
     */
    public String toString(){
        String a="[ ";
        if(size()!=0)
        for(int i=0; i<size(); i++){
            a+=get(i)+"; ";
        }
        a+=" ]";
        return a;
    }

    /**
     * sort the list in an unstable way
     *
     * @param   a    the array to sort
     * @return  nothing
     */
    public static void quicksort( MyArrayList a )
    {
        if(a.size()!=0)
            quicksort( a, 0, a.size() - 1 );
    }

    /**
     * actual sorting method using recursion
     *
     * @param   a      the array to sort
     * @param   low    the lower bound
     * @param   high   the upper bound
     * @return nothing
     */
    private static void quicksort( MyArrayList a, int low, int high )
    {
        // Sort low, middle, high
        int middle = ( low + high ) / 2;
        if( a.get(middle).valueGetter().compareTo( a.get(low).valueGetter() ) < 0 )
            swapReferences( a, low, middle );
        if( a.get(high).valueGetter().compareTo( a.get(low).valueGetter() ) < 0 )
            swapReferences( a, low, high );
        if( a.get(high).valueGetter().compareTo( a.get(middle).valueGetter() ) < 0 )
            swapReferences( a, middle, high );

        // Place pivot at position high - 1
        swapReferences( a, middle, high - 1 );
        Pair pivot = a.get(high-1);

        // Begin partitioning
        int i, j;
        for( i = low, j = high - 1; ; )
        {
            while( (i<high)&&a.get(++i).valueGetter().compareTo( pivot.valueGetter() ) < 0 )
                ;
            while( (j>low)&&pivot.valueGetter().compareTo( a.get(--j).valueGetter() ) < 0 )
                ;
            if( i >= j )
                break;
            swapReferences( a, i, j );
        }
        // Restore pivot
        swapReferences( a, i, high - 1 );

        if(low<i-1)
            quicksort( a, low, i - 1 ); // Sort small elements
        if(high>i+1)
            quicksort( a, i + 1, high ); // Sort large elements

    }

    /**
     * sort the list in a stable way
     *
     * @param   a    the array to sort
     * @return  nothing
     */
    public static void stableQuicksort(MyArrayList a){
        if(a.size()!=0){
            MyArrayList b = (MyArrayList)a.clone();
            stableQuicksort(b,0,b.size()-1);
            for(int i =0; i<a.size();i++){
                a.set(i,b.get(i));
            }
        }
    }

    /**
     * actual sorting method using recursion
     *
     * @param   a      the array to sort
     * @param   low    the lower bound
     * @param   high   the upper bound
     * @return nothing
     */
    private static void stableQuicksort(MyArrayList a, int low, int high){
        // Sort low, middle, high
        int middle = ( low + high ) / 2;
        if( a.get(middle).compareTo( a.get(low)) < 0 )
            swapReferences( a, low, middle );
        if( a.get(high).compareTo( a.get(low)) < 0 )
            swapReferences( a, low, high );
        if( a.get(high).compareTo( a.get(middle)) < 0 )
            swapReferences( a, middle, high );
        // Place pivot at position high - 1
        swapReferences( a, middle, high - 1 );
        Pair pivot = a.get(high-1);

        // Begin partitioning
        int i, j;
        for( i = low, j = high - 1; ; )
        {
            while( (i<high)&&a.get(++i).compareTo( pivot ) < 0 )
                ;
            while( (j>low)&&pivot.compareTo( a.get(--j) ) < 0 )
                ;
            if( i >= j )
                break;
            swapReferences( a, i, j );
        }
        // Restore pivot
        swapReferences( a, i, high - 1 );
        if(low<i-1)
            stableQuicksort( a, low, i - 1 ); // Sort small elements
        if(high>i+1)
            stableQuicksort( a, i + 1, high ); // Sort large elements

    }

    /**
     * swap the two elements in a list
     *
     * @param   a      the array to sort
     * @param   low    the lower bound
     * @param   high   the upper bound
     * @return nothing
     */
    public static void swapReferences(MyArrayList a, int low, int high){
        if(a.size()!=0)
            if(low<high){
                Pair temp = a.get(low);
                a.set(low,a.get(high));
                a.set(high,temp);
            }
    }

    /**
     * search the first pair with value in the list
     *
     * @param   b      the array to search
     * @param   val    the value to search
     * @return the pair to first appeared with the value to search
     * @return null if no pair has the value to search
     */
    public static<E extends Comparable<E>> Pair binarySearch(MyArrayList b,E val){
        if(b.size()!=0){
            MyArrayList a;
            a = (MyArrayList)b.clone();
            stableQuicksort(a);
            return binarySearch(a,0,a.size()-1,val);
        }
        return null;
    }

    /**
     * actual method searching
     *
     * @param   b      the array to search
     * @param   val    the value to search
     * @param   low    the lower bound
     * @param   high   the upper bound
     * @return the pair to first appeared with the value to search
     * @return null if no pair has the value to search
     */
    public static <E extends Comparable<E>> Pair binarySearch(MyArrayList b,int low,int high, E val){
        if(low==high){
            if(val.compareTo((E)b.get(low).valueGetter())==0){
                return b.get(low);
            }
        }
        else{
            int index = (low+high)/2;
            if(val.compareTo((E)b.get(index).valueGetter())<=0){
                return binarySearch(b,low,index,val);
            }

            if(val.compareTo((E)b.get(index).valueGetter())>0){
                return binarySearch(b,index+1,high,val);
            }
        }
        return null;
    }
}
