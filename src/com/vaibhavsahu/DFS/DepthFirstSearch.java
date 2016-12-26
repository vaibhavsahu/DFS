package com.vaibhavsahu.DFS;

import java.util.Stack;

/**
 * Created by vaibhavsahu on 12/25/16.
 */

//DFS implementation - STACK
public class DepthFirstSearch {

    private Stack<vertex> stack;

    public DepthFirstSearch(){
        this.stack  = new Stack<>();
    }

    public void doDFS(vertex source){

        //use stack
        stack.add(source);
        source.setVisited(true);

        while (!stack.isEmpty()){
            vertex actualVertex = stack.pop();

            System.out.println(actualVertex.getData());

            for (vertex v : actualVertex.getNeighborList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    v.setPredecessor(actualVertex);
                    stack.push(v);
                }
            }
        }


    }
}
