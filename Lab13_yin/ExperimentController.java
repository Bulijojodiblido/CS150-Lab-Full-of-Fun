import java.util.*;
import java.io.*;
/**
 * Where experiments are conducted
 *
 * @author Yin Zheping the Big Scientist
 * @version 0.114514
 */
public class ExperimentController
{
    static ArrayList<String> dictionary = dictionary();
    public static void main(String[] args){
        FileProcess fp = new FileProcess(args[0]);
        TreeMultiSet<String> tree = new TreeMultiSet<String>();
        //Initialize the tree
        for(String[] line:fp.pollWords()){
            for(String word:line){
                if(!word.equals("")&&!word.contains(" "))
                    tree.add(word);
            }
        }
        WordFreqs counting = new WordFreqs(tree);
        System.out.println(counting.mostCommon(Integer.parseInt(args[1])));
    }


    //Read the dictionary and convert it into an arraylist of words
    private static ArrayList<String> dictionary(){
        ArrayList<String> a = new ArrayList();
        try{
            Scanner fR = new Scanner(new File("English.txt"));
            while(fR.hasNextLine()){
                Scanner lR=new Scanner(fR.nextLine());
                a.add(lR.next());
                lR.close();
            }
            fR.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        return a;
    }

    /**
     * Process books into arrays
     *
     * @author Yin Zheping the Librarian
     * @version 0.114514
     */
    private static class FileProcess
    {
        int lineNumber;
        Scanner fR;
        ArrayList<String[]> allWords;

        /**
         * FileProcess Constructor
         *
         * @param a The book name
         */
        public FileProcess(String a)
        {
            try{
                allWords= new ArrayList<String[]>();
                fR=new Scanner(new FileReader(a));
            }
            catch(Exception e){
                System.out.println(e.toString());
            }
        }

        /**
         * convert words into an ArrayList of String arrays 
         *
         * @return the book in an ArrayList of String arrays 
         */
        public ArrayList<String[]> pollWords()
        {
            while(fR.hasNextLine()){
                String line = fR.nextLine();
                line=line.toLowerCase();
                allWords.add( line.split("[^A-Za-z]"));
            }
            return allWords;
        }
    }

}
