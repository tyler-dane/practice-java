package java_basics.graphs;

/**
 * Depth-First Search uses a *stack* to remember where it should go when it reaches a dead end
 *
 * RULE 1: If possible, visit an adjacent unvisited vertext, mark it, and push it on the stack
 * RULE 2: If you can't follow Rule 1, then, if possible, pop a vertex off the stack
 * RULE 3: If you can't follow Rule 1 or 2, you're done.
 * */
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
    public BVertex BVertexList[];
    private int adjMat[][];      // adjacency matrix
    private int nVerts;          // current number of vertices
    private  StackX theStack;

    public Graph() {
        //vertextList = new BVertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        int nverts = 0;
        for(int j=0; j<MAX_VERTS; j++)
            for(int k=0; k<MAX_VERTS; k++)
                adjMat[j][k] = 0;
        theStack = new StackX();
    }

    public void addVertex(char label) {
        BVertexList[nVerts++] = new BVertex(label);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v) {
        System.out.print(BVertexList[v].label);
    }

    public void dfs() {
        // use vertex 0 to initialize
        BVertexList[0].wasVisited = true;
        displayVertex(0);
        theStack.push(0);

        while( !theStack.isEmpty() ) {
            // get an unvisited vertex adjacent to stack top
            int v = getAdjUnvisitedVertex( theStack.peek() );

            // pop if no such vertex (see RULE 2)
            if (v == -1)
                theStack.pop();
            else {
                BVertexList[v].wasVisited = true;    // mark it
                displayVertex(v);
                theStack.push(v);
            }
        }

        // stack is empty, so end search
        for (int j=0; j<nVerts; j++) // reset flags for next search
            BVertexList[j].wasVisited = false;
    }

    /**returns an unvisited vertex adjacent to v*/
    public int getAdjUnvisitedVertex(int v) {
        for (int j=0; j<nVerts; j++)
            if (adjMat[v][j]==1 && BVertexList[j].wasVisited == false)
                return j;
        return -1;
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

class StackX {
    private final int SIZE = 20;
    private int[] st;
    private int top;

    public StackX() {
        st = new int[SIZE];
        top = -1;
    }

    /** put item onto top of stack*/
    public void push(int j) {
        st[++top] = j;
    }

    /** remove top item from stack*/
    public int pop() {
        return st[top--];
    }

    /** return item at top of stack*/
    public int peek() {
        return st[top];
    }

    /**true if nothing on stack*/
    public boolean isEmpty() {
        return (top == -1);
    }
}
