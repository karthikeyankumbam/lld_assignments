package com.practice.Assignments.lld1.day124.hw.loopablenode;

import java.util.Iterator;


public class Node implements Iterable<Node> {
    public Node(int n) {
        this.data = n;
        this.next = null;
    }

    public Node(int n, Node node) {
        this.data = n;
        this.next = node;
    }

    int data;
    Node next;

    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }

    public static class NodeIterator implements Iterator<Node> {
        Node root;

        NodeIterator(Node root) {
            this.root = root;
        }

        @Override
        public boolean hasNext() {
            return root != null;
        }

        @Override
        public Node next() {
            Node temp = root;
            root = root.next;
            return temp;
        }
    }
}