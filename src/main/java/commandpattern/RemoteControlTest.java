package commandpattern;

import commandpattern.commands.LightOnCommand;
import commandpattern.vendorclasses.Light;

public class RemoteControlTest {
    public static void main(String args[]) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand  lightOnCommand = new LightOnCommand(light);
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonPressed();
    }
}
