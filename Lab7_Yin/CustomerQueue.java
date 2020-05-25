import java.util.*;
/**
 * A priority queue of Customers
 *
 * @author Zeppelin
 * @version 0.114514
 */
public class CustomerQueue extends PriorityQueue<Customer> implements Customers
{
   
   
    /**
     * Constructor for objects of class CustomereArray
     */
    public CustomerQueue(){
        super();
    }
    
    /**
     * Constructor for objects of class CustomereArray
     * 
     * @param a  the ArrayList to clone
     */
    public CustomerQueue(ArrayList<Customer> a){
        super(a);
    }
    
    /**
     * Add customers to the array based on arrival
     *
     * @param  customer  Customer to add
     * @return  if the element is added
     */
    public boolean add(Customer a){
        if(a!=null)
        return super.add(a);
        return false;
    }
    
    /**
     * Delete the first non null element in the array
     *
     * @return the deleted element
     */
    public Customer pop(){
        return super.poll();
    }
    
    /**
     * Determine if the array is empty
     *
     * @return if the array is empty
     */
    public boolean isEmpty(){
        return super.isEmpty();
    }
    

}
