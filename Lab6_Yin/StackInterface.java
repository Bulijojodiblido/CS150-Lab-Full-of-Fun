
/**
 * Stack data structure outline
 *
 * @Yin Zheping
 * @0.114514
 */
public interface StackInterface<E>
{
    /**
     * This method checks if the linked list is empty
     * 
     * @return    if the linked list is empty
     */
    abstract boolean empty();
    /**
     * It returns the last added element in the stack
     *
     * @return    the last added element
     */
    abstract E peek();
    /**
     * Add one element to the front
     *
     * @param  E  the element to add
     * @return    the added element
     */
    abstract E push(E item);
    /**
     * Remove the last added element
     *
     * @return    the element removed
     */
    abstract E pop();
    /**
     * This method search the index of the first required element in the list
     * It uses enhanced for loop
     * @param  find the Integer to find
     * @return    the location of the first integer that equals to find
     */
    abstract int search(Object o);
}
