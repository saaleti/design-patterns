package com.designpatterns.behavioral.visitor;

public class AreaCalculator implements Visitor {
    @Override
    public void visit(Element element) {
        if (element instanceof Circle circle) {
            System.out.println("Area of Circle is " + (Math.PI * circle.getRadius() * circle.getRadius()));
        }
    }
}
