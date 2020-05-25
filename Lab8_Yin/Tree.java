import java.util.*;
/**
 * Outline of Generic Tree
 *
 * @author Zeppelin
 * @version 0.114514
 */
public interface Tree <E extends Comparable<E>>
{
    /**
     * Insert a Element into the tree
     *
     * @param  e the element to insert
     * @return   if the insertion is successfule
     */
    abstract boolean insert(E e);
    /**
     * Determine if the tree contain a specific element
     *
     * @param  e the element to search for
     * @return   if the tree contain such an element
     */
    abstract boolean contains(E e);
    /**
     * Determine the numebr of element at a specific depth in the tree
     *
     * @param  i the depth to look for elements
     * @return   the number of elements at that depth
     */
    abstract int numOfElementsDepth(int i);
    /**
     * Return the largest element in the tree
     *
     * @return   the largest element in the tree
     */
    abstract E findMax();
    /**
     * Return the smallest element in the tree
     *
     * @return   the smallest element in the tree
     */
    abstract E findMin();
    /**
     * Tree traversal in pre-order
     *
     * @return   the tree in pre-order
     */
    abstract String preOrderString();
    /**
     * Tree traversal in order
     *
     * @return   the tree in order
     */
    abstract String postOrderString();
    /**
     * Tree traversal in post-order
     *
     * @return   the tree in post-order
     */
    abstract String inOrderString();
    /**
     * Empty the tree
     */
    abstract void empty();
    /**
     * Determine if the tree is empty
     * 
     * @return  if the tree is empty
     */
    abstract boolean isEmpty();
}
