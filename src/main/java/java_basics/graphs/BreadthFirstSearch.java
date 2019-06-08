package java_basics.graphs;

class Queue {
    private final int SIZE = 20;
    private int[] queArray;
    private int front;
    private int rear;

    public Queue() {
        queArray = new int[SIZE];
        front = 0;
        rear = -1;
    }

    /** puts item at rear of queue */
    public void insert(int j) {
        if (rear == SIZE -1)
            rear = -1;
        queArray[++rear] = j;
    }

    /** take item from front of queue */
    public void remove() {
        int temp = queArray[front++];
        if (front == SIZE)
            front = 0;
        return temp;
    }

    /** true if queue is empty*/
    public boolean isEmpty() {
        return ( rear+1 == front || front+SIZE-1 == rear);
    }

}


class Vertex {
    public char label;
    public boolean wasVisited;

    public Vertex(char lab) {
        label = lab;
        wasVisited = false;
    }
}


class Graph {
    public final int MAX_VERTS = 20;
    public Vertex vertexList[];
    private int adjMat[][];      // adjacency matrix
    private int nVerts;          // current number of vertices
    private Queue theQueue;

    public Graph() {
        vertextList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nverts = 0;
        for (int j = 0; j < MAX_VERTS; j++)
            for (int k = 0; k < MAX_VERTS; k++)
                adjMat[j][k] = 0;
        theQueue = new Queue();
    }

    public void addVertex(char label) {
        vertexList[nVerts++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }

    /**Breadth-First Search*/
    public void bfs() {
        vertexList[0].wasVisited = true;    //mark it
        displayVertex(0);
        theQueue.insert(0);
        int v2;

        while( !theQueue.isEmpty() ) {
            int v1 = theQueue.remove();     //remove vertex at head
            //until no unvisited neighbors
            while( (v2=getAdjUnvisitedVertex(v1)) != -1) {
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                theQueue.insert(v2);
            }
        }

        // queue is empy, so we're done. reset for next time
        for (intj=0; j<nVerts; j++) {
            vertexList[j].wasVisited = false;
        }
    }

    /** returns an unvisited vertex next to v */
    public int getAdjUnvisitedVertex(int v) {
        for (int j=0; j<nVerts; j++) {
            if (adjMat[v][j] == 1 && vertexList[j].wasVisited==false)
                return j;
            return -1;
        }
    }
}

class DFSApp {
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');
        theGraph.addEdge(0, 1);
        theGraph.addEdge(1, 2);
        theGraph.addEdge(0, 3);
        theGraph.addEdge(3, 4);

        System.out.print("Visits: ");
        theGraph.dfs();
        System.out.println();
    }
}
