
/**
 * Word with the number of occurrance
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class WordCount implements Comparable<WordCount>
{
    String word;
    int count;
    
    /**
     * WordCount Constructor
     *
     * @param w the word
     * @param c the number of occurance
     */
    public WordCount(String w, int c){
        word = w;
        count = c;
    }
    
    /**
     * Compare two Entries
     *
     * @param b The other Entry to comapre with
     * @return Their difference
     */
    public int compareTo(WordCount b){
        return word.compareTo(b.word);
    }
    
    /**
     * Convert this entry into a string
     *
     * @return This Entry in string form
     */
    public String toString(){
        return word+" "+count;
    }
}
