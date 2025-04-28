package com.designpatterns.behavioral.command.cmd;

import com.designpatterns.behavioral.command.receiver.AirConditioner;

public class SetTemperatureCommand implements ICommand {

    private AirConditioner airConditioner;
    private int temperature;

    public SetTemperatureCommand (AirConditioner airConditioner, int temperature){
        this.airConditioner = airConditioner;
        this.temperature = temperature;
    }
    @Override
    public void execute() {
        airConditioner.setTemperature(temperature);
    }
}
