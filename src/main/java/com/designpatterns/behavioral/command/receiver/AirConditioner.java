package com.designpatterns.behavioral.command.receiver;

public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public void turnOnAc() {
        System.out.println("Turning on the AC");
        this.isOn = true;
        setDefaultTemperature();
    }

    public void turnOffAc() {
        System.out.println("Turning off the AC");
        this.isOn = false;
    }

    public void setTemperature(int temperature) {
        System.out.println("Setting the temperature to :"+ temperature);
        this.temperature = temperature;
    }

    public void setDefaultTemperature(){
        System.out.println("Setting the default temperature to :"+ 25);
        this.temperature = 25;
    }

}
