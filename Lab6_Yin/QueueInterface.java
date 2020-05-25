
/**
 * Write a description of class QueueInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface QueueInterface<E>
{
    /**
     * Add one element to the back
     *
     * @param  E  the element to add
     * @return    the added element
     */
    abstract E add(E val);
    /**
     * It returns the first added element in the stack
     *
     * @return    the added element
     */
    abstract E peek();
    /**
     * Remove the first added element
     *
     * @return    the element removed
     */
    abstract E remove();
}
