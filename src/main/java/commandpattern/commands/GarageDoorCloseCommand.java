package commandpattern.commands;

import commandpattern.vendorclasses.GarageDoor;

public class GarageDoorCloseCommand implements Command{
    GarageDoor garageDoor;
    public GarageDoorCloseCommand (GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        garageDoor.garageDoorClose();
        
    }


}
