//This Iterator is a inner class of MyLinked List
import java.util.*;
/**
 * A Iterator for MyLinkedList
 *
 * @author Yin Zheping
 * @version 0.114514
 */
public class MyLinkedListIterator<E> implements Iterator<E>{
    E temp;
    Cell<E> copy;
    public MyLinkedListIterator (Cell inPut){
        copy = inPut;
    }

    public boolean hasNext(){
        return copy!=null;
    }

    public E next(){
        temp = copy.val;
        copy=copy.next;
        return temp;
    }
}