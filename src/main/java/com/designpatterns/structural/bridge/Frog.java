package com.designpatterns.structural.bridge;

public class Frog extends LivingThing {
    public Frog(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    public void breathe() {
        System.out.println(" Dog is breathing");
        breatheImplementor.breathe();
    }
}
