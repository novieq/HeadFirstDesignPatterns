package commandpattern;

import commandpattern.commands.Command;

public class RemoteControl {
    Command command;
    public RemoteControl() {
        
    }
    public void setCommand(Command command) {
        this.command = command;
    }
    public void buttonPressed() {
        this.command.execute();
    }
}
