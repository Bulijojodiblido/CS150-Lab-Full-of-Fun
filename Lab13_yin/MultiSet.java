/**
 * Outline for multisets
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public interface MultiSet<AnyType>
{
    /**
     * add one occurance to a specific element to the set
     *
     * @param x the word with this occurance
     */
    void add( AnyType x );

    /**
     * Determine if an element is contained in the set
     *
     * @param x The element to search for
     * @return If an element is contained in the set
     */
    boolean contains( AnyType x );

    /**
     * Count the occurance of an element
     *
     * @param x The element to count for
     * @return The number of the occurance of an element
     */
    int count( AnyType x );

    /**
     * Remove one occurance of a specific element
     *
     * @param x the element to remove
     * @return If the removal is successful
     */
    boolean removeOne( AnyType x );

    /**
     * Remove all occurance of a specific element
     *
     * @param x the element to remove
     * @return If the removal is successful
     */
    boolean removeAll( AnyType x );

    /**
     * Covert the set into an array
     *
     * @param arr The Set in array
     */
    void toArray( AnyType [] arr );
}