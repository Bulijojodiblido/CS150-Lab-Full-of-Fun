
/**
 * Stack Data Structure
 *
 * @Yin Zheping
 * @0.114514
 */
public class MyStack<E extends Comparable<E>> implements StackInterface<E>
{
    MyLinkedList<E> a = new MyLinkedList<E>();

    /**
     * It returns the last added element in the stack
     *
     * @return    the last added element
     */
    public E peek()
    {
        if(a.getHead()!=null)
        return (E)a.getHead().val;
        return null;
    }
    
    /**
     * This method checks if the linked list is empty
     * 
     * @return    if the linked list is empty
     */
    public boolean empty()
    {
        // put your code here
        return a.isEmpty();
    }
    
    /**
     * Remove the last added element
     *
     * @return    the element removed
     */
    public E pop()
    {
        // put your code here
        return a.removeHead();
    }
    
    /**
     * Add one element to the front
     *
     * @param  E  the element to add
     * @return    the added element
     */
    public E push(E item)
    {
        a.addFirst(item);
        return item;
    }
    
   /**
     * This method search the index of the first required element in the list
     * It uses enhanced for loop
     * @param  find the Integer to find
     * @return    the location of the first integer that equals to find
     */
    public int search(Object o){
        if(!a.isEmpty()){
            int loc = 0;
            for(E temp: a){
                if(temp.compareTo((E)o)==0){
                    return loc;
                }
                loc++;
            }
        }
        return -1;
    }

}
