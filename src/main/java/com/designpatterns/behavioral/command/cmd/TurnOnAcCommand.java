package com.designpatterns.behavioral.command.cmd;

import com.designpatterns.behavioral.command.receiver.AirConditioner;

public class TurnOnAcCommand implements ICommand{

    private AirConditioner airConditioner;

    public TurnOnAcCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOnAc();
    }
}
