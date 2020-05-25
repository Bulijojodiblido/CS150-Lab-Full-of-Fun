import java.util.*;
/**
 * This is the node class of the Linked List
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class Cell<E>
{
    // instance variables - replace the example below with your own
    public E val;
    public Cell next;
    /**
     * Constructor of the node class
     * @param x the value to store in each node
     */
    public Cell(E x)
    {
        // initialise instance variables
        val = x;
    }

    /**
     * Constructor of the node class
     * @param x the value to store in each node
     * @param temp the node to link behind the current list
     */
    public Cell(E x, Cell temp){
        val =x;
        next = temp;
    }

    /**
     * A method adding Es into the next null Cell object
     *
     * @param  x the value to add
     * @return nothing
     */
    public void append(E x){
        //If the first null next is found initialize it
        //otherwise to into the recursion of next until
        //the first empty next is found
        if(next==null){
            next=new Cell(x);
        }
        else{
            next.append(x);
        }
    }
    
    public String toString(){
        String output = val.toString();
        Cell temp = next;
        while(temp!=null){
            output+=temp.val;
            temp=temp.next;
        }
        return output;
    }
}
