package com.foxminded.isaev.composite.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Node implements CalculableElement {

    private int value;
    private List<CalculableElement> childElements = new ArrayList<CalculableElement>();

    public Node(int value) {
        this.value = value;
    }

    public int sum() {
        return this.value + calculateOperationOnChildElements(CalculableElement::sum);
    }

    public int increment() {
        return ++ this.value + calculateOperationOnChildElements(CalculableElement::increment);
    }

    public int decrement() {
        return -- this.value + calculateOperationOnChildElements(CalculableElement::decrement);
    }

    private int calculateOperationOnChildElements(ToIntFunction<CalculableElement> mapper){
        int result = this.childElements.stream()
                .collect(Collectors.summingInt(mapper));
        return result;
    }

    public Leaf addLeaf(int initialValue){
        var newLeaf = new Leaf(initialValue);
        this.childElements.add(newLeaf);
        return newLeaf;
    }

    public Node addNode(int initialValue){
        var newNode = new Node(initialValue);
        this.childElements.add(newNode);
        return newNode;
    }

    public void remove(CalculableElement element) {
        this.childElements.removeIf(v -> {
            return v.equals(element);
        });
    }

    public int getValue() {
        return value;
    }

    public Node setValue(int value) {
        this.value = value;
        return this;
    }
}
