package com.foxminded.isaev.composite.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeTest {

    @Test
    public void shouldIncrement() {
        var node = new Node(1);
        node.addLeaf(2);
        node.addNode(3)
                .addLeaf(4);
        node.increment();
        assertEquals(14, node.sum());
    }

    @Test
    public void shouldDecrement() {
        var node = new Node(1);
        node.addLeaf(2);
        node.addNode(3)
                .addLeaf(4);
        node.decrement();
        assertEquals(6, node.sum());
    }

    @Test
    public void shouldCalculateSum() {
        var node = new Node(5);
        node.addLeaf(5);
        assertEquals(10, node.sum());
    }

    @Test
    public void shouldRemoveChild() {
        var node = new Node(5);
        var leaf = node.addLeaf(5);
        assertEquals(10, node.sum());
        node.remove(leaf);
        assertEquals(5, node.sum());
    }

    @Test
    public void shouldChangeNodeValue() {
        var node = new Node(5);
        assertEquals(5, node.getValue());
        node.setValue(10);
        assertEquals(10, node.getValue());
    }

}
