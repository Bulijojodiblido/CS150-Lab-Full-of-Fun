
/**
 * Nodoes that store values
 *
 * @author Zeppelin
 * @version 0.114514
 */
public class BinaryNode<T>
{
    // Constructors
    BinaryNode( T theElement )
    {
        this( theElement, null, null );
    }

    private BinaryNode( T theElement, BinaryNode<T> lt, BinaryNode<T> rt )
    {
        if(theElement!=null){
        element = theElement; 
        left = lt; 
        right = rt;
    }
    }
    protected T element; // The data in the node
    protected BinaryNode<T> left; // Left child reference
    protected BinaryNode<T> right; // Right child reference
}
