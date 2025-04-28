package com.designpatterns.structural.decorator;

public class CheeseToppingDecorator extends  PizzaDecorator{

    public CheeseToppingDecorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public float cost() {
        return basePizza.cost()+10.0f;
    }
}
