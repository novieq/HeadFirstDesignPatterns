package commandpattern.commands;

import commandpattern.vendorclasses.Light;

public class LightOffCommand implements Command{
    Light light;
    public LightOffCommand (Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.Off();
    }

}
