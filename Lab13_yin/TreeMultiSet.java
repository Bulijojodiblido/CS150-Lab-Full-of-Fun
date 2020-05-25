import java.util.*;
/**
 * Write a description of class TreeMultiSet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreeMultiSet<E> implements MultiSet<E>
{
    TreeMap<E,Integer> index = new TreeMap<E,Integer>();

    /**
     * add one occurance to a specific element to the set
     *
     * @param x the word with this occurance
     */
    public void add(E x){
        Integer a = index.get(x);
        if(a==null){
            index.put(x,1);
            //System.out.println(x);
            //System.out.println(index.get(x));
        }
        else{
            a++;
            index.replace(x,a);
        }
    }

    /**
     * add one occurance to a specific element to the set
     *
     * @param x the word with this occurance
     */
    public boolean contains(E x){
        return index.containsKey(x);
    }

    /**
     * add one occurance to a specific element to the set
     *
     * @param x the word with this occurance
     */
    public int count(E x){
        if(index.get(x)!=null)
            return index.get(x);
        return 0;
    }

    /**
     * add one occurance to a specific element to the set
     *
     * @param x the word with this occurance
     */
    public boolean removeOne (E x){
        Integer a = index.get(x);
        if(a!=null){
            if(a==1)
                index.remove(x);
            else{
                a--;
                index.replace(x,a);
            }
            return true;
        }
        return false;
    }

    /**
     * add one occurance to a specific element to the set
     *
     * @param x the word with this occurance
     */
    public boolean removeAll (E x){
        Integer a = index.get(x);
        if(a!=null){
            index.remove(x);
            return true;
        }
        return false;
    }

    /**
     * add one occurance to a specific element to the set
     *
     * @param x the word with this occurance
     */
    public void toArray(E [] arr){
        E[] a = (E[])index.keySet().toArray();
        int i =0;
        for(E temp : a){
            for(int j = 0; j<index.get(temp);j++){
                arr[i]=temp;
                i++;
            }
        }
    }

}
