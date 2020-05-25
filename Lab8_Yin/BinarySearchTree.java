
import java.lang.*;
/**
 * Write a description of class BinarySearchTree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E>
{
   
    
    //The hook for max and min fish
    private E max;
    private E min;
    /**
     * Insert a Element into the tree
     *
     * @param  e the element to insert
     * @return   if the insertion is successfule
     */
    public boolean insert(E e){
        //Change the root to the modified root
        if(e!=null){
            n = insert(n,e);
            return true;
        }
        return false;
    }
    //the actual method doing insertion using recursion
    private BinaryNode<E> insert(BinaryNode<E> nT, E e){
        //If the branch is null, initialize it
        if(nT==null){
            //If the root is null, initialize the max and min to it
            if(n == null){
                max=e;
                min =e;
            }
            //Return the current node
            return new BinaryNode(e);
        }

        //if the element is less than the current node, do recursion on the left branch
        if(e.compareTo(nT.element)<0){
            if(e.compareTo(min)<0){
                min = e;
            }
            nT.left= insert(nT.left,e);
        }

        //if the element is more than the current node, do recursion on the right branch
        else if(e.compareTo(nT.element)>0){
            if(e.compareTo(max)>0){
                max = e;
            }
            nT.right= insert(nT.right,e);
        }

        else
            throw new IllegalArgumentException();
        //return the current modified branch and everything below it
        return nT;
    }

    /**
     * Determine if the tree contain a specific element
     *
     * @param  e the element to search for
     * @return   if the tree contain such an element
     */
    public boolean contains(E e){
        if(e!=null)
        return contains(n,e);
        return false;
    }

    //Bianry Search
    private boolean contains(BinaryNode<E> nT, E e){
        if(nT!=null){
            //If the element is the same as the current node, return true
            if(nT.element.compareTo(e)==0)
                return true;
            //If it is less than the current node, go to the left branch
            else if(nT.element.compareTo(e)>0){
                return contains(nT.left,e);
            }
            //If it is more than the current node, go to the right branch
            else if(nT.element.compareTo(e)<0){
                return contains(nT.right,e);
            }
        }
        //Return false if nothing works
        return false;
    }

    /**
     * Return the largest element in the tree
     *
     * @return   the largest element in the tree
     */
    public E findMax(){
        if(n!=null)
        return max;
        return null;
    }

    /**
     * Return the smallest element in the tree
     *
     * @return   the smallest element in the tree
     */
    public E findMin(){
        if(n!=null)
        return min;
        return null;
    }
}
