



public class DepthFirst {

    
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addNode('A');   //0
        theGraph.addNode('B');   //1
        theGraph.addNode('C');   //2
        theGraph.addNode('D');   //3
        theGraph.addNode('E');   //4
   
        theGraph.addEdge(0, 1);
        theGraph.addEdge(1, 2);
        theGraph.addEdge(2, 2);
        theGraph.addEdge(2, 3);
        theGraph.addEdge(3, 4);
        System.out.println("visited states ...");
        theGraph.depth_first_search();
        
        System.out.println();
        
       
    }
    
}
