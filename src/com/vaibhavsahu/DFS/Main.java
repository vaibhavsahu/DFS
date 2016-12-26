package com.vaibhavsahu.DFS;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();

        vertex vertex1 = new vertex(1);
        vertex vertex2 = new vertex(2);
        vertex vertex3 = new vertex(3);
        vertex vertex4 = new vertex(4);
        vertex vertex5 = new vertex(5);

        //prepare adjacancy list of vertices

        vertex1.addNeighbor(vertex2);
        vertex1.addNeighbor(vertex3);
        vertex2.addNeighbor(vertex4);
        vertex2.addNeighbor(vertex5);

        //run bfs on the graph

        depthFirstSearch.doDFS(vertex1);

    }
}
