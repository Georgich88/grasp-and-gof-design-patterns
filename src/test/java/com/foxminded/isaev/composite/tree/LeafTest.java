package com.foxminded.isaev.composite.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeafTest {

    @Test
    public void shouldIncrement(){
        var leaf = new Leaf(5);
        leaf.increment();
        assertEquals(6, leaf.getValue());
    }

    @Test
    public void shouldDecrement(){
        var leaf = new Leaf(5);
        leaf.decrement();
        assertEquals(4, leaf.getValue());
    }

    @Test
    public void  shouldCalculateSum(){
        var leaf = new Leaf(5);
        assertEquals(5, leaf.getValue());
    }

}
