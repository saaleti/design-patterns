package com.designpatterns.structural.bridge;

public class BridgePatternTestDrive {
    public static void main(String[] args) {
        /**
         * Here Frog can take any Breathing implementation of its choice.
         *
         * Without bridge patten, Frog will always have a single breathing implementation via Inheritance.
         */
        LivingThing livingThing = new Frog(new LandBreathImplementation());
        LivingThing livingThing2 = new Frog(new WaterBreatheImplementation());
        livingThing.breathe();
        livingThing2.breathe();
    }
}
