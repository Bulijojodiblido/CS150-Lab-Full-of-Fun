import java.util.*;
import java.lang.Integer;
/**
 * A SLL to contain Integers
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class MyListIntegerContainer 
{
    private MyLinkedList<Integer> list = new MyLinkedList();
    /**
     * This method add values to the last position of the list
     * @param  a the value to add
     * @return    nothing
     */
    public void addToBack(Integer a){
        list.addEnd(a);
    }

    /**
     * This method add values to the first position of the list
     * @param  a the value to add
     * @return    nothing
     */
    public void addToFront(Integer a){
        list.addFirst(a);
    }

    /**
     * This method search the index of the first required element in the list
     * It uses enhanced for loop
     * @param  find the Integer to find
     * @return    the location of the first integer that equals to find
     */
    public int searchWithIterator(Integer find){
        if(!list.isEmpty()){
            int loc = 0;
            for(Integer a: list){
                if(a.compareTo(find)==0){
                    return loc;
                }
                loc++;
            }
        }
        return -1;
    }

    /**
     * This method search the index of the first required element in the list
     * It uses get method
     * @param  find the Integer to find
     * @return    the location of the first integer that equals to find
     */
    public int searchWithoutIterator(Integer find){
        if(!list.isEmpty()){
            int loc = 0;
            while(loc<list.getSize()){
                if(list.get(loc).compareTo(find)==0){
                    return loc;
                }
                loc++;
            }
        }
        return -1;
    }

    /**
     * This method convert the linked list to a string
     * @param  nothing
     * @return    the list as a string
     */
    public String toString(){
        String output="";
        for(Integer a : list){
            output+=a;
        }
        return output;
    }
    
    /**
     * This method return the elelment at a specific location
     * @param  index in the lisy
     * @return    the element in the list
     */
    public int getNum(int index){
        return(list.get(index));
    }
}
