package com.designpatterns.behavioral.command.invoker;

import com.designpatterns.behavioral.command.cmd.ICommand;

public class RemoteControl {

    /**
     * Note: In this implementation, the RemoteControl is responsible for maintaining the history of commands, rather than delegating this responsibility to the AirConditioning System.
     * This ensures a clear separation of concerns, with the AirConditioning System focusing solely on executing actions, while the RemoteControl manages the command history.
     */
    private ICommand previousCommand;

    private ICommand currentCommand;

    public void setCurrentCommand(ICommand command) {
        this.previousCommand = this.currentCommand;
        this.currentCommand = command;
    }

    public void pressButton() {
        if (currentCommand != null) {
            currentCommand.execute();
        }
    }

    public void undo() {
        if (previousCommand != null) {
            previousCommand.execute();
        }
    }

}
