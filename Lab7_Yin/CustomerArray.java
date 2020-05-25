import java.util.*;
/**
 * A hash table of customers
 *
 * @Zeppelin
 * @0.114514
 */
public class CustomerArray implements Customers
{
    private int length;
    int lenNEmp=0;
    private LinkedList<Customer>[] a;
    private int first;
    /**
     * Constructor for objects of class CustomereArray
     * 
     * @param  lT  initialize the array with a corresponding length
     */
    public CustomerArray(int lT){
        length=lT;
        a=new LinkedList[length];
        first = length;
    }

    /**
     * Add customers to the array based on arrival
     *
     * @param  customer  Customer to add
     * @return  if the element is added
     */
    public boolean add(Customer customer){
        if(customer!=null){
            if(customer.arrival<first){
                first = customer.arrival;
            }
            if(a[customer.arrival]==null){
                a[customer.arrival]=new LinkedList<Customer>();
                lenNEmp++;
            }
            a[customer.arrival].add(customer);
            return true;
        }
        return false;
    }

    /**
     * Determine if the array is empty
     *
     * @return if the array is empty
     */
    public boolean isEmpty(){
        return lenNEmp==0;
    }

    /**
     * Delete the first non null element in the array
     *
     * @return the deleted element
     */
    public Customer pop(){
        if(lenNEmp>0){
            Customer temp = a[first].pop();
            if(a[first].isEmpty()||a[first]==null){
                lenNEmp--;
            }
            if(lenNEmp!=0)
                for(int i = first;i<length;i++){
                    if(a[i]!=null&&!a[i].isEmpty()){
                        first = i;
                        return temp;
                    }
                }
            else
                first = length;
            return temp;

        }

        return null;
    }
}
