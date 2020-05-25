import java.lang.*;
import java.util.*;
/**
 * The class showing the tree
 *
 * @author Zeppelin the Train Conductor
 * @version 0.114514T(T for Train!!!)
 */
public class MainClass
{
    public static void main(String[] args){
        int tI=0;
        BinaryTree<Integer> t = new BinarySearchTree<Integer>();
        //Insert elements to the tree with the corresponding command given

        for(String a : args){
            try{
                tI=Integer.parseInt(a);
                t.insert(Integer.parseInt(a));
            }
            catch(IllegalArgumentException e){
                System.out.println("Duplicate occurs, redo the ");
            }
        }

        //The searches
        System.out.println("Search the existing integer: "+tI);
        System.out.println(tI+" is in the tree: "+t.contains(tI));
        Random r = new Random(0);
        int rI = 0;
        while(t.contains(rI)){
            rI=r.nextInt();
        }
        System.out.println("Search " + rI +" that is not in the tree");
        System.out.println(rI+" is in the tree: "+t.contains(rI));
        //The number of elements at a certain depth 
        int dep = 2;
        System.out.print("the number of elements at depth "+ dep+" is ");
        System.out.println(t.numOfElementsDepth(dep));
        //The max and min
        System.out.println("Max Val is: "+t.findMax());
        System.out.println("Min Val is: "+t.findMin());
        //The traversals
        System.out.println("Inorder Traversel");
        System.out.println(t.inOrderString());
        System.out.println("Preorder Traversel");
        System.out.println(t.preOrderString());
        System.out.println("Postorder Traversel");
        System.out.println(t.postOrderString());
        //the empty method
        System.out.print("Is the tree empty: ");
        System.out.println(t.isEmpty());
        System.out.println("Now empty the tree");
        System.out.print("Is the tree empty: ");
        t.empty();
        System.out.println(t.isEmpty());

    }
}
