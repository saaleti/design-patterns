package com.designpatterns.behavioral.visitor;

public class VisitorPatternTestDrive {
    public static void main(String[] args) {
        Element circle = new Circle(10);
        AreaCalculator areaCalculator = new AreaCalculator();
        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        circle.accept(areaCalculator);
        circle.accept(perimeterCalculator);
    }
}
