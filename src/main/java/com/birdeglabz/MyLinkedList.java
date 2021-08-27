package com.birdeglabz;

public class MyLinkedList {
    static class Node {
        Node prev, next;
        T    data;

        Node(Node p, Node n, T d){
            next = n;
            prev = p;
            data = d;
        }
    }

    public void insert(T d){
        if(empty()){
            push_front(d);
            return;
        }
        for (Node<T> node = first;node.next != null; node = node.next) {
            // if less than we need to insert before.
            if (d.compareTo(node.data) < 0) {
                if (node == first) {
                    first = new Node(null, first, d);
                    node.prev = first;
                } else {
                    node = new Node(node.prev, node, d);
                    node.prev.next = node;
                }
                return;

    private static class node<T> implements Comparable<T> {
        node<T> next;
        node<T> prev;
        T data;

        node(node<T> p, node<T> n, T d) {
            next = n;
            prev = p;
            data = d;
        }

        public int compareTo(T o) {
            return ((Comparable<T>) this.data).compareTo(o);
        }
    }
}
