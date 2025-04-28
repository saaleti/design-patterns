package com.designpatterns.behavioral.command;

import com.designpatterns.behavioral.command.command.ICommand;
import com.designpatterns.behavioral.command.command.SetTemperatureCommand;
import com.designpatterns.behavioral.command.command.TurnOffAcCommand;
import com.designpatterns.behavioral.command.command.TurnOnAcCommand;
import com.designpatterns.behavioral.command.invoker.RemoteControl;
import com.designpatterns.behavioral.command.receiver.AirConditioner;

public class CommandPatternTestDrive {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        AirConditioner airConditioner = new AirConditioner();

        // Turn on AC Command
        ICommand turnOnAcCommand = new TurnOnAcCommand(airConditioner);
        remoteControl.setCurrentCommand(turnOnAcCommand);
        remoteControl.pressButton();

        // Set temperature command to 20

        ICommand setTemperatureCommand = new SetTemperatureCommand(airConditioner, 20);
        remoteControl.setCurrentCommand(setTemperatureCommand);
        remoteControl.pressButton();

        // Set temperature command to 18

        ICommand setTemperatureCommand2 = new SetTemperatureCommand(airConditioner, 18);
        remoteControl.setCurrentCommand(setTemperatureCommand2);
        remoteControl.pressButton();

        // Undo
        remoteControl.undo();

        // Turn off AC command

        ICommand turnOffAcCommand = new TurnOffAcCommand(airConditioner);
        remoteControl.setCurrentCommand(turnOffAcCommand);
        remoteControl.pressButton();


    }
}
