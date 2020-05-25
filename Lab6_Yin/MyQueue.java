
/**
 * Queue Data Structure
 *
 * @Yin Zheping
 * @0.114514
 */
public class MyQueue<E> implements QueueInterface<E>
{
    MyLinkedList<E> a = new MyLinkedList<E>();
    /**
     * Add one element to the back
     *
     * @param  E  the element to add
     * @return    the added element
     */
    public E add(E val){
       a.addEnd(val); 
       return val;
    }
    /**
     * It returns the first added element in the stack
     *
     * @return    the added element
     */
    public E peek(){
        if(a.getHead()!=null)
        return (E)a.getHead().val;
        return null;
    }
    /**
     * Remove the first added element
     *
     * @return    the element removed
     */
    public E remove(){
        return a.removeHead();
    }
}
