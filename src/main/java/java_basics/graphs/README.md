## Searches
Finding which vertices can be reached from a specific vertex

### Depth-First Search
The algorithm starts at the root node and explores as far as possible along
each branch before backtracking

Uses a **stack** to remember where it should go when it reaches a dead end
The contents of the stack is the route taken from the starting
point to the current vertex

### Breadth-First Search
Visits all the vertices adjacent to the starting vertex, and only
then goes further afield. 

Uses a **queue** instead of a stack
At each moment, the queue contains the vertices that have been visited 
but whose neighbors have yet been fully exposed 

Good for finding shortest paths. When you find the specified
vertex, you know the path you've traced so far is the shortest
(If there were a shorter path, the BFS would have found it
already.).