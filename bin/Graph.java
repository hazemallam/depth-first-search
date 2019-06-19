import java.util.Scanner;

public class Graph {
    private final int MAX_NODE = 20;
    private Node nodeList [];
    private int adjacencyMatrix [][];
    private int currentNumberOfNode;
    private Stack theStack;
    static String userString;
    static char[] userStringinput;
    
    public Graph(){
        nodeList = new Node[MAX_NODE];
        adjacencyMatrix = new int [MAX_NODE][MAX_NODE];
        currentNumberOfNode = 0;
        for(int j=0;j<MAX_NODE;j++){
            for(int k=0;k<MAX_NODE;k++){
                adjacencyMatrix[j][k]=0;
                theStack = new Stack();
            }
        }
            
        }
    public void addNode(char vertex){
        nodeList[currentNumberOfNode++] = new Node( vertex);
    }
    public void addEdge(int start, int end){
        adjacencyMatrix[start][end]=1;
        adjacencyMatrix[end][start]=1;
    }
    public void displayNode(int n){
        System.out.print(" "+nodeList[n].label);
    }
    public int getAdjacentUnvisitedNode(int n){
        
        for(int j=0;j<currentNumberOfNode;j++){
            if(adjacencyMatrix[n][j]==1 && nodeList[j].wasVisited==false){
                return j;
                
            }
        }
        return -1;
    }
    public void depth_first_search(){
    	
        nodeList[0].wasVisited= true;
        displayNode(0);
        theStack.push(0);
        while(!theStack.isEmpty()){
            int n = getAdjacentUnvisitedNode(theStack.peek());
            if(n==-1){
                theStack.pop();
                
            }
            else{
                nodeList[n].wasVisited = true;
                displayNode(n);
                theStack.push(n);
                
            }
        }
        for(int j=0;j<currentNumberOfNode;j++){
            nodeList[j].wasVisited = false;
            
        }
        
    
    	
    }
    
    }
    

