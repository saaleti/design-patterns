package com.designpatterns.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}
