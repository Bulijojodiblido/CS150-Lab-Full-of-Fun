
/**
 * This class create a object carrying an integer array list and modify 
 * the values of that integer arrayList
 *
 * @Zeppelin Yin
 */
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Number;
public class RandomIntegerContainer
{
    private ArrayList<Integer>a;
    /**
     * Constructor for objects of class RandomIntegerContainer
     */
    public RandomIntegerContainer()
    {
        // initialise instance variables
        a = new ArrayList<Integer>();
    }
    /**
     * This method adds values to the front of the array list
     */
    public void addToFront(int x){
        //Avoid out of bound error if the array is empty at first
        if(a.isEmpty()){
            a.add(x);
        }
        //Add to the front
        else
            a.add(0,x);
    }
    /**
     * This method adds values to the back of the array list
     */
    public void addToBack(int x){
        //Add to the back
        a.add(x);
    }
    /**
     * This method adds values to a sorted array list and still make the 
     * array list sorted
     */
    public void addSorted(int x){
        //If it is not empty, to the following operetion
        if(!a.isEmpty()){
            //add to the back if x is the biggest
            if(a.get(0)>=x){
                a.add(0,x);
            }
            //add to the front if it is the smallest
            else if(a.get(a.size()-1)<=x){
                a.add(x);
            }
            //add to the middle if it is the middle values
            else
            for(int i = a.size()-1; i>0; i--){
                if(x<a.get(i)&&x>a.get(i-1)){
                    a.add(i,x);
                }
            }

        }
        //Add to the back if the array is empty
        else{
            a.add(x);
        }
    }  
    /**
     * This method product the first element of a sorted array list and still
     * make the array list sorted
     */
    public void productSorted(int x){
        //Do the product if the array is not empty
        if(!a.isEmpty()){
            int temp = x*a.get(0);
            a.remove(0);
            addSorted(temp);
        }
    }
    /**
     * This method sorts the array list
     */
    public void selectionSort(){
        int temp = 0;
        int loc =0;
        for(int i =0; i< a.size()-1;i++){
            loc = i;
            //compare if the following values are smaller
            for(int j = i+1; j<a.size(); j++){
                if(a.get(loc)>a.get(j)){
                    loc = j;
                }
            }
            //switch the values
            temp = a.get(loc);
            a.set(loc,a.get(i));
            a.set(i,temp);
        }

    }
    /**
     * This method convert the array list to an int array
     */
    public int[] toArray(){
        int[] temp = new int[a.size()];
        for(int i = 0; i<temp.length;i++){
            temp[i]=a.get(i);
        }
        return temp;
    }

}
