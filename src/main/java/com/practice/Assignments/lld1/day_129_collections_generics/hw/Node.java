package com.practice.Assignments.lld1.day_129_collections_generics.hw;

import java.util.Iterator;

public class Node implements Iterable<Integer>  {
    private int data;
    private Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NodeIterator(this);
    }
    private static class NodeIterator implements Iterator<Integer> {
        private Node currentNode;
        public NodeIterator(Node startNode) {
            this.currentNode = startNode;
        }

        @Override
        public boolean hasNext() {
            return currentNode!=null;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            int data = currentNode.data;
            currentNode = currentNode.next;
            return data;
        }
    }
}