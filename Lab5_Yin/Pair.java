
/**
 * A class that create objects with two elements
 * Key and Value
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class Pair<K extends Comparable<K>, V extends Comparable<V>> implements Comparable<Pair>
{
    // instance variables - replace the example below with your own
    K key;
    V value;   

    /**
     * Constructor for objects of class Pair
     */
    public Pair(K kTemp, V vTemp)
    {
        key= kTemp;
        value=vTemp;
    }

    /**
     * Set the key variable
     *
     * @param  kTemp the key variable to add
     * @return    nothing
     */
    public void keySetter(K kTemp)
    {
        key = kTemp;
    }
    
    /**
     * Set the value variable
     *
     * @param  vTemp the value variable to add
     * @return    nothing
     */
    public void valueSetter(V vTemp)
    {
        value = vTemp;
    }
    
    /**
     * Get the key variable
     *
     * @param  nothing
     * @return    the key variable
     */
    public K keyGetter()
    {
        return key;
    }
    
    /**
     * Get the value variable
     *
     * @param  nothing
     * @return    the value variable
     */
    public V valueGetter()
    {
        return value;
    }
    
    /**
     * return the pair in string
     *
     * @param  nothing
     * @return    the pair in string
     */
    public String toString(){
        String a = "";
        a+="key: "+key.toString()+"     value: "+value.toString();
        return a;
    }
    
    /**
     * compare the current object with another object
     *
     * @param  the other pair to compare with
     * @return    how far they are from each other
     */
    public int compareTo(Pair temp){
        if(value.compareTo((V)temp.valueGetter())==0){
            return(key.compareTo((K)temp.keyGetter()));
        }
        return value.compareTo((V)temp.valueGetter());
    }
}
