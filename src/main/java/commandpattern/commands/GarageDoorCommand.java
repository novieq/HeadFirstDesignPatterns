package commandpattern.commands;

import commandpattern.vendorclasses.GarageDoor;

public class GarageDoorCommand implements Command{
    GarageDoor garageDoor;
    public GarageDoorCommand (GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        garageDoor.garageDoorOpen();
        
    }


}
