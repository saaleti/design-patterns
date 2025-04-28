package com.designpatterns.structural.bridge;

public abstract class LivingThing {
    BreatheImplementor breatheImplementor;

    public void breathe() {
        breatheImplementor.breathe();
    }
}
