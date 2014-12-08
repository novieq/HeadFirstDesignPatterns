package commandpattern;

import commandpattern.commands.Command;
import commandpattern.commands.GarageDoorCloseCommand;
import commandpattern.commands.GarageDoorOpenCommand;
import commandpattern.commands.LightOffCommand;
import commandpattern.commands.LightOnCommand;
import commandpattern.commands.MacroCommand;
import commandpattern.vendorclasses.GarageDoor;
import commandpattern.vendorclasses.Light;

public class RemoteControlTest {
    public static void main(String args[]) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Command  lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.onButtonPressed(0);
        remoteControl.offButtonPressed(0);
        
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        
        remoteControl.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.onButtonPressed(1);
        remoteControl.offButtonPressed(1);
        
        Command[] commands = {lightOnCommand, lightOffCommand};
        MacroCommand macroCommand = new MacroCommand(commands);
        macroCommand.execute();
        
    }
}
