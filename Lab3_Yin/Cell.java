/**
 * A list where every object is linked to the previous one
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class Cell
{
    //The Integer stored by the first cell
    private Integer val;
    //The next cell to store value
    private Cell next;
    
    public static void main(String[] args){}
    
    /**
     * Constructor for objects of class Cell
     */
    public Cell(Integer a)
    {
        val =a;
    }
    
    /**
     * A method adding Integers into the next null Cell object
     *
     * @param  x the value to add
     * @return nothing
     */
    public void append(Integer x){
        //If the first null next is found initialize it
        //otherwise to into the recursion of next until
        //the first empty next is found
        if(next==null){
            next=new Cell(x);
        }
        else{
            next.append(x);
        }
    }
    /**
     * A method adding Integers into the next null Cell object
     *
     * @param  none
     * @return all the Integers in the non empty cells in a string
     */
    public String toString(){
        //If the next is null, just return the val
        //Otherwise return the val plus
        //The result of next's toString
        //The method do recursion until 
        //The cell with null next appears
        if(next==null){
            return val.toString();
        }
        else{
            return val.toString() + next.toString();
        }
    }
    
}
