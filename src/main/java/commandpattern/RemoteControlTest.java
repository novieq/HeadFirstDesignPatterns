package commandpattern;

import commandpattern.commands.GarageDoorCommand;
import commandpattern.commands.LightOnCommand;
import commandpattern.vendorclasses.GarageDoor;
import commandpattern.vendorclasses.Light;

public class RemoteControlTest {
    public static void main(String args[]) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand  lightOnCommand = new LightOnCommand(light);
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonPressed();
        
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorCommand garageDoorCommand = new GarageDoorCommand(garageDoor);
        remoteControl.setCommand(garageDoorCommand);
        remoteControl.buttonPressed();
    }
}
