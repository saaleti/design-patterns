package com.designpatterns.structural.decorator;

public class MushroomsToppingDecorator extends  PizzaDecorator{

    public MushroomsToppingDecorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public float cost() {
        return basePizza.cost()+20.0f;
    }
}
