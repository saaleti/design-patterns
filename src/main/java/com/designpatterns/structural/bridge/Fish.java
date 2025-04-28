package com.designpatterns.structural.bridge;

public class Fish extends LivingThing {
    public Fish(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    public void breathe() {
        System.out.println(" Fish is breathing");
        breatheImplementor.breathe();
    }
}
