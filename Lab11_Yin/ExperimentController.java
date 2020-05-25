import java.util.*;
import java.io.*;
/**
 * Write a description of class ExperimentController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExperimentController
{
    public static void main(String args[]){
        //Add run time
        for(int i=30000;i<160000;i+=30000){
            System.out.println(i);
            for(int j=1000;j<200000;j*=10){
                double time=0;
                for(int k=0;k<10;k++){
                    time+=timeInsert(i,1,j);
                }
                System.out.println(time/10);
            }
        }
        //Successful Search Run time
        for(int i=30000;i<160000;i+=30000){
            System.out.println(i);
            for(int j=1000;j<200000;j*=10){
                double time=0;
                for(int k=0;k<10;k++){
                    time+=timeFind(i,1,j,false);
                }
                System.out.println(time/10);
            }
        }
        //Unsuccessful Search Run time
        for(int i=30000;i<160000;i+=30000){
            System.out.println(i);
            for(int j=1000;j<200000;j*=10){
                double time=0;
                for(int k=0;k<10;k++){
                    time+=timeFind(i,1,j,true);
                }
                System.out.println(time/10);
            }
        }
    }
    //Run time test of insertion
    private static long timeInsert(int nOI, int seed, int hSize){
        MyHashTable ht=new MyHashTable(hSize);
        ArrayList<Student> a =read(nOI);
        long start = System.currentTimeMillis();
        for(Student s:a){
            ht.insert(s);
        }
        long end = System.currentTimeMillis();
        return end-start;
    }
    
    //Run time test of search
    private static long timeFind(int nOI, int seed, int hSize, boolean un){
        //Create a table
        MyHashTable ht=new MyHashTable(hSize);
        ArrayList<Student> a =read(nOI);
        ArrayList<String> ids= readID(nOI,un);
        for(Student s:a){
            ht.insert(s);
        }
        //Search from the array
        long start = System.currentTimeMillis();
        for(String id:ids){
            ht.get(id);
        }
        long end = System.currentTimeMillis();
        return end-start;
    }
    
    //Read students from the local csv file
    private static ArrayList<Student> read(int nOI){
        ArrayList<Student> sL= new ArrayList<Student>();
        try{
            Scanner fR=new Scanner(new FileReader("L_numbers.csv"));
            Scanner lR =null;
            int i =0;
            //Read line by line, then word by word
            while(fR.hasNextLine()&&i<nOI){
                lR=new Scanner(fR.nextLine());
                while(lR.hasNext()){
                    //Split time through ","
                    String[]a=lR.next().split(",");
                    sL.add(new Student(a[2],a[1],a[0]));
                }
                i++;
            }
            fR.close();
            lR.close();
        }
        catch(Exception e){
            System.out.println("Something's wrong");
        }
        return sL;
    }
    //Read students' IDs from the local csv file
    private static ArrayList<String> readID(int nOI, boolean un){
        ArrayList<String> sL= new ArrayList<String>();
        try{
            Scanner fR=new Scanner(new FileReader("L_numbers.csv"));
            Scanner lR =null;
            int i =0;
            //Read line by line, then word by word
            while(fR.hasNextLine()&&i<nOI){
                lR=new Scanner(fR.nextLine());
                while(lR.hasNext()){
                    //Split time through ","
                    String[]a=lR.next().split(",");
                    if(un){
                        a[0]=a[0].substring(1);
                        
                    }
                    sL.add(a[0]);
                }
                i++;
            }
            fR.close();
            lR.close();
        }
        catch(Exception e){
            System.out.println("Something's wrong");
        }
        return sL;
    }
}
