import java.util.*;
/**
 * Calculate the occurrance of words
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class WordFreqs
{
    PriorityQueue<WordCount> wordQueue= 
        new PriorityQueue<WordCount>();

    /**
     * WordFreqs Constructor
     *
     * @param words The TreeMultiSet to convert from
     */
    public WordFreqs(TreeMultiSet words)
    {
        TreeMap<String,Integer> book =words.index;
        for(String word:book.keySet()){
            wordQueue.add(new WordCount(word,book.get(word)));
        }
    }

    /**
     * Get the top n most common words
     *
     * @param n The numebr of most common words
     * @return A list of the most common words
     */
    public LinkedList<WordCount> mostCommon(int n){
        if(!wordQueue.isEmpty()){
        PriorityQueue<WordCount> temp = 
            new PriorityQueue<WordCount>(new repComp());
        for(WordCount tempW : wordQueue){
            temp.add(tempW);
        }
        LinkedList<WordCount> most = new LinkedList<WordCount>();
        for(int i =0; i<n;i++){
            most.add(temp.poll());
        }
        return most;
    }
    return new LinkedList<WordCount>();
    }
    
    //Compare WordCount objects using occurrance
    private static class repComp implements Comparator<WordCount>{
        public int compare(WordCount a, WordCount b){
            return new Integer(b.count).compareTo(a.count);
        }
    }
}
