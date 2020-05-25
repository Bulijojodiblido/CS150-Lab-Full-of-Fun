import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.File;
import java.io.*;
/**
 * This program read each line of a txt file and 
 * creat display the information of each line
 * It eventually creats a "myNumber" file on
 * the same path storing the information of each line
 * @author  Zeppelin Yin
 */
public class CountWords
{
    public static void main(String[] args) throws IOException {
        CountWords happyCoding = new CountWords();
        happyCoding.run();
    }

    /**
     * This method does what the entire program is suppose to do
     */
    public void run() throws IOException
    {
        //fc reads the file
        Scanner fc=null;
        //sc reads each line of the file
        Scanner sc =null;
        //words stores the total words of each line
        int words;
        //letters stores the total letters of each line
        int letters;
        //String temp stores the temporary last word of each line
        //Meaning the String sc is currently reading
        String temp;

        //Initialize the scanners and the writer
        fc = new Scanner(new FileReader("doc.txt"));
        File result = new File("myNumbers.txt");
        PrintWriter pR = new PrintWriter(result);
        //Run the follow codes until the last line of the file is read
        while(fc.hasNextLine()){
            //reset the variables storing information of each line
            words =0;
            letters =0;
            temp = null;
            //Put the current line into sc
            sc=new Scanner(fc.nextLine());
            //Run the follow codes until each line is running out of words
            while(sc.hasNext()){
                //Add one to words at each round
                words++;
                //set temp to the latest word reading
                temp=sc.next();
                //Add letters by the length of each word read
                letters+=temp.length();
            }
            //Write the info to the file
            pR.write("Words: "+words+" Letters: "+ letters +" Last Words: "+ temp+"\r\n");
            //Print it to the window
            System.out.println("Words: "+words+" Letters: "+ letters +" Last Words: "+ temp);
        }
        //Close the scanners and writers
        sc.close();
        pR.close();
        fc.close();


    }
}
