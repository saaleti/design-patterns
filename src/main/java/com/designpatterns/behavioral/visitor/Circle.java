package com.designpatterns.behavioral.visitor;

public class Circle implements Element {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return this.radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
