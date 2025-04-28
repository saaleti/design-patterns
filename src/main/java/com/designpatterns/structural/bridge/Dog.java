package com.designpatterns.structural.bridge;

public class Dog extends LivingThing {
    public Dog(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    public void breathe() {
        System.out.println(" Dog is breathing");
        breatheImplementor.breathe();
    }
}
