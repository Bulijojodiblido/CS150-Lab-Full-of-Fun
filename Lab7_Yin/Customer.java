
/**
 * Customer Simulation
 *
 * @Zeppeling
 * @0.114514
 */
public class Customer implements Comparable<Customer>
{
    int arrival;
    int orderingTime;
    int giveUpTime;
    boolean served;
    boolean left;
    
    /**
     * Constructor for objects of class CustomereArray
     * 
     * @param  aT  The arrival of this customer
     * @param  oT  THe ordering time of this customer
     * @param  gT  The giveup time of this customer
     */
    public Customer(int aT,int oT,int gT){
        arrival = aT;
        orderingTime=oT;
        giveUpTime=gT;
        served=false;
        left=false;
    }
    
    /**
     * Compare two elements
     *
     * @param  b  the Customer to compare with
     * @return    the difference between the two elements
     */
    public int compareTo(Customer b){
        if(b!=null)
        return new Integer(arrival).compareTo(new Integer(b.arrival));
        throw new NullPointerException();
    }

}
