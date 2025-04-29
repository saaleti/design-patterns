package com.designpatterns.behavioral.visitor;

public class PerimeterCalculator implements Visitor{
    @Override
    public void visit(Element element) {
        if (element instanceof Circle circle) {
            System.out.println("Perimeter of Circle is " + (2*Math.PI * circle.getRadius()));
        }
    }
}
