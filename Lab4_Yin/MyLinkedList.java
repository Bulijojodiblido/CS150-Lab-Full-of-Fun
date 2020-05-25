import java.util.*;
import java.lang.IndexOutOfBoundsException;
/**
 * This is a generic SLL
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class MyLinkedList<E> implements Iterable<E>
{
    private Cell<E> root;
    private Cell<E> head;
    private Cell<E> tail;
    private int size;

    /**
     * This method add values to the first position of the list
     * It initializes the root if root is null
     * @param  value the value to add
     * @return    nothing
     */
    public void addFirst(E value)
    {
        //
        if(root == null){
            root = new Cell(value);
            head = root;
            tail = root;
        }
        else{
            root=new Cell(value,root);
            head = root;
        }
        size++;
    }
    
    /**
     * This method add values to the last position of the list
     * It initializes the root if root is null
     * @param  value the value to add
     * @return    nothing
     */
    public void addEnd(E value){
        if(root == null){
            root = new Cell(value);
            head = root;
            tail = root;
        }
        else{
            tail.append(value);
            tail = tail.next;
        }
        size++;
    }
    
    /**
     * This method initialize a iterator for MyLinkedList
     *
     * @param  nothing
     * @return    a iterator of MyLinkedList to do enhanced for loop
     */
    public Iterator<E> iterator(){
        return (Iterator<E>)new MyLinkedListIterator<E>(root);
    }

    /**
     * This method return the value of a certain index in the list
     *
     * @param  the index to return
     * @return    the element in the list with the index
     * @throws NullPointerException if root is not initialized
     * @throws IndexOutOfBoundsException if the index is larger than size-1 
     */
    public E get(int x) throws IndexOutOfBoundsException{
        //
        if(root!=null){
            if(x>=size){
                throw new IndexOutOfBoundsException();
            }
            else{
                Cell temp = root;
                int loc = 0;
                while(loc<x){
                    temp=temp.next;
                    loc++;
                }
                return (E)temp.val;
            }
        }  
        throw new NullPointerException();
    } 
    /**
     * This method return first element of the list
     *
     * @param  nothing
     * @return    the first element
     */
    public Cell getHead(){
        return head;
    }
    
    /**
     * This method return last element of the list
     *
     * @param  nothing
     * @return    the last element
     */
    public Cell getTail(){
        return tail;
    }
    /**
     * This method return size of the list
     *
     * @param  nothing
     * @return    size
     */
    public int getSize(){
        return size;
    }
    /**
     * This method determins if the root is null
     *
     * @param  nothing
     * @return    if root is null
     */
    public boolean isEmpty(){
        return root==null;
    }
    
    public String toString(){
        String output = "";
        Cell temp = root;
        while(temp!=null){
            output+=temp.val;
            temp=temp.next;
        }
        return output;
    }
}
