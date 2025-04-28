package com.designpatterns.structural.bridge;

public class LandBreathImplementation implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Inhale Oxygen through nose");
        System.out.println("Exhale Co2");
    }
}
