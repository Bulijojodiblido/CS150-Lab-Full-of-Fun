import java.util.*;
import java.io.*;
/**
 * Write a description of class DirectedGraph here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DirectedGraph<K>
{
    public static void main(String[] args) throws IOException{
        DirectedGraph<Integer> graph = new DirectedGraph<Integer>();
        Scanner scan = new Scanner(new File("input.txt"));
        Scanner lR = new Scanner(scan.nextLine());
        //Scan and add the nodes
        while(lR.hasNext()){
            graph.addNode(lR.nextInt());
        }
        //Scan and add the edges
        while(scan.hasNextLine()){
            lR = new Scanner(scan.nextLine());
            int i1= lR.nextInt();
            int i2=lR.nextInt();
            int w=lR.nextInt();
            graph.addEdge(i1,i2,w);
        }
        graph.dijkstra(1);
        ArrayList list = graph.nodes;
        list.sort(new DistComp());
        System.out.println(list);
    }

    // All the nodes
    private ArrayList<DirectedGraphNode> nodes;
    //Infinity
    private final static int INF = Integer.MAX_VALUE-200000;

    /**
     * DirectedGraph Constructor
     *
     */
    public DirectedGraph(){
        nodes = new ArrayList<DirectedGraphNode>();
    }

    /**
     * Add an unique node to the graph
     *
     * @param k the key to add
     * @return if the addition is successful
     */
    public boolean addNode(K k){
        if(k!=null){
            if(!nodes.contains(new DirectedGraphNode<K>(k))){
                nodes.add(new DirectedGraphNode<K>(k));
                return true;
            }
        }
        return false;
    }

    /**
     * Add a directed edge between two nodes
     *
     * @param k1 the start node
     * @param k2 the end node
     * @param w the weight of the edge
     * @return if the addition is successful
     */
    public boolean addEdge(K k1, K k2, int w){
        int start = nodes.indexOf(new DirectedGraphNode<K>(k1));
        int end = nodes.indexOf(new DirectedGraphNode<K>(k2));
        if(start>=0&&end>=0){
            DirectedGraphNode n1 = nodes.get(start);
            DirectedGraphNode n2 = nodes.get(end);
            DirectedGraphEdge e = new DirectedGraphEdge(n1,n2,w);
            int eIndex = n1.edges.indexOf(e);
            if(eIndex>=0){
                ((DirectedGraphEdge)n1.edges.get(eIndex)).weight=w;
            }
            else
                n1.edges.add(e);
            return true;
        }
        return false;
    }

    /**
     * The Dijkstra Traversal
     *
     * @param k1 A parameter
     */
    public void dijkstra(K k1){
        int indexN =  nodes.indexOf(new DirectedGraphNode<K>(k1));
        if(indexN>=0){
            DirectedGraphNode start = nodes.get(indexN);
            //Set the distance of the starting node to 0
            start.distance =0;
            PriorityQueue<DirectedGraphNode> list = new PriorityQueue(new DistComp());
            list.add(start);
            //Set the other nodes' distance to infinity
            //Add them to the priority queue
            for(DirectedGraphNode node: nodes){
                if(!node.equals(start)){
                    node.distance = INF;
                    list.add(node);
                }
            }
            //Poll the nodes out of the priority queue
            //Calculate the distance from each node's neighbors to the starting node
            while(!list.isEmpty()){
                DirectedGraphNode node = list.poll();
                for(DirectedGraphEdge edge:(ArrayList<DirectedGraphEdge>)node.edges){
                    int tempDis = edge.start.distance+edge.weight;
                    //If the new distance is smaller than the old one
                    //renew it
                    if(edge.end.distance>tempDis){
                        edge.end.distance=tempDis;
                    }
                }
            }
        }
    }

    /**
     * Get the outgoing edges of one node
     *
     * @param k the key of the node to search for
     * @return the list of edges
     */
    public ArrayList getEdges(K k){
        int i= nodes.indexOf(new DirectedGraphNode<K>(k));
        if(i>-1){
            DirectedGraphNode n =nodes.get(i);
            return n.edges;
        }
        return null;
    }
    
    /**
     * Get the outgoing nodes of one node
     *
     * @param k the key of the node to search for
     * @return the list of nodes
     */
    public ArrayList getNeighbors(K k){
        int i= nodes.indexOf(new DirectedGraphNode<K>(k));
        if(i>-1){
            DirectedGraphNode n =nodes.get(i);
            ArrayList<DirectedGraphNode>a=new ArrayList<DirectedGraphNode>();
            for(DirectedGraphEdge edge: (ArrayList<DirectedGraphEdge>)n.edges){
                a.add(edge.end);
            }
            return a;
        }
        return null;
    }

    /**
     * Get the weight of a specific edge
     *
     * @param k the key of the node to search for
     * @param i the index of the edge
     * @return the weight of that specific edge
     */
    public int getWeight(K k,int i){
        ArrayList a = getEdges(k);
        if(((DirectedGraphEdge)a.get(i))!=null)
        return ((DirectedGraphEdge)a.get(i)).weight;
        return -1;
    }
    //Node
    private static class DirectedGraphNode<K>{
        K key;
        int distance;
        ArrayList<DirectedGraphEdge> edges;
        /**
         * DirectedGraphNode Constructor
         *
         * @param key the key of this node
         */
        public DirectedGraphNode(K key){
            this.key=key;
            edges=new ArrayList<DirectedGraphEdge>();
        }

        /**
         * Determine if two nodes are the same
         *
         * @param b the node to compare with
         * @return if they are the same node
         */
        public boolean equals(Object b){
            return key.equals(((DirectedGraphNode)b).key);
        }

        /**
         * express node is a string
         *
         * @return string expression of the node
         */
        public String toString(){
            return key.toString() + " " + distance;
        }
    }
    //Edge
    private static class DirectedGraphEdge{
        DirectedGraphNode start;
        DirectedGraphNode end;
        public int weight;
        /**
         * DirectedGraphEdge Constructor
         *
         * @param a the starting node
         * @param b the ending node
         * @param i the weight of this edge
         */
        public DirectedGraphEdge(DirectedGraphNode a,DirectedGraphNode b, int i){
            start =a;
            end=b;
            weight = i;
        }

        /**
         * Determine if two edges are the same
         *
         * @param b the other edge to compare with
         * @return if the two edges are the same
         */
        public boolean equals(Object b){
            return start.equals(((DirectedGraphEdge)b).start)&&
            end.equals(((DirectedGraphEdge)b).end);
        }
    }
    //Distance comparator
    private static class DistComp implements Comparator<DirectedGraphNode>{
        /**
         * comapre the distance of two nodes
         *
         * @param a node 1
         * @param b node to compare with node 1
         * @return difference between distance of a and b
         */
        public int compare(DirectedGraphNode a, DirectedGraphNode b){
            return new Integer(a.distance).compareTo(new Integer(b.distance));
        }
    }
}
