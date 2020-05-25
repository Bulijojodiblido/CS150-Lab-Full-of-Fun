import java.util.*;
/**
 * Hash Table
 * Train of Trains
 *
 * @author Yin Zheping The Train Conductor
 * @version 0.114514T(T for Trainnnn)
 */
public class MyHashTable
{
    // instance variables - replace the example below with your own
    private LinkedList<Student>[] table;

    /**
     * MyHashTable Constructor
     *
     * @param n the size of the table
     */
    public MyHashTable(int n)
    {
        table = new LinkedList[n];
    }

    /**
     * Insert a student into the hash table
     *
     * @param s the student to insert
     * @return IF the insertion is successful
     */
    public boolean insert(Student s){
        int hashIndex = s.hashCode()%table.length;
        if(hashIndex<0){
            hashIndex+=table.length;
        }
        //Initialize this list if it is null
        if(table[hashIndex]==null)
            table[hashIndex]=new LinkedList<Student>();
        if(indexOf(hashIndex,s)==-1){
            table[hashIndex].add(s);
            return true;
        }
        return false;
    }

    /**
     * Get the student with a specific ID
     *
     * @param id the ID the student have
     * @return The student wit the same ID
     */
    public Student get(String id){
        int hashIndex=id.hashCode()%table.length;
        if(hashIndex<0){
            hashIndex+=table.length;
        }
        int i=indexOf(hashIndex,new Student(id));
        if(i!=-1)
        return table[hashIndex].get(i);
        return null;
    }

    /**
     * Poll one element from the table
     *
     * @param id the ID the student have
     * @return The student wit the same ID
     */
    public Student poll(String id){
        int hashIndex=id.hashCode()%table.length;
        if(hashIndex<0){
            hashIndex+=table.length;
        }
        int i=indexOf(hashIndex,new Student(id));
        if(i==-1||table[hashIndex]==null||table[hashIndex].isEmpty())
        return null;
        return table[hashIndex].remove(i);
    }

    //Return the index of a student in the specific linkedlist
    private int indexOf(int hashIndex,Student s){
        //only search if it has been modified ever since it was created
        if(table[hashIndex]!=null)
        return table[hashIndex].indexOf(s);
        return -1;
    }

}
