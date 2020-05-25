import java.util.*;
/**
 * This is the node class of the Linked List
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class Node<E>
{
    // instance variables - replace the example below with your own
    public E val;
    public Node next;
    /**
     * Constructor of the node class
     * @param x the value to store in each node
     */
    public Node(E x)
    {
        // initialise instance variables
        val = x;
    }

    /**
     * Constructor of the node class
     * @param x the value to store in each node
     * @param temp the node to link behind the current list
     */
    public Node(E x, Node temp){
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
            next=new Node(x);
        }
        else{
            next.append(x);
        }
    }
    
    /**
     * A method convert the node into a string
     *
     * @return the string form of the node
     */
    public String toString(){
        String output = val.toString();
        Node temp = next;
        while(temp!=null){
            output+=temp.val;
            temp=temp.next;
        }
        return output;
    }
}
