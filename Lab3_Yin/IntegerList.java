
/**
 * A special list containing integers
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class IntegerList extends IntegerListADT
{
    // instance variables - replace the example below with your own
    private Cell root;

    /**
     * Constructor for objects of class IntegerList
     */
    public IntegerList()
    {
        root = null;
    }

    /**
     * Add one value to the first null next in root
     * Initialize root if root is null
     *
     * @param Integer x the value to add in
     * @return    nothing
     */
    public void append(Integer x)
    {
        //Initialize the root if it is null
        if(isEmpty()){
            root=new Cell(x);
            return;
        }
        root.append(x);
    }
    
    /**
     * Return the numbers stored in cell and its nexts
     * Return empty string if root is null
     *
     * @param no parameter
     * @return    the list in string form
     */
    public String toString(){
        //return nothing if it is empty
        if(isEmpty()){
            return "";
        }
        else
        return root.toString();
    }
    
    /**
     * Determine if the list is empty
     *
     * @param No parameter
     * @return    true if root is null and false if root is not null
     */
    public boolean isEmpty(){
        //return true if it is empty
        if(root==null){
            return true;
        }
        return false;
    }
}
