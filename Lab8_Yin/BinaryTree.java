
/**
 * A outline of BinaryTree
 * TREE of TRAINS!!!!!!!!
 *
 * @author Zeppelin The Train Conductor
 * @version 0.114514T(T for TRAIN)
 */
public abstract class BinaryTree<E extends Comparable<E>>  implements Tree<E>
{

    // the root
    protected BinaryNode n;

    /**
     * Determine the numebr of element at a specific depth in the tree
     *
     * @param  i the depth to look for elements
     * @return   the number of elements at that depth
     */
    public int numOfElementsDepth(int i){
        if(n!=null)
        return numOfElementsDepth(0,i,n);
        return 0;
    }

    //The actual method calculating depth using recursion
    private static int numOfElementsDepth(int depT, int depF, BinaryNode nT){
        int num=0;
        //If it is at the same depth, plus one
        if(depT==depF){
            return 1;
        }
        //If the branches are not null, do recursions
        if(nT.left!=null){
            num+= numOfElementsDepth(depT+1,depF,nT.left);
        }
        if(nT.right!=null){
            num+= numOfElementsDepth(depT+1,depF,nT.right);
        }
        //return the number of elements found
        return num;
    }

    /**
     * Tree traversal in pre-order
     *
     * @return   the tree in pre-order
     */
    public String preOrderString(){
        if(n!=null)
            return preOrderString(n);
        return "";
    }

    //The actual method method doing traversal in pre-order
    private static String preOrderString(BinaryNode nT){
        String temp ="";
        //add the root element to the string
        temp+=nT.element.toString();
        //If the branches are not null, add them to the string uisng recursion
        if(nT.left!=null){
            temp+=(preOrderString(nT.left));
        }
        if(nT.right!=null){
            temp+=(preOrderString(nT.right));
        }
        //return the summed string
        return temp;
    }

    /**
     * Tree traversal in order
     *
     * @return   the tree in order
     */
    public String postOrderString(){
        if(n!=null)
            return postOrderString(n);
        return "";
    }

    //The actual method method doing traversal in post-order
    private static String postOrderString(BinaryNode nT){
        String temp ="";
        //If the branches are not null, add them to the string uisng recursion
        if(nT.left!=null){
            temp+=(postOrderString(nT.left));
        }
        if(nT.right!=null){
            temp+=(postOrderString(nT.right));
        }
        //add the root element to the string
        temp+=nT.element.toString();
        //return the summed string
        return temp;
    }

    /**
     * Tree traversal in post-order
     *
     * @return   the tree in post-order
     */
    public String inOrderString(){
        if(n!=null)
            return inOrderString(n);
        return "";
    }

    //The actual method method doing traversal in order
    private static String inOrderString(BinaryNode nT){
        String temp ="";
        //If the left branch is not null, add it to the string uisng recursion
        if(nT.left!=null){
            temp+=(inOrderString(nT.left));
        }
        //add the root element to the string
        temp+=nT.element.toString();
        //If the right branch is not null, add it to the string uisng recursion
        if(nT.right!=null){
            temp+=(inOrderString(nT.right));
        }
        //return the summed string
        return temp;
    }

    /**
     * Empty the tree
     */
    public void empty(){
        n=null;
    }

    /**
     * Determine if the tree is empty
     * 
     * @return  if the tree is empty
     */
    public boolean isEmpty(){
        return n==null;
    }
}
