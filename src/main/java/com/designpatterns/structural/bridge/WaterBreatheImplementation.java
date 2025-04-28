package com.designpatterns.structural.bridge;

public class WaterBreatheImplementation implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Inhale Oxygen through Gills");
        System.out.println("Exhale Co2");
    }
}
