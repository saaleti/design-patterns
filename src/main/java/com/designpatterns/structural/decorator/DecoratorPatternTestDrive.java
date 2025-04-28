package com.designpatterns.structural.decorator;

public class DecoratorPatternTestDrive {
    public static void main(String[] args) {
        BasePizza basePizza = new VegDelightPizza();
        System.out.println(basePizza.cost());
        CheeseToppingDecorator cheeseToppingDecorator = new CheeseToppingDecorator(basePizza);
        System.out.println(cheeseToppingDecorator.cost());
        MushroomsToppingDecorator mushroomsToppingDecorator = new MushroomsToppingDecorator(cheeseToppingDecorator);
        System.out.println(mushroomsToppingDecorator.cost());
        MushroomsToppingDecorator mushroomsToppingDecorator2 = new MushroomsToppingDecorator(mushroomsToppingDecorator);
        System.out.println(mushroomsToppingDecorator2.cost());
    }
}
