package com.designpatterns.behavioral.command.command;

import com.designpatterns.behavioral.command.receiver.AirConditioner;

public class TurnOffAcCommand implements ICommand{

    private AirConditioner airConditioner;

    public TurnOffAcCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOffAc();
    }
}
